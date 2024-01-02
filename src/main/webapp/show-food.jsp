<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<h1 align="center">Menu</h1>
	<hr>
	<table border=1 cellpadding="30%" align="center" bordercolor="red">
		<tr>
			<td>Code	
			<td>Item	
			<td>Price	
		</tr>
		<c:forEach var="items" items="${foodItems}">
			<tr>
				<td>${items.id}	
				<td>${items.item}	
				<td>${items.price}	
			</tr>
		</c:forEach>
	</table>
</body>
</html>