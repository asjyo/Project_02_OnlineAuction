<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register</title>
</head>
<body>
<h3><a href="sellerhomepage.jsp">Seller Home</h3></a>
	<h2>Add Product</h2>
	
	<s:form action="RegisterProduct.action">
		<s:textfield label="Product Name"  required="required" name="item_name" />
		<s:textfield label="Model" required="required" name="item_model" />
		<s:textfield label="Is Display" name="item_display" />
		
		<!--<s:submit cssClass="button-register" value="Add Product" /> -->
		<s:submit cssClass="button-register" value="Resgister" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>



 
 

