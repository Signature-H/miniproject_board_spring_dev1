<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 변경하기</title>
<link rel="stylesheet" href="<c:url value="/resources/css/normalbody.css"/>">
</head>
<body>

<!-- 상단 고정바 -->
	<header>
		<span id="icon"><a href="list.do">메인으로</a></span>
	</header>
	
	<!-- 실제 body -->
<div id="b_contents">
<table border="1" style="border-spacing: 0; padding: 0; margin: auto; width: 600px;">
	<tr>
	<td>아이디</td><td align="left">userid</td>
	<tr>
	<tr>
	<td>비밀번호</td><td align="left"><input type="password" name="password"></td>
	<tr>
	<tr>
	<td>이름</td><td align="left">임시작성자</td>
	<tr>
	<tr>
	<td>전화번호</td><td align="left"><input type="text" name="phoneNumber1" style="width: 40px">-<input
					type="text" name="phoneNumber2" style="width: 50px">-<input
					type="text" name="phoneNumber3" style="width: 50px"></td>
	<tr>
	<tr>
	<td>이메일</td><td align="left"><input type="email" name="email"></td>
	<tr>
</table>
<br>
<a href="myPage.jsp"><input type="button" value="정보 변경하기"></a>
</div>

</body>
</html>