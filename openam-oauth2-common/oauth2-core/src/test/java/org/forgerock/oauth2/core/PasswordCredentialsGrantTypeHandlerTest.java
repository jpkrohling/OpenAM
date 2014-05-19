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
 * Copyright 2014 ForgeRock AS.
 */

package org.forgerock.oauth2.core;

import org.forgerock.oauth2.core.exceptions.ClientAuthenticationFailedException;
import org.forgerock.oauth2.core.exceptions.InvalidClientException;
import org.forgerock.oauth2.core.exceptions.InvalidGrantException;
import org.forgerock.oauth2.core.exceptions.InvalidRequestException;
import org.forgerock.oauth2.core.exceptions.ServerException;
import org.forgerock.oauth2.core.exceptions.UnauthorizedClientException;
import org.mockito.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

/**
 * @since 12.0.0
 */
public class PasswordCredentialsGrantTypeHandlerTest {

    private PasswordCredentialsGrantTypeHandler grantTypeHandler;

    private ClientAuthenticator clientAuthenticator;
    private PasswordCredentialsRequestValidator requestValidator;
    private ResourceOwnerAuthenticator resourceOwnerAuthenticator;
    private OAuth2ProviderSettings providerSettings;
    private TokenStore tokenStore;

    @BeforeMethod
    public void setUp() {

        clientAuthenticator = mock(ClientAuthenticator.class);
        requestValidator = mock(PasswordCredentialsRequestValidator.class);
        List<PasswordCredentialsRequestValidator> requestValidators
                = new ArrayList<PasswordCredentialsRequestValidator>();
        requestValidators.add(requestValidator);
        resourceOwnerAuthenticator = mock(ResourceOwnerAuthenticator.class);
        tokenStore = mock(TokenStore.class);
        OAuth2ProviderSettingsFactory providerSettingsFactory = mock(OAuth2ProviderSettingsFactory.class);

        grantTypeHandler = new PasswordCredentialsGrantTypeHandler(clientAuthenticator, requestValidators,
                resourceOwnerAuthenticator, providerSettingsFactory, tokenStore);

        providerSettings = mock(OAuth2ProviderSettings.class);
        given(providerSettingsFactory.get(Matchers.<OAuth2Request>anyObject())).willReturn(providerSettings);
    }

    @Test
    public void shouldHandle() throws InvalidGrantException, ClientAuthenticationFailedException, ServerException,
            InvalidRequestException, InvalidClientException, UnauthorizedClientException {

        //Given
        OAuth2Request request = mock(OAuth2Request.class);
        ClientRegistration clientRegistration = mock(ClientRegistration.class);
        ResourceOwner resourceOwner = mock(ResourceOwner.class);
        Set<String> validatedScope = new HashSet<String>();
        AccessToken accessToken = mock(AccessToken.class);

        given(clientAuthenticator.authenticate(request)).willReturn(clientRegistration);
        given(clientRegistration.getClientId()).willReturn("CLIENT_ID");
        given(resourceOwnerAuthenticator.authenticate(request)).willReturn(resourceOwner);
        given(resourceOwner.getId()).willReturn("RESOURCE_OWNER_ID");
        given(providerSettings.validateAccessTokenScope(eq(clientRegistration), anySetOf(String.class),
                eq(request))).willReturn(validatedScope);
        given(providerSettings.issueRefreshTokens()).willReturn(false);
        given(tokenStore.createAccessToken(anyString(), anyString(), anyString(), anyString(), anyString(), anyString(),
                anySetOf(String.class), Matchers.<RefreshToken>anyObject(), anyString(), eq(request)))
                .willReturn(accessToken);

        //When
        final AccessToken actualAccessToken = grantTypeHandler.handle(request);

        //Then
        verify(requestValidator).validateRequest(eq(request), Matchers.<ClientRegistration>anyObject());
        verify(providerSettings).additionalDataToReturnFromTokenEndpoint(accessToken, request);
        verify(accessToken, never()).addExtraData(eq("refresh_token"), anyString());
        verify(accessToken, never()).addExtraData(eq("scope"), anyString());
        assertEquals(actualAccessToken, accessToken);
    }

    @Test (expectedExceptions = InvalidGrantException.class)
    public void handleShouldThrowInvalidGrantExceptionWhenResourceOwnerCannotBeVerified() throws InvalidGrantException,
            ClientAuthenticationFailedException, ServerException, InvalidRequestException, InvalidClientException,
            UnauthorizedClientException {

        //Given
        OAuth2Request request = mock(OAuth2Request.class);
        ClientRegistration clientRegistration = mock(ClientRegistration.class);
        ResourceOwner resourceOwner = null;

        given(clientAuthenticator.authenticate(request)).willReturn(clientRegistration);
        given(resourceOwnerAuthenticator.authenticate(request)).willReturn(resourceOwner);

        //When
        grantTypeHandler.handle(request);

        //Then
        // Expect InvalidGrantException
    }

    @Test
    public void shouldHandleAndIssueRefreshToken() throws InvalidGrantException, ClientAuthenticationFailedException,
            ServerException, InvalidRequestException, InvalidClientException, UnauthorizedClientException {

        //Given
        OAuth2Request request = mock(OAuth2Request.class);
        ClientRegistration clientRegistration = mock(ClientRegistration.class);
        ResourceOwner resourceOwner = mock(ResourceOwner.class);
        Set<String> validatedScope = new HashSet<String>();
        RefreshToken refreshToken = mock(RefreshToken.class);
        AccessToken accessToken = mock(AccessToken.class);

        given(clientAuthenticator.authenticate(request)).willReturn(clientRegistration);
        given(clientRegistration.getClientId()).willReturn("CLIENT_ID");
        given(resourceOwnerAuthenticator.authenticate(request)).willReturn(resourceOwner);
        given(resourceOwner.getId()).willReturn("RESOURCE_OWNER_ID");
        given(providerSettings.validateAccessTokenScope(eq(clientRegistration), anySetOf(String.class),
                eq(request))).willReturn(validatedScope);
        given(providerSettings.issueRefreshTokens()).willReturn(true);
        given(tokenStore.createRefreshToken(anyString(), anyString(), anyString(), anyString(), anySetOf(String.class),
                eq(request))).willReturn(refreshToken);
        given(refreshToken.getTokenId()).willReturn("REFRESH_TOKEN_ID");
        given(tokenStore.createAccessToken(anyString(), anyString(), anyString(), anyString(), anyString(), anyString(),
                anySetOf(String.class), Matchers.<RefreshToken>anyObject(), anyString(), eq(request)))
                .willReturn(accessToken);

        //When
        final AccessToken actualAccessToken = grantTypeHandler.handle(request);

        //Then
        verify(requestValidator).validateRequest(eq(request), Matchers.<ClientRegistration>anyObject());
        verify(providerSettings).additionalDataToReturnFromTokenEndpoint(accessToken, request);
        verify(accessToken).addExtraData(eq("refresh_token"), eq("REFRESH_TOKEN_ID"));
        verify(accessToken, never()).addExtraData(eq("scope"), anyString());
        assertEquals(actualAccessToken, accessToken);
    }

    @Test
    public void shouldHandleAndIncludeScopeInAccessToken() throws InvalidGrantException,
            ClientAuthenticationFailedException, ServerException, InvalidRequestException, InvalidClientException,
            UnauthorizedClientException {

        //Given
        OAuth2Request request = mock(OAuth2Request.class);
        ClientRegistration clientRegistration = mock(ClientRegistration.class);
        ResourceOwner resourceOwner = mock(ResourceOwner.class);
        Set<String> validatedScope = Collections.singleton("SCOPE");
        AccessToken accessToken = mock(AccessToken.class);

        given(clientAuthenticator.authenticate(request)).willReturn(clientRegistration);
        given(clientRegistration.getClientId()).willReturn("CLIENT_ID");
        given(resourceOwnerAuthenticator.authenticate(request)).willReturn(resourceOwner);
        given(resourceOwner.getId()).willReturn("RESOURCE_OWNER_ID");
        given(providerSettings.validateAccessTokenScope(eq(clientRegistration), anySetOf(String.class),
                eq(request))).willReturn(validatedScope);
        given(providerSettings.issueRefreshTokens()).willReturn(false);
        given(tokenStore.createAccessToken(anyString(), anyString(), anyString(), anyString(), anyString(), anyString(),
                anySetOf(String.class), Matchers.<RefreshToken>anyObject(), anyString(), eq(request)))
                .willReturn(accessToken);

        //When
        final AccessToken actualAccessToken = grantTypeHandler.handle(request);

        //Then
        verify(requestValidator).validateRequest(eq(request), Matchers.<ClientRegistration>anyObject());
        verify(providerSettings).additionalDataToReturnFromTokenEndpoint(accessToken, request);
        verify(accessToken, never()).addExtraData(eq("refresh_token"), anyString());
        verify(accessToken).addExtraData(eq("scope"), anyString());
        assertEquals(actualAccessToken, accessToken);
    }
}
