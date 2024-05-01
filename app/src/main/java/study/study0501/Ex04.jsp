<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 4. JSP에서 반복문(for 또는 while) 사용하기 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<% 
			for(int i=1; i<=5; i++) {
			       out.println("<li>" + "item " + i + "</li>");
		   }
		%>
	</ul>
</body>
</html>