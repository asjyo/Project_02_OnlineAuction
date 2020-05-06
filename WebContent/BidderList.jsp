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
<h4><a href="ProductListSellerView.action">Back</a></h4><br>
<h2>Bidder List</h2>
<!-- <mark>Note: Please note down the item name & model to enter into the next page</mark> -->

<s:form action="BidderList.action">  
<s:iterator  value="list"> 

<fieldset>  
<s:property value="b_item_name" />|<s:property value="b_auction_price" />|<s:property value="b_name" />|<s:property value="b_email" />|<s:property value="b_phone" />|<s:property value="b_postal_address" />|
</fieldset> 
</s:iterator> 
</s:form>
</body>
</html>


