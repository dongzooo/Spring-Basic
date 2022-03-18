<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	id :	<%=request.getAttribute("id") %> <br>
	pw :	<%=request.getAttribute("pw") %> <br>
	name :	<%=request.getAttribute("name") %> <br>
	sex :	<%=request.getAttribute("sex") %> <br>
	email :	<%=request.getAttribute("email") %> <br>
	phone :	<%=request.getAttribute("phone") %>

</body>
</html>