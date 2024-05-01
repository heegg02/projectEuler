<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 2. JSP에서 아래의 변수를 만들어서 사용하기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String name = "John";
	%>
	<% out.println("Hello, "+ name); %>
</body>
</html>