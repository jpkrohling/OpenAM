/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */

package org.forgerock.openam.sm.datalayer.impl.ldap;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.forgerock.guice.core.InjectorHolder;
import org.forgerock.openam.cts.api.tokens.Token;
import org.forgerock.openam.cts.impl.LdapAdapter;
import org.forgerock.openam.cts.utils.LdapTokenAttributeConversion;
import org.forgerock.openam.sm.ConnectionConfig;
import org.forgerock.openam.sm.datalayer.api.ConnectionFactory;
import org.forgerock.openam.sm.datalayer.api.ConnectionType;
import org.forgerock.openam.sm.datalayer.api.DataLayer;
import org.forgerock.openam.sm.datalayer.api.DataLayerConnectionModule;
import org.forgerock.openam.sm.datalayer.api.DataLayerConstants;
import org.forgerock.openam.sm.datalayer.api.TaskExecutor;
import org.forgerock.openam.sm.datalayer.api.TokenStorageAdapter;
import org.forgerock.openam.sm.datalayer.api.query.FilterConversion;
import org.forgerock.openam.sm.datalayer.api.query.PartialToken;
import org.forgerock.openam.sm.datalayer.api.query.QueryFactory;
import org.forgerock.openam.sm.datalayer.impl.PooledTaskExecutor;
import org.forgerock.openam.sm.datalayer.providers.ConnectionFactoryProvider;
import org.forgerock.openam.sm.datalayer.providers.DataLayerConnectionFactoryCache;
import org.forgerock.openam.sm.datalayer.providers.LdapConnectionFactoryProvider;

import com.google.inject.Key;
import com.google.inject.PrivateBinder;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;
import com.google.inject.util.Types;

/**
 * An abstract LDAP set of configuration.
 */
public abstract class LdapDataLayerConnectionModule extends DataLayerConnectionModule {

    private final Class<? extends TaskExecutor> executorType;

    protected LdapDataLayerConnectionModule(Class<? extends TaskExecutor> executorType, boolean exposesQueueConfiguration) {
        super(executorType != null, exposesQueueConfiguration);
        this.executorType = executorType;
    }

    protected LdapDataLayerConnectionModule() {
        super(true, false);
        this.executorType = PooledTaskExecutor.class;
    }

    @Override
    protected void configureConnections(PrivateBinder binder) {
        binder.bind(QueryFactory.class).to(LdapQueryFactory.class);
        binder.bind(LdapTokenAttributeConversion.class);
        binder.bind(LdapSearchHandler.class);
        binder.bind(EntryPartialTokenConverter.class);
        binder.bind(EntryTokenConverter.class);
        binder.bind(LdapQueryBuilder.class);
        binder.bind(LdapQueryFactory.class);
        binder.bind(LdapQueryFilter.class);
        binder.bind(ConnectionConfig.class).annotatedWith(Names.named(DataLayerConstants.EXTERNAL_CONFIG))
                .toProvider(ExternalConnectionConfigProvider.class);
        binder.bind(ConnectionFactoryProvider.class).to(LdapConnectionFactoryProvider.class);
        binder.bind(FilterConversion.class).to(LdapFilterConversion.class);
        binder.bind(ConnectionFactory.class).toProvider(getConnectionFactoryProviderType());

        MapBinder<Class, EntryConverter> entryConverterBinder = MapBinder.newMapBinder(binder, Class.class,
                EntryConverter.class);
        entryConverterBinder.addBinding(String.class).to(EntryStringConverter.class);
        entryConverterBinder.addBinding(PartialToken.class).to(EntryPartialTokenConverter.class);
        entryConverterBinder.addBinding(Token.class).to(EntryTokenConverter.class);

        binder.bind(LdapDataLayerConfiguration.class).to(getLdapConfigurationType()).in(Singleton.class);
        binder.bind(Key.get(LdapDataLayerConfiguration.class, DataLayer.Types.typed(connectionType)))
                .toProvider(binder.getProvider(LdapDataLayerConfiguration.class));
        binder.expose(Key.get(LdapDataLayerConfiguration.class, DataLayer.Types.typed(connectionType)));
    }

    protected abstract Class<? extends LdapDataLayerConfiguration> getLdapConfigurationType();

    /**
     * Returns the provider of {@link org.forgerock.openam.sm.datalayer.api.ConnectionFactory}. The default is to use
     * {@link org.forgerock.openam.sm.datalayer.providers.DataLayerConnectionFactoryCache}.
     * @return
     */
    protected Class<? extends javax.inject.Provider<ConnectionFactory>> getConnectionFactoryProviderType() {
        return DataLayerConnectionFactoryCache.class;
    }

    @Override
    protected void configureTaskExecutor(PrivateBinder binder) {
        if (executorType != null) {
            binder.bind(TokenStorageAdapter.class).to(LdapAdapter.class);
            binder.bind(TaskExecutor.class).to(executorType);
        }
    }

    private static final class ExternalConnectionConfigProvider implements Provider<ConnectionConfig> {
        private final LdapDataLayerConfiguration configuration;
        private final ExternalLdapConfig externalConfig;

        @Inject
        public ExternalConnectionConfigProvider (ExternalLdapConfig externalConfig, LdapDataLayerConfiguration configuration) {
            this.externalConfig = externalConfig;
            this.configuration = configuration;
        }

        public ConnectionConfig get() {
            externalConfig.update(configuration);
            return externalConfig;
        }
    }

}
