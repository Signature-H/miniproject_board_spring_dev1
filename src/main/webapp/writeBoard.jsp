<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정하기</title>
<link rel="stylesheet"
	href="<c:url value="/resources/css/normalbody.css" />">
</head>
<body>
	<!-- 상단 고정바 -->
	<header>
		<span id="icon"><a href="list.do">메인으로</a></span> <span
			id="login_join"><a href="login.jsp"><input type="button"
				value="로그인"></a> <a href="joinMember.jsp"><input
				type="button" value="회원가입"></a> <a href="myPage.jsp"><input
				type="button" value="마이페이지"></a> </span>
	</header>

	<!-- 실제 body -->
	<div id="b_contents">
		<form action="getBoardList.jsp" method="post">
			<table border="1"
				style="border-spacing: 0; padding: 0; margin: auto; width: 700px;">
				<tr>
					<td>글 제목</td>
					<td align="left"><input type="text" name="title"></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td align="left">임시작성자</td>
				</tr>
				<tr>
					<td>글 내용</td>
					<td align="left"><textarea cols="30" rows="5" name="content"> 글의 내용이시다!</textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="button" value="글 수정"></td>
			</table>
		</form>
	</div>
</body>
</html>