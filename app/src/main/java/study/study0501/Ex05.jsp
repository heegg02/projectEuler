<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 5. JSP에서 아래의 배열  선언 후 for문으로 출력하기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<%
		    String[] fruits = {"Apple", "Banana", "Orange"};
		    for (int i = 0; i < fruits.length; i++) {
		        out.println("<li>" + fruits[i] + "</li>");
		    }
		%>
	</ul>
</body>
</html>