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
<h4><a href="home.jsp">Home</a></h4>

<h2>Bidding Winner</h2>
<!-- <mark>Note: Please note down the item name & model to enter into the next page</mark> -->

<s:form action="Winner.action">  
<s:iterator  value="list"> 

<fieldset>  
<s:property value="b_name" />
<%-- <s:property value="b_item_name" />|<s:property value="b_auction_price" />|<s:property value="b_name" />|<s:property value="b_email" />|<s:property value="b_phone" />|<s:property value="b_postal_address" />| --%>
</fieldset> 
</s:iterator> 
</s:form>
</body>
</html>


<%-- <s:property value="product_name" />|<s:property value="#session.item_name"/> |<s:property value="product_model" />|<!--<s:property value="item_display" /> -->| <a href="BiddingUserDetails.jsp">Bid</a> --%>