<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberMain</title>
<jsp:include page="/WEB-INF/views/include/bs4.jsp" />
</head>
<body>
	<div class="container my-5">
		<h4>회원 메인 방</h4>
		<div>
			<font color="blue">${data}</font>
			/
			<font color='red'>
				<b>${strLevel}</b>
			</font>
		</div>
		<p>
			<a href="${ctp}/member/logout" class="btn btn-success">로그아웃</a>
		</p>
		<hr>
		<a href="${ctp}/board/boardList" class="btn btn-primary">게시판</a>
		<a href="${ctp}/pds/pdsList" class="btn btn-info">자료실</a>
		<a href="${ctp}/guest/guestList" class="btn btn-secondary">방명록</a>
		<hr>
	</div>
</body>
</html>