<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bidder List</title>
</head>
<body>

<!-- <table><tr><td><a href="home.jsp">Home</a> |   <a href="viewrecords_customer.action">View Products</a></td></tr></table> -->
<h4><a href="welcome.jsp">Home</a></h4>

<h2>Bidding Winner</h2>
<!-- <mark>Note: Please note down the item name & model to enter into the next page</mark> -->

<s:form action="winnerlist.action">  
<s:iterator  value="list"> 

<fieldset>  
Winner is: <s:property value="name" /><br>
<s:property value="product_name" />|<s:property value="auction_prize" />|<s:property value="name" />|<s:property value="email" />|<s:property value="phone" />|<s:property value="address" />|
</fieldset> 
</s:iterator> 
</s:form>
</body>
</html>


