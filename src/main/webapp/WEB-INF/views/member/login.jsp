<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<div class="container my-5">
		<h4>로그인</h4>
		<div>
			<font color="blue">${data}</font>
		</div>
		<!-- 		<form method="post" action="loginOk">
			<button type="submit" class="btn btn-primary">로그인</button>
		</form> -->
		<form method="post">
			<label>레벨</label>
			<select name="level" class="form-control mb-3">
				<option value="0">관리자</option>
				<option value="1">우수회원</option>
				<option value="2">정회원</option>
				<option value="3">준회원</option>
			</select>
			<label>아이디</label>
			<input type="text" name="mid" value="admin" class="form-control mb-3" />
			<label>비밀번호</label>
			<input type="password" name="pwd" value="1234" class="form-control mb-3" />
			<input type="submit" value="로그인" class="btn btn-success" />
			<input type="button" value="회원가입" onclick="location.href='${ctp}/member/join';" class="btn btn-primary" />
			<input type="button" value="방명록" onclick="locatoin.href='${ctp}/guest/guestList';" class="btn btn-info" />
		</form>
		<div class="mt-5">
			<a href="${ctp}/" class="btn btn-success">돌아가기</a>
		</div>
	</div>
</body>
</html>