<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome doctor ${name}</h1>
	<br>
	<br>
	<a href="./alldoctors">get All doctors details</a>
	<br>
	<br>

	<table>
		<tr>
			<th>doctor id</th>
			<th>doctor name</th>
			<th>doctor specialization</th>
		<tr>
			<c:forEach items="${list }" var="doct">
				<tr>
					<td><c:out value="${doct.did }" /></td>
					<td><c:out value="${doct.dname }" /></td>
					<td><c:out value="${doct.specialization }" /></td>
					<td><a href="./delete?id=${doct.did }">delete</a>
					<td><a href="./modify?doct=${doct }">modify</a>
				</tr>
			</c:forEach>
	</table>
</body>
</html>