<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<title>Report</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
<h3><a href="home.jsp">Home</a></h3>
	<h2>Product List </h2>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Product Name</th>
						<th>Model</th>
						<th>Are you ready to Bid?</th>
					
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="item_model" /></td>
						<td><s:property value="item_name" /></td>
						<td><a href="biddetails.jsp">Bid</a></td>
					</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
	</div>
</body>
</html>