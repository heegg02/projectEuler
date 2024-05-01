<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 3. 아래의 조건문을 JSP에서 사용하기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		Boolean weather = false;
		if(weather) {
			out.print("우산을 가져가라");
		} else {
			out.print("우산을 가져가지마라");
		}
	%>
</body>
</html>