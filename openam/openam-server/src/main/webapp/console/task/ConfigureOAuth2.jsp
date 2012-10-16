<%--
  Created by IntelliJ IDEA.
  User: jasonl
  Date: 10/15/12
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page info="ConfigureOAuth2" language="java" %>
<%@taglib uri="/WEB-INF/jato.tld" prefix="jato" %>
<%@taglib uri="/WEB-INF/cc.tld" prefix="cc" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jato:useViewBean
        className="com.sun.identity.console.task.ConfigureOAuth2ViewBean"
        fireChildDisplayEvents="true" >

<cc:i18nbundle baseName="amConsole" id="amConsole"
               locale="<%=((com.sun.identity.console.base.AMViewBeanBase)viewBean).getUserLocale()%>"/>

<cc:header name="hdrCommon" pageTitle="webconsole.title" bundleID="amConsole" copyrightYear="2008" fireDisplayEvents="true">

    <link rel="stylesheet" type="text/css" href="../console/css/openam.css" />
    <script language="javascript" src="../console/js/am.js"></script>
    <script language="javascript" src="../console/js/tasksPage.js"></script>
    <script language="javascript" src="../com_sun_web_ui/js/dynamic.js"></script>

    <div id="main" style="position: absolute; margin: 0; border: none; padding: 0; width:auto; height:101%;">
    <div id="divhelp" style="display: none; position:absolute; margin: 0; border: 1px solid #AABCC8; padding: 0; width:400px; height:200px; background:#FCFCFC">
        <table border=0 cellpadding=2 cellspacing=0 width="100%">
            <tr><td width=99%><span id="divHelpmsg" /></td>
                <td width="1%" valign="top">
                    <img src="../console/images/tasks/close.gif" width="16" height="16" onClick="hideHelp()" />
                </td>
            </tr>
        </table>
    </div>

    <cc:form name="ConfigureOAuth2" method="post">
        <jato:hidden name="szCache" />
        <script language="javascript">
            function confirmLogout() {
                return confirm("<cc:text name="txtLogout" defaultValue="masthead.logoutMessage" bundleID="amConsole"/>");
            }

            function cancelOp() {
                document.location.replace("../task/Home");
                return false;
            }

        </script>

        <cc:primarymasthead name="mhCommon" bundleID="amConsole"  logoutOnClick="return confirmLogout();" locale="<%=((com.sun.identity.console.base.AMViewBeanBase)viewBean).getUserLocale()%>"/>
        <table border="0" cellpadding="10" cellspacing="0" width="100%">
            <tr>
                <td>
                    <cc:alertinline name="ialertCommon" bundleID="amConsole" />
                </td>
            </tr>
        </table>

        <%-- PAGE CONTENT --------------------------------------------------------- --%>
        <cc:pagetitle name="pgtitle" bundleID="amConsole" pageTitleText="page.title.configure.oauth2" showPageTitleSeparator="true" viewMenuLabel="" pageTitleHelpMessage="" showPageButtonsTop="true" showPageButtonsBottom="false" />

        <table border="0" cellpadding="20" cellspacing="0">
            <tr><td>
                <cc:text name="txtDesc" defaultValue="page.desc.configure.oauth2" bundleID="amConsole" />
            </td></tr>
        </table>


        <cc:propertysheet name="propertyAttributes" bundleID="amConsole" showJumpLinks="false"/>

    </cc:form>
</cc:header>
</div>
<div id="dlg" class="dvs" style="width:600px; height: 225px; margin-left:-300px"></div>

<script language="javascript">

var msgCreating = "<p><img src=\"../console/images/processing.gif\" width=\"66\" height\"66\"/></p><cc:text name="txtConfiguring" defaultValue="creating.fedlet.waiting" bundleID="amConsole" escape="false" />";
var ttlCreated = "<h3><cc:text name="txtTtlCreated" defaultValue="fedlet.created.title" escape="false" bundleID="amConsole" /></h3>";
var msgCreated = "<p>&nbsp;</p><input name=\"btnOK\" type=\"submit\" class=\"Btn1\" value=\"<cc:text name="txtOKBtn" defaultValue="ajax.ok.button" bundleID="amConsole" />\" onClick=\"document.location.replace(\'../task/Home\');return false;\" /></div></p>";
var closeBtn = "<p>&nbsp;</p><p><div class=\"TtlBtnDiv\"><input name=\"btnClose\" type=\"submit\" class=\"Btn1\" value=\"<cc:text name="txtCloseBtn" defaultValue="ajax.close.button" bundleID="amConsole" />\" onClick=\"focusMain();return false;\" /></div></p>";

var frm = document.forms['CreateFedlet'];
var btn1 = frm.elements['CreateFedlet.button1'];
btn1.onclick = submitPage;
var btn2 = frm.elements['CreateFedlet.button2'];
btn2.onclick = cancelOp;
var ajaxObj = getXmlHttpRequestObject();
var userLocale = "<%= viewBean.getUserLocale().toString() %>";

function submitPage() {
    document.getElementById('dlg').style.top = '300px';
    fade();
    document.getElementById('dlg').innerHTML = '<center>' +
            msgCreating + '</center>';
    var url = "../console/ajax/AjaxProxy.jsp";
    var params = 'locale=' + userLocale +
            '&class=com.sun.identity.workflow.CreateFedlet' + getData();
    ajaxPost(ajaxObj, url, params, configured);
    return false;
}

</script>

</jato:useViewBean>
