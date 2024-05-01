<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 7. JSP에서 HTML 폼(form) 사용하기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Ex07_2.jsp" method="post">
		<input type="text" name="id">
		<input type="text" name="pw">
		<input type="email" name="email">
		<input type="submit">
	</form>
</body>
</html>