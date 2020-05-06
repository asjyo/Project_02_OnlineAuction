<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>

<h3><a href="sellerhomepage.jsp">Seller Home</h3></a>
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
<a href="Winner.action">Winner</a>
	<h2>Auction Report</h2>  
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>#</th>
						<th>Auction Amount</th>
						<th>Name</th>
						<th>Bidder's Email</th>
						<th>Phone</th>
						<th>Postal Address</th>
						<th>Product Name</th>
						<th>Model</th>
						
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="b_id" /></td>
						<td><s:property value="b_auction_price" /></td>
						<td><s:property value="b_name" /></td>
						<td><s:property value="b_email" /></td>
						<td><s:property value="b_phone" /></td>
						<td><s:property value="b_postal_address" /></td>
						<td><s:property value="b_item_name" /></td>
						<td><s:property value="b_item_model" /></td>
		<!-- 				<td>
							<a href="updatedetails.action?submitType=updatedata&uemail=<s:property value="uemail"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?uemail=<s:property value="uemail"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td> -->
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