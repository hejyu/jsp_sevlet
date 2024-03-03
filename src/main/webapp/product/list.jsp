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

	<h2>상품 목록</h2>
	<hr>
	<div class="search_form">
		<form method="get">
			<select name="category" id="category">
				<option value="">카데고리 선택</option>
				<c:forEach items="${cate_list}" var="cate">
					<option value="${cate.code}"><c:out value="${cate.name}" /> </option>
				</c:forEach>
			</select>

			<input text="text" name="keyword" id="keyword" value="${keyword}" placeholder="상품명을 입력하세요">

			<span style="paading-left:10px;">가격대별</span>

			<input text="text" name="from" id="from" placeholder="10000">
			<b>~</b>
			<input text="text" name="to" id="to" placeholder="50000">

			<button type="submit" id="search" class="btn btn_chocolate">조회</button>
			<button id="searchAll" type="button" class="btn btn_chocolate" onclick="location.href='${pageContext.request.contextPath}/product/list'">전체보기</button>

			<button type="button" class="btn btn_skyblue" id="add">등록</button>
		</form>
	</div>

	<ul id="p-ul">
		<!--  list 이름의 애트리뷰트를 대상으로 합니다. : 애트리뷰트 저장은 서블릿에서 합니다  -->
		<c:forEach items="${list}" var="vo" varStatus="status">
			<li class="p-row">
				<ul class="row">
					<li><c:out value="${status.index + 1}" /></li>
					<li><c:out value="${vo.pcode}" /></li>
					<li><c:out value="${vo.category}" /></li>
					<li><c:out value="${vo.pname}" /></li>
					<li><c:out value="${vo.price}" /></li>
				</ul>
			</li>
		</c:forEach>
	</ul>

	<script type="text/javascript">
		// js 파일에서는 서버 애트리뷰트를 가져올 수 없습니다
		// 서버 애트리뷰는 jsp 파일 안에 있는 script 태그안에서 사용 할 수 있습니다
		const temp = '${cate}'
	</script>

	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/product_sch.js"></script>
</body>
</html>