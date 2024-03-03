<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- <!DOCTYPE html> -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/base.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/member.css">
</head>
<body>
	<!-- JSP 페이지 지시자  file 속성으로 지정된 jps를 컴파일하여 여기에 포함시킵니다  -->
	<%@ include file="/common/header.jsp" %>
	<h2>회원 가입</h2>
	<hr>
	<form method="POST">
		<ul id="m-ul" class="mt-4">
			<li>
				<span class="title_text">아이디(필수)</span>
				<input type="text" class="input_item" name="custom_id" id="custom_id" placeholder="아이디를 입력해 주세요" required>
				<%--<button type="button" class="btn btn_gray" name="btn_check_id" id="btn_check_id">중복확인</button>--%>
			</li>
			<li>
				<span class="title_text">이름(필수)</span>
				<input type="text" class="" name="name" id="name" placeholder="이름" required>
			</li>
			<li>
				<span class="title_text">이메일</span>
				<input type="email" class="" name="email" id="email" value="" placeholder="이메일을 입력해 주세요">
			</li>
			<li>
				<span class="title_text">나이</span>
				<input type="number" class="" name="age" id="age" value="" placeholder="나이을 입력해 주세요">
			</li>
			<li class="flex-box">
				<button type="submit" class="btn btn_chocolate"  name="btn_add" id="btn_add">회원가입</button>
			</li>
		</ul>

	</form>

	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/member_add.js"></script>

</body>
</html>