<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>test04 page</h2>
	<%-- JavaBeans규약에 맞는 클래스는 Controller에서 자동으로 view 까지 데이터를 전달해줌
	이때 특별히 model로 이름을 붙혀주지 않았기 때문에 클래스명 첫글자를 소문자로 바꿔서 자동이름 붙혀서 넘겨줌
	jsp에서 꺼낼때 클래스명 첫글자를 소문자로 변경하여 값 추출가능
	 --%>
	<h4>${testDTO.id }</h4>
	<h4>${testDTO.pw }</h4>
	<br/>
	<h4>${testDTO.id }</h4>
	<h4>${testDTO.pw }</h4>
		<br/>
	<h4>${id }</h4>
	<h4>${pw }</h4>
	
	<br>
	<h4>tv: ${tv }</h4>
	<h4>tv.ch : ${tv.ch }</h4>
	<h4>tv.color : ${tv.color }</h4>
</body>
</html>