<%@page import="com.app.bean.Users"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table width=80% height="20px" border="2">

		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Phone No</th>
		</tr>
		<%
		List<Users> l = (List<Users>) session.getAttribute("users");

		for (Users u : l) {
		%>

		<tr>
			<th><%=u.getName()%></th>
			<th><%=u.getMail()%></th>
			<th><%=u.getMobile()%></th>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>