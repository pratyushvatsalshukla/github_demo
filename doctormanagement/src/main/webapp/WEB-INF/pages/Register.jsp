<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Registration Page</h1>
		
		<form:form method="get" action="save" modelAttribute="doctor"><br><br>
		Dept id: <form:input path="did"/><br><br>
		Doctor Name: <form:input path="dname"/><br><br>
		specialization: <form:input path="specialization"/><br><br>
		
		<input type="submit" value="Register">
		
		</form:form>
		
		
		
		${msg}
</body>
</html>