<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>콩스</title>
	
	<link rel="stylesheet" type="text/css" href="css/indexCss.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	
</head>
<body oncontextmenu="return false" ondragstart="return false" onselectstart="return false">
	<div id="mainMenu">
		<div class="container">
			<div id="logo">
				<a href="#"><img src="img/logo.png"></a>
			</div>
			<ul>
				<li><a href="#">공모전 정보</a></li>
				<li><a href="#">게시판</a></li>
				<li><a href="#">팀 게시판</a></li>
				<li><a href="#">스터디룸</a></li>
				<li><a href="#">Login</a></li>
			</ul>
		</div>
	</div>
	<div class="clear"></div>
	<article id="imgBanner">
		<ul>
			<li>
				<img src="img/banner1.jpg" alt="">
				<div class="container">
					<div class="bleft">
						공모전으로 우리들의 창의력을 발휘하자!<br>
						첫번째 글<br>
						<a href="#">현재 진행중인 공모전 보기</a>
					</div>
				</div>
			</li>
			<li>
				<img src="img/banner2.jpg" alt="">
				<div class="container">
					<div class="bcenter">
						함께하면 재미가 두배! 사람과의 인연은 덤으로!<br>
						두번째 글<br>
						<a href="#">팀 관련 페이지 보기</a>
					</div>
				</div>	
			</li>
			<li>
				<img src="img/banner3.jpg" alt="">
				<div class="container">
					<div class="bright">
						여기에는 무엇을 채워야 할지 모르겠다!<br>
						세번째 글<br>
						<a href="#">어디론가 가는 페이지 보기</a>
					</div>
				</div>	
			</li>
		</ul> 

		<div id="banner_btn_box"></div>

		<div id="banner_np_btn_box">
			<button data-type="prev">&lt;</button>
			<button data-type="next">&gt;</button>
		</div>

	</article>
	<div class="clear"></div>
	<div id="mainStati">
		<div class="stati_bg">
			<div>
				<span>현재 생성된 공모전수</span><br>
				<span>${size}</span>
			</div>
			<img src="img/stati1.jpg" alt="공모전수">
		</div>
		<div class="stati_bg">
			<div>
				<span>현재 구성된 팀수</span><br>
				<span>50000팀</span>
			</div>
			<img src="img/stati2.jpg" alt="팀수">
		</div>
		<div class="stati_bg">
			<div>
				<span>가입한 회원수</span><br>
				<span>250000명</span>
			</div>
			<img src="img/stati3.jpg" alt="회원수">
		</div>
	</div>
	<div class="clear"></div>
	<div id="photo">
		<div class="container">
			<h3 class="material-icons">
				<div class="title_line"></div>
				<span>Competition</span>
			</h3>
			<div class="photo-view">
				<div class="photo-image">
					<div class="photo-img">
						<img src="img/photo1.jpg">
					</div>
					<h4>제목1asdfasdfasdfasdf</h4>
				</div>
				<div class="photo-image">
					<div class="photo-img">
						<img src="img/photo2.jpg">
					</div>
					<h4>제목</h4>
				</div>
				<div class="photo-image">
					<div class="photo-img">
						<img src="img/photo3.jpg">
					</div>
					<h4>제목</h4>
				</div>
				<div class="photo-image">
					<div class="photo-img">
						<img src="img/photo4.jpg">
					</div>
					<h4>제목</h4>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="js/smoothscroll-for-websites-master/SmoothScroll.js"></script>
	<script type="text/javascript" src="js/mainBanner.js"></script>
	<script type="text/javascript" src="js/mainStati.js"></script>
	<script type="text/javascript" src="js/photoImage.js"></script>
</body>

</html>