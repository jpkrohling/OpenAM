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
 * information: "Portions Copyrighted [year] [name of copyright owner]".
 *
 * Copyright 2013 ForgeRock AS. All rights reserved.
 */

package org.forgerock.openam.auth.shared;

import com.sun.identity.authentication.service.AuthUtils;

/**
 * Wrapper class around AuthUtils to facilitate testing.
 *
 * @author Phill Cunnington
 */
public class AuthUtilsWrapper {

    /**
     * Gets the cookie name from System Properties.
     *
     * @return The AM Cookie Name.
     */
    public String getCookieName() {
        return AuthUtils.getCookieName();
    }
}
