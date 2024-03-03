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
	<h2>상품 등록</h2>
	<hr>
	<form method="POST">
		<ul id="m-ul" class="mt-4">
			<li>
				<label for="p_code"><span class="">상품코드(필수)</span></label>
				<input type="text" class="" name="p_code" id="p_code" placeholder="상품코드를 입력해 주세요" required>
				<%--<button type="button" class="btn btn_gray" name="btn_check_id" id="btn_check_id">중복확인</button>--%>
			</li>
			<li>
				<label for="category"><span class="">카테고리(필수)</span></label>
				<input type="text" class="" name="category" id="category" placeholder="카테고리" required>
			</li>
			<li>
				<label for="p_name"><span class="">상품이름(필수)</span></label>
				<input type="text" class="" name="p_name" id="p_name" value="" placeholder="상품이름을 입력해 주세요">
			</li>
			<li>
				<label for="price"><span class="">가격(필수)</span></label>
				<input type="number" class="" name="price" id="price" value="" placeholder="가격을 입력해 주세요">
			</li>
			<li class="flex-box">
				<button type="submit" class="btn btn_chocolate"  name="btn_add" id="btn_add">등록</button>
			</li>
		</ul>

	</form>

	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/product_add.js"></script>

</body>
</html>