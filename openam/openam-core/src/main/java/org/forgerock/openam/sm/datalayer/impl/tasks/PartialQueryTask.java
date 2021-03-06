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
 * Copyright 2014-2015 ForgeRock AS.
 */
package org.forgerock.openam.sm.datalayer.impl.tasks;


import org.forgerock.openam.cts.api.filter.TokenFilter;
import org.forgerock.openam.sm.datalayer.api.DataLayerRuntimeException;
import org.forgerock.openam.sm.datalayer.api.query.FilterConversion;
import org.forgerock.openam.sm.datalayer.impl.ldap.LdapFilterConversion;
import org.forgerock.openam.sm.datalayer.api.query.PartialToken;
import org.forgerock.openam.sm.datalayer.api.query.QueryFactory;
import org.forgerock.openam.sm.datalayer.api.DataLayerException;
import org.forgerock.openam.sm.datalayer.api.ResultHandler;
import org.forgerock.openam.sm.datalayer.api.Task;
import org.forgerock.openam.sm.datalayer.api.TokenStorageAdapter;
import org.forgerock.opendj.ldap.Filter;
import org.forgerock.util.Reject;

import java.text.MessageFormat;
import java.util.Collection;

/**
 * Performs a partial query against LDAP. Partial queries operate like normal queries
 * except that the results are not full Token instances. Instead they are a collection
 * of Name/Value pairs which represent a subset of a Token.
 *
 * @see QueryTask
 */
public class PartialQueryTask<T, F> implements Task {
    private final ResultHandler<Collection<PartialToken>, ?> handler;
    private final TokenFilter tokenFilter;
    private final QueryFactory<T, F> factory;
    private final FilterConversion<F> conversion;

    /**
     * @param factory Non null.
     * @param conversion Non null.
     * @param tokenFilter Non null and must define at least one Return Attribute.
     * @param handler Non null, required for asynchronous response.
     */
    public PartialQueryTask(QueryFactory<T, F> factory, FilterConversion<F> conversion,
                            TokenFilter tokenFilter, ResultHandler<Collection<PartialToken>, ?> handler) {
        this.factory = factory;
        this.conversion = conversion;
        this.handler = handler;
        this.tokenFilter = tokenFilter;
    }

    /**
     *
     * @param connection Connection to use.
     * @param adapter Utility functions to perform the task with.
     * @throws DataLayerException
     * @throws IllegalArgumentException If the TokenFilter did not define any return fields.
     */
    @Override
    public <C> void execute(C connection, TokenStorageAdapter<C> adapter) throws DataLayerException {
        Reject.ifTrue(tokenFilter.getReturnFields().isEmpty());

        F filter = conversion.convert(tokenFilter);
        // Perform the query.
        try {
            handler.processResults(factory.createInstance()
                    .withFilter(filter)
                    .returnTheseAttributes(tokenFilter.getReturnFields())
                    .executeAttributeQuery((T) connection).next());
        } catch (DataLayerRuntimeException e) {
            handler.processError(e);
            throw new DataLayerException("Failure during filter execution", e);
        }
    }

    @Override
    public String toString() {
        return MessageFormat.format("PartialQueryTask: {0}", tokenFilter);
    }
}
