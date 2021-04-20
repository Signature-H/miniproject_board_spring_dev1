<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>

	<h1>회원가입</h1>
	<hr>
	<!-- <form action="joinMember.do" method="post"> -->
	<form action="login.jsp" method="post">
		<table border="1" style="border-spacing: 0; padding: 0; margin: auto;">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="password" name="confirmPassword"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="phoneNumber1" style="width: 40px">-<input
					type="text" name="phoneNumber2" style="width: 50px">-<input
					type="text" name="phoneNumber3" style="width: 50px"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
	<hr>
</body>
</html>