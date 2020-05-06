<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Register</title>
<style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>
</head>
<body>

<a href="viewrecords_customer.action">Product List</a>
	<h2>Register Bid Details</h2>
	

	<s:form action="Register">
		<s:textfield name="b_item_name" label="Product Name" required="required"></s:textfield> 
<s:textfield name="b_item_model" label="Model" required="required"></s:textfield> 
<s:textfield name="b_name" label="Name" required="required"></s:textfield> 
<s:textfield name="b_email" label="Bidder's Email" required="required"></s:textfield>   
<s:textfield name="b_phone" label="Phone"></s:textfield> 
<s:textfield name="b_postal_address" label="Postal Address"></s:textfield> 
 <s:textfield name="b_auction_price" label="Bid Amount"></s:textfield> 
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

