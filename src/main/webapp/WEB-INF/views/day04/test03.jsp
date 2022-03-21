<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix = "fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>test03 page</h3>
	<fmt:requestEncoding value= "utf-8" />
	
	<h4>tv: ${tv }</h4>
	<h4>tv.ch : ${tv.ch }</h4>
	<h4>tv.color : ${tv.color }</h4>
	
	<fmt:formatDate value="${day }"/><br>
	<fmt:formatDate value="${day }" type="date"/><br>
	<fmt:formatDate value="${day }" type="time"/><br>
	<fmt:formatDate value="${day }" type="both"/>
	
	<%-- 출력스타일 미리 지정해놓은 옵션 --%><br>
	<fmt:formatDate value="${day }" type = "both" dateStyle="short"/><br/>
	<fmt:formatDate value="${day }" type = "both" dateStyle="medium"/><br/>
	<fmt:formatDate value="${day }" type = "both" dateStyle="long"/><br/>
	<fmt:formatDate value="${day }" type = "both" dateStyle="full"/><br/>
	<br/>
	<fmt:formatDate value="${day }" type = "both" dateStyle="short" timeStyle="short"/><br/>
	<fmt:formatDate value="${day }" type = "both" dateStyle="medium" timeStyle="medium"/><br/>
	<fmt:formatDate value="${day }" type = "both" dateStyle="long" timeStyle="long"/><br/>
	<fmt:formatDate value="${day }" type = "both" dateStyle="full" timeStyle="full"/><br/>
	
	<%-- 사용자 포멧지정 --%>
	<fmt:formatDate value="${day }" pattern = "yyyy년 mm월 dd일 hh:mm:ss"/><br/>
	
	<%-- **숫자와 관련된** --%>
	<%-- 자릿수 구별 .groupingUsed default가 true --%>
	 <fmt:formatNumber value="10000000" groupingUsed="true"></fmt:formatNumber>	
	 <fmt:formatNumber value="10000000" groupingUsed="false"></fmt:formatNumber>	
	 
	 <%-- 통화 --%>
	 <fmt:formatNumber value="1000000" type="number"></fmt:formatNumber>
	 <fmt:formatNumber value="1000000" type="currency"></fmt:formatNumber>
 
 	<%-- 퍼센트 --%>
	 <fmt:formatNumber value="0.3" type="percent"></fmt:formatNumber>
	 
	 <%-- 소숫점 자릿수 표현 지정 --%>
	 <fmt:formatNumber value="1200.153"  pattern = "0.00"></fmt:formatNumber>
	 
	 <%-- 문자열을 숫자로 변환해주는 기능 var을 붙이면 변수로 사용가능(출력x) --%>
	<fmt:parseNumber value = "1000.123"  integerOnly="true"></fmt:parseNumber>	 
	
	<%-- timezone --%>
	<fmt:timeZone value="GMT"><br/>
	GMT 영국 : <fmt:formatDate  value="${day}" type = "both"/>
	</fmt:timeZone>
	
	<fmt:timeZone value="GMT-4"><br/>
	GMT 영국 : <fmt:formatDate  value="${day}" type = "both"/>
	</fmt:timeZone>
	
	<%-- ******************EL******************** --%>
	<h4>${arr}</h4>
	<h4>${arr}</h4>

	<h3>${list }</h3>
	<h3>${list[0] }</h3>
	<h3>${list.get(0) }</h3>

	
	<h3>${dto }]</h3>
	<h3>${dto.id }]</h3>
	<h3>${dto.pw }]</h3>
	<h3>${dto.getId() }]</h3>
	<h3>${dto.getPw() }]</h3>
	
	 
	
	
</body>
</html>