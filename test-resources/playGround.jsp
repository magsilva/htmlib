<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm" %>
<f:loadBundle basename="resources" var="msg" />
<html>
	<head>
		<title></title>
	</head>
	<body>
		<f:view>
		<f:subview id="subv">
			<h:panelGrid columns="2" rendered="true" border="1">
				<htm:b style="color:green"  rendered="true">
					<h:outputText value="Hello B component"/>
				</htm:b>
				<htm:font size="40">
					<htm:code>
						<h:outputText value="#{msg.abc}"/>
					</htm:code>
				</htm:font>
			</h:panelGrid>
			</f:subview>	
			<htm:table cellspacing="0" cellpadding="0" border="1">
				<htm:tr>
					<htm:td><f:verbatim>Hello</f:verbatim></htm:td>
				</htm:tr>
			</htm:table>		
		</f:view>
	</body>	
</html>  
