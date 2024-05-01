<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 6. JSP에서 아래의 함수(메소드) 정의하고 호출하기 -->
<%!
	public int add(int a, int b) {
	    return a + b;
	} 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	result = <%= add(3, 5) %>
</body>
</html>