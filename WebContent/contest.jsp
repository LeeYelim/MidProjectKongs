<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>::콩스</title>
	<!-- 매 페이지 마다 defaultCss는 꼭 입력 -->
	<link rel="stylesheet" type="text/css" href="css/defaultCss.css">
	<link rel="stylesheet" type="text/css" href="css/indexCss.css">
	<link rel="stylesheet" type="text/css" href="css/contestCss.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body background="img/triangles.jpg">
	<div id="mainMenu">
		<div class="container">
			<div id="logo">
				<a href="index.jsp"><img src="img/logo.png"></a>
			</div>
			<ul id="menu">				
				<li><a href="contest.jsp">공모전 정보</a></li>
				<li><a href="#">게시판</a></li>
				<li><a href="#">팀 게시판</a></li>
				<li><a href="#">스터디룸</a></li>
				<c:choose>
					<c:when test="${empty sessionScope.user}"><li id="loginView"><a>Login</a></li></c:when>
					<c:when test="${sessionScope.user!=null}"><li id="logoutView"><a>Logout</a></li></c:when>
				</c:choose>
			</ul>
		</div>
	</div>
	<div class="clear"></div>
	<div class="vacuum"></div>
	<div id="category">
		<div class="container">
			<div class="category"><h2>카테고리분류</h2></div>
			<div class="list">
				<ul>
					<li><strong><a href="#">디자인</a></strong></li>
					<li><strong><a href="#">광고/마케팅</a></strong></li>
					<li><strong><a href="#">IT/소프트웨어</a></strong></li>
					<li><strong><a href="#">영상/사진</a></strong></li>
					<li><strong><a href="#">기획/아이디어</a></strong></li>
					<li><strong><a href="#">취업/창업</a></strong></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="clear"></div>
	<div id="content">
		<div class="container">
			<div class="title">
				<ul>
					<li><strong>글번호</strong></li>
					<li><strong>공모명</strong></li>
					<li><strong>주최</strong></li>
					<li><strong>진행사항</strong></li>
					<li><strong>진행기간</strong></li>
					<li><strong>조회수</strong></li>
				</ul>
			</div>
			<div>
				<c:forEach items="" >
				<ul>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
				</ul>
				</c:forEach>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="js/smoothscroll-for-websites-master/SmoothScroll.js"></script>
	<script type="text/javascript" src="js/mainBanner.js"></script>
	<script type="text/javascript" src="js/mainStati.js"></script>
	<script type="text/javascript" src="js/teamBanner.js"></script>
	<script type="text/javascript" src="js/loginPlace.js"></script>
</body>
</html>