<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= request.getParameter("id") %><br>
	<%= request.getParameter("pw") %><br>
	<%= request.getParameter("email") %><br>
</body>
</html>