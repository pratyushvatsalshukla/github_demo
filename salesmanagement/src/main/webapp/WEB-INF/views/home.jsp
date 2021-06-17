<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			${msg}
			
		<form:form action="save" method="POST" modelAttribute="product">
		code: <form:input path="code"/><br>
		Name: <form:input path="pname"/><br>
		<input type="submit" value="save"/>
		
		</form:form>	
</body>
</html>