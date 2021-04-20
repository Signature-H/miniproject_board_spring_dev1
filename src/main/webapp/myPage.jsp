<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<link rel="stylesheet" href="<c:url value="/resources/css/normalbody.css"/>">
</head>
<body>
<!-- 상단 고정바 -->
	<header>
		<span id="icon"><a href="getBoardList.jsp">메인으로</a></span>
	</header>
	
<!-- 실제 body -->
<div id="contents">
<table border="1" style="border-spacing: 0; padding: 0; margin: auto; width: 600px;">
	<tr>
	<td>아이디</td><td align="left">userid</td>
	<tr>
	<tr>
	<td>비밀번호</td><td align="left">********</td>
	<tr>
	<tr>
	<td>이름</td><td align="left">임시작성자</td>
	<tr>
	<tr>
	<td>전화번호</td><td align="left">010-1234-5678</td>
	<tr>
	<tr>
	<td>이메일</td><td align="left">qgruqhg@gmail.com</td>
	<tr>
</table>
<br>
<a href="changeInfo.jsp"><input type="button" value="정보 변경하기"></a>
</div>

</body>
</html>