<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>test 01 page </h2>
	<h2>${name}</h2>
	<h2>${age gt 10}</h2>
<!--	<h2>${requestScope.name}</h2>
	<h2>${requestScope.age}</h2>  -->
	
	<h2>${sessionScope.name }</h2>
	<h2>${sessionScope.age }</h2>
	
	<h4>${param.abc }</h4>
	<h4>${empty hahaha }</h4>
	<h4>위에 찍혔니?	</h4>
	
	<h4>${arr[0]} 	</h4>

	<%-- http://localhost:8080/day04/test01?abc=123 --%>
	<%-- 값이 없거나 null인 경우는 화면에 출력안됌 --%>
	
	<h4>요청 uri : ${pageContext.request.requestURI}</h4>

	
</body>
</html>