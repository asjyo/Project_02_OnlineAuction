<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table><tr><td><a href="home.jsp">Home</a></td></tr></table> <br><br>
<s:form action="loginprocess">  
<s:textfield name="username" label="User Name" required="required"></s:textfield> 
<s:textfield name="userpass" label="Password" required="required"></s:textfield> 

<s:submit cssClass="button-register" value="Resgister" />

</s:form>  
</body>
</html>