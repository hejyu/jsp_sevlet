<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/base.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/product.css">
</head>
<body>
	<%@ include file="/common/header.jsp" %>

	<h2>회원 목록</h2>
	<hr>
	<div class="ml-4 mt-12 mb-8">
		<button type="button" class="btn btn_chocolate" id="btn_add">등록</button>
	</div>

	<div class="container_wrap">
		<ul id="p-ul">
			<!--  list 이름의 애트리뷰트를 대상으로 합니다. : 애트리뷰트 저장은 서블릿에서 합니다  -->
			<c:forEach items="${list}" var="vo" varStatus="status">
				<li class="p-row">
					<ul class="row">
						<li><c:out value="${status.index + 1}" /></li>
						<li><c:out value="${vo.custom_id}" /></li>
						<li><c:out value="${vo.name}" /></li>
						<li><c:out value="${vo.email}" /></li>
						<li><c:out value="${vo.age}" /></li>
						<li><c:out value="${vo.reg_date}" /></li>
					</ul>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
<script type="text/javascript">
	document.getElementById('btn_add').addEventListener('click', function() {
		location.href = 'join'
	})
</script>
</html>