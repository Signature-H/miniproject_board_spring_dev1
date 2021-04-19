<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>

<h1>게시판</h1>
<h3>000님! 환영합니다! <a href="login.jsp">Log-Out</a></h3>
<!-- 검색 -->
<form action="getBoardList.jsp">
	<table border="1" style="border-spacing: 0; padding: 0; margin: auto; width: 700px;">
	<tr>
		<td align="right"><select name="searchCondition">
			<option value="TITLE">제목
			<option value="CONTENT">내용
		</select>
		<input type="text" name="searchKeyword">
		<input type="submit" value="검색">
	</tr>
	</table>
</form>

<!-- 게시글 목록 -->
<table border="1" style="border-spacing: 0; padding: 0; margin: auto; width: 700px;">
	<tr>
		<th width="100">번호</th>
		<th width="200">제목</th>
		<th width="150">글쓴이</th>
		<th width="100">등록일</th>
		<th width="100">조회수</th>
	</tr>
	<%-- <c:forEach items="0" var="board" > --%>
	<c:forEach var="board" begin="1" end="20">
	<tr>
		<td>${21-board}</td>
		<td align="left">제목_${21-board}</td>
		<td>임시닉네임</td>
		<td>today</td>
		<td>0</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>