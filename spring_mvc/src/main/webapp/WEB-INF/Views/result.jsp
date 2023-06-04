<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		${Header}
	</h1> 
	<%
		Integer res = (Integer)request.getAttribute("res");
	%>
	<h1>Add Result = <%= res %></h1>
</body>
</html>