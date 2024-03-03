<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>jsp2 mvc</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
</head>
<body>
<h3>프론트 컨트롤러 테스트</h3>
<hr>
<p>url은 확장자가 없는 형식으로 만들어봅니다. 프로젝트에서는 기능별로 폴더를 만듭니다.
  jsp파일들을 member,community,product폴더 등에 저장합니다.
  url도 하위폴더를 갖는 형식으로 해야 편합니다
</p>
<ul>

  <li><a href="member/modify">회원정보 수정</a></li>
  <li><a href="member/join">회원 등록</a></li>
  <li><a href="member/list">회원 목록</a></li>
  <li><a href="product/add">상품 등록</a></li>
  <li><a href="product/list">상품 목록</a></li>
  <li><a href="community/list">게시판</a></li>
  <li><a href="community/write">게시판 글쓰기</a></li>
  <li><a href="mypage">마이 페이지</a></li>
  <li><a href="cart">장바구니</a></li>
  <li><a href="login">로그인</a></li>
  <li>
    <form action="member/save" method="post">
      <input type="text" placeholder="테스트입니다" name="test">
      <button>post테스트</button>
    </form>
  </li>
</ul>



</body>
</html>