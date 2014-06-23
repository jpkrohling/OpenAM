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

package org.forgerock.openam.scripting;

import com.sun.phobos.script.javascript.RhinoScriptEngineFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.script.Bindings;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import static org.fest.assertions.Assertions.assertThat;

public class StandardScriptEvaluatorTest {

    private StandardScriptEvaluator testEvaluator;
    private ScriptEngineManager scriptEngineManager;

    @BeforeMethod
    public void createTestEvaluator() {
        this.scriptEngineManager = new ScriptEngineManager();
        // Use our bundled Rhino engine for tests
        scriptEngineManager.registerEngineName(SupportedScriptingLanguage.JAVASCRIPT_ENGINE_NAME,
                new RhinoScriptEngineFactory());
        this.testEvaluator = new StandardScriptEvaluator(scriptEngineManager);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void shouldRejectNullScriptEngineManager() {
        new StandardScriptEvaluator(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void shouldRejectNullVariableNames() {
        testEvaluator.bindVariableInGlobalScope(null, "value");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void shouldRejectNullVariableValues() {
        testEvaluator.bindVariableInGlobalScope("test", null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldRejectEmptyVariableNames() {
        testEvaluator.bindVariableInGlobalScope("", "value");
    }

    @Test
    public void shouldBindVariablesInGlobalScope() {
        // Given
        String name = "aTestVariable";
        Object value = "Some test object";

        // When
        testEvaluator.bindVariableInGlobalScope(name, value);

        // Then
        Object result = scriptEngineManager.get(name);
        assertThat(result).isNotNull().isEqualTo(value);
    }

    @Test
    public void shouldEvaluateSimpleScripts() throws Exception {
        // Given
        ScriptObject script = getJavascript("3 * 4");

        // When
        Number result = testEvaluator.evaluateScript(script, null);

        // Then
        assertThat(result.intValue()).isEqualTo(12);
    }

    @Test
    public void shouldExposeGlobalVariables() throws Exception {
        // Given
        String varName = "testVar";
        String value = "a test value";
        ScriptObject script = getJavascript(varName);

        // When
        testEvaluator.bindVariableInGlobalScope(varName, value);
        String result = testEvaluator.evaluateScript(script, null);

        // Then
        assertThat(result).isEqualTo(value);
    }

    @Test
    public void shouldExposeScriptVariables() throws Exception {
        // Given
        String varName = "scriptVar";
        String value = "a script value";
        Bindings bindings = new SimpleBindings();
        bindings.put(varName, value);
        ScriptObject script = getJavascript(varName, bindings);

        // When
        String result = testEvaluator.evaluateScript(script, null);

        // Then
        assertThat(result).isEqualTo(value);
    }

    @Test
    public void shouldExposeParameterVariables() throws Exception {
        // Given
        String varName = "paramVar";
        String value = "a parameter value";
        Bindings bindings = new SimpleBindings();
        bindings.put(varName, value);
        ScriptObject script = getJavascript(varName);

        // When
        String result = testEvaluator.evaluateScript(script, bindings);

        // Then
        assertThat(result).isEqualTo(value);
    }

    @Test
    public void shouldOverrideGlobalVariablesWithScriptVariables() throws Exception {
        // Given
        String varName = "testVar";
        String globalValue = "global value";
        String scriptValue = "script value";
        testEvaluator.bindVariableInGlobalScope(varName, globalValue);
        Bindings bindings = new SimpleBindings();
        bindings.put(varName, scriptValue);
        ScriptObject script = getJavascript(varName, bindings);

        // When
        String result = testEvaluator.evaluateScript(script, null);

        // Then
        assertThat(result).isEqualTo(scriptValue);
    }

    @Test
    public void shouldOverrideScriptVariablesWithParameterVariables() throws Exception {
        // Given
        String varName = "testVar";
        String paramValue = "param value";
        String scriptValue = "script value";
        Bindings scriptBindings = new SimpleBindings();
        scriptBindings.put(varName, scriptValue);
        ScriptObject script = getJavascript(varName, scriptBindings);
        Bindings paramBindings = new SimpleBindings();
        paramBindings.put(varName, paramValue);

        // When
        String result = testEvaluator.evaluateScript(script, paramBindings);

        // Then
        assertThat(result).isEqualTo(paramValue);

    }

    /**
     * Ensure that binding scopes are passed by reference to the script engine so that any changes made by the script
     * are reflected in the final state of the bindings passed in.
     */
    @Test
    public void shouldPassBindingsByReference() throws Exception {
        // Given
        String varName = "state";
        Bindings scope = new SimpleBindings();
        scope.put(varName, "initial");
        String expected = "expected";
        ScriptObject script = getJavascript(varName + " = '" + expected + "'");

        // When
        testEvaluator.evaluateScript(script, scope);

        // Then
        assertThat(scope.get(varName)).isEqualTo(expected);
    }

    @Test
    public void shouldSupportGroovyScripts() throws Exception {
        // Given
        String varName = "state";
        String expected = "expected";
        ScriptObject groovyScript = getGroovyScript(varName + " = \"" + expected + "\"");
        Bindings scope = new SimpleBindings();
        scope.put(varName, "initial");

        // When
        testEvaluator.evaluateScript(groovyScript, scope);

        // Then
        assertThat(scope.get(varName)).isEqualTo(expected);
    }

    private ScriptObject getJavascript(String script) {
        return getJavascript(script, null);
    }

    private ScriptObject getJavascript(String script, Bindings bindings) {
        final ScriptingLanguage language = SupportedScriptingLanguage.JAVASCRIPT;
        final String name = "test script";

        return new ScriptObject(name, script, language, bindings);
    }

    private ScriptObject getGroovyScript(String script) {
        return new ScriptObject("groovyTest", script, SupportedScriptingLanguage.GROOVY, null);
    }
}
