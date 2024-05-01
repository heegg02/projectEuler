<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 8. JSP에서 예외 처리하기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% 
		try {
			int result = 5 / 1; 
		} catch(Exception e) {
			out.print("오류 발생 : / by zero");
		} 
	%>
</body>
</html>