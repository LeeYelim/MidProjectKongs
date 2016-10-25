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
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
	<div id="mainMenu">
		<div class="container">
			<div id="logo">
				<a href="#"><img src="img/logo.png"></a>
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
	<div class="container">
		
	</div>
	
	<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="js/smoothscroll-for-websites-master/SmoothScroll.js"></script>
	<script type="text/javascript" src="js/mainBanner.js"></script>
	<script type="text/javascript" src="js/mainStati.js"></script>
	<script type="text/javascript" src="js/teamBanner.js"></script>
	<script type="text/javascript" src="js/loginPlace.js"></script>
</body>
</html>