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

package com.sun.identity.common;

import org.testng.annotations.Test;

import java.util.Iterator;

import static org.testng.Assert.*;

public class CaseInsensitiveTreeSetTest {

    @Test
    public void test() {
        CaseInsensitiveTreeSet s = new CaseInsensitiveTreeSet();
        s.add("OnE");
        s.add("TWo");
        s.add("thrEE");
        assertTrue(s.contains("one"));
        assertTrue(s.contains("two"));
        assertTrue(s.contains("three"));
        Iterator iter = s.iterator();
        assertEquals(iter.next(), "OnE");
        assertEquals(iter.next(), "thrEE");
        assertEquals(iter.next(), "TWo");
        assertFalse(iter.hasNext());
    }

}