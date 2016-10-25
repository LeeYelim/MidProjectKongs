<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">

	<title>::콩스</title>
	<link rel="stylesheet" type="text/css" href="css/indexCss.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
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
				<li id="loginView"><a>Login</a></li>
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
				<span>${teamcount}</span>
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
			<h3 class="material-icons main_title">
				<div class="title_line"></div>
				<a href="#">
					<span>Competition</span>
				</a>
			</h3>
			
			<!-- 공모전-->
			<div class="photo-view">
				<c:forEach items="${list}" var="contest">
					<div class="photo-image">
						<div class="photo-img">
							<a href="#"></a>
							<img src="img/${contest.photoName}.jpg">
						</div>
					<h4>${contest.title}</h4>
					</div>
				</c:forEach>
				<p><span></span></p>
			</div>
		</div>
	</div>
	<div id="team">
		<div id="team-view">
			<div class="container">
				<h3 class="material-icons main_title">
					<div class="title_line"></div>
					<a href="#">
						<span>Team</span>
					</a>
				</h3>
				<!-- 팀 소개-->
				<div id="team_img_view">
					<div class="team_content">
						<img src="img/team_profile1.jpg">
						<p class="competition_name">
							웹 프로젝트
						</p>
						<p class="team_name">
							엄청나게 좋은 팀
						</p>
						<p class="team_info">
							으으이으이ㅢ읭 ㅣ의의으이 ㅢ의의으 ㅣ의의으이ㅡ ㅣ의의 ㅡ이ㅡ이잉 ㅢ으이읭 
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
							tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
							quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo.
						</p>
					</div>
					<div class="team_content">
						<img src="img/team_profile2.jpg">
						<p class="competition_name">
							자바 프로젝트
						</p>
						<p class="team_name">
							좋은 팀
						</p>
						<p class="team_info">
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
							tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
							quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
							consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse.
						</p>
					</div> 
					<div class="team_content">
						<img src="img/team_profile3.jpg">
						<p class="competition_name">
							무언가 프로젝트
						</p>
						<p class="team_name">
							팀 팀
						</p>
						<p class="team_info">
							Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
							tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
							quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
							consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse.
						</p>
					</div> 
				</div>
				<div id="team_np_btn_box">
					<button id="teamLeft">&lt;</button>
					<button id="teamRight">&gt;</button>
				</div>
				<h3 class="material-icons main_title">
					<div class="title_line"></div>
					<a href="#">
						<span>moveing</span>
					</a>
				</h3>
			</div>
		</div>
	</div>
	<div id="loginPlace">
		<div class="login_box" id="loginForm">
			<div class="loginTitleBar">
				<span>로그인</span>
				<input type="button" name="cancle" value="X">
			</div>
			<!-- 로그인 폼-->
			<form action="" method="post" onsubmit="">
				<input type="text" name="id" placeholder="ID">
				<input type="password" name="pass" placeholder="PW">
				<input type="submit" name="login" value="LOGIN">
				<input type="button" name="sign" value="SIGN UP">
			</form>
		</div>
		<div class="login_box" id="signUpForm">
			<div class="loginTitleBar">
				<span>회원가입</span>
				<input type="button" name="cancle" value="X">
			</div>
			<!-- 회원가입 폼-->
            <form action="" method="post" onsubmit="">
            	<input type="text" name="id" placeholder="아이디">
				<input type="password" name="pass" placeholder="비밀번호">
				<input type="password" name="pass_re" placeholder="비밀번호 재입력">
				<input type="text" name="name" placeholder="이름">
				<input type="text" name="nick" placeholder="닉네임">
                <input type="submit" name="sign" value="회원가입">
                <input type="button" name="login" value="로그인 화면으로">
            </form>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="smoothscroll-for-websites-master/SmoothScroll.js"></script>
	<script type="text/javascript" src="js/mainBanner.js"></script>
	<script type="text/javascript" src="js/mainStati.js"></script>
	<script type="text/javascript" src="js/teamBanner.js"></script>
	<script type="text/javascript" src="js/loginPlace.js"></script>
</body>
</html>