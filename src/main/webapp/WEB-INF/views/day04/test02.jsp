<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test 02</h2>
	
	<%-- 1. 변수 생성 : set
	var : 변수명, 표현식, EL, 정적 테스트 사용해 값지정 가능
	property : 프로퍼티 이름지정, 자바빈의 경우 변수명 -> set 메서드 호출
	target : 값 설정할 대상 객체. EL을 사용하여 지정. 자바빈이나 Map 타입
	
	 --%>
	<c:set var ="name"> 피카츄</c:set>
	<c:set var ="id" value="java" />
	<h4>name : ${name}</h4>
	<h4>id : ${id}</h4>
	
	
	<c:set target="${dto}" property="id" value = "test"/>
	<c:set target="${dto}" property="pw" value = "1234"/>
	
	<h4>dto.id : ${dto.id }</h4>
	<h4>dto.pw : ${dto.pw }</h4>
	
	<%-- #2.변수 삭제 : REMOVE --%>
	<c:remove var="name"/>
	<c:remove var="id"/>
	
	<h4>name : ${name}</h4>
	<h4>id : ${id}</h4>
	
	<%-- #3. c:if : 조건문. 자바에서 if문 한개만 쓰는 형태 
	<c:if test="${조건식}">
		//조건식 참일경우 코드들...(화면에 보여줄 태그들 작성)
	</c:if>
	--%>
	
	<c:set var="num" value = "100" />
	<c:if test="${num==100 }">
	<h4>num : ${num }은 100이다</h4>
	</c:if>
	
	<c:if test="${num>100 }">
	<h4>num : ${num }은 100보다 크다</h4>
	</c:if>
	
	<c:if test="${num<100 }">
	<h4>num : ${num }은 100보다 작다</h4>
	</c:if>
	
	<%-- #4. c:choose, c:when, c:otherwise --%>
	<c:choose>
		
		<c:when test="${num>100}">
	<h4> num : ${num} 은 100보다크다</h4>
		</c:when>
		
		<c:when test="${num<100}">
	<h4> num : ${num} 은 100보다 작다</h4>
		</c:when>
		
		<c:when test="${num==100}">
	<h4> num : ${num}은 100이다</h4>
		</c:when>
		
	</c:choose>
	
	
	<%-- #5. c:forEach --%>
	<c:forEach var = "i" items = "${arr}" varStatus="status">
		<h3>i : ${i}, index : ${status.index}, count : ${status.count }</h3>
	</c:forEach>
	
	<c:forEach var="a" begin="1" end="10" step="1">
		<h4>${a}</h4>	
	</c:forEach>
	
	 
	<%-- 구구단 2-9단까지 출력 : 2 * 1 = 2 --%>
	
	<c:forEach var="i"  begin="1" end="10" step="1">
	<h4>**** ${i} 단****</h4>
		<c:forEach var="j"  begin="1" end="10" step="1">
					<h4>${i} * ${j}= ${i*j}</h4>
		</c:forEach>	
	</c:forEach>
	
	<%--#6. c:fortoken  : 반복문 --%>
	<c:forTokens var = "a" items="a,b,c,d,e" delims=",">
		<h3>${a}</h3>
	
	</c:forTokens>
	
	<%--#7. c:import : include와 비슷 --%>
	<c:import url="/day04/test01"></c:import>
	
	
	<%-- #8. c:redirect : 단순 이동(새로고침)	--%> 
	<c:redirect url="/day04/test01"/>

	
	<%-- #9. c:URL : URL 주소 만들때 --%>
	<c:url var="u" value="/day04/test01">
	 <c:param name="id" value="java"></c:param>
	 <c:param name="pw" value="1111"></c:param>
	</c:url>
	
	<c:redirect url="${u }" />
	
	
	<%-- #10 c:out 출력 태그 --%>
	<c:set var="num2" value="50"></c:set>
	num2 : <c:out value="${num2 }"></c:out>	<br>
	
	<input type="text" name="test" value="${num2}"><br>
	<input type="text" name="test" value=" <c:out value='${num2}'/>">
	
</body>
</html>