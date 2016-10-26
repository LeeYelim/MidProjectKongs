<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- 게시판 페이지 -->
<meta charset="UTF-8">
<title>게시판</title>
<!-- 매 페이지 마다 defaultCss는 꼭 입력 -->
<link rel="stylesheet" type="text/css" href="css/defaultCss.css">
<link rel="stylesheet" type="text/css"
	href="css/CompetitionBoardCss/CompetitionBoardCss.css">
</head>
<body>
	<div id="background"></div>
	<div id="titleBar"></div>
	<div id="com_front_title">
		<div class="container">
			<p class="title">
				<img src="img/CompetitionBoard/con_title_logo.gif"> 분야별 공모전
			</p>
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
	<div id="com_front_content">
		<div class="container">
			<ul>
				<c:forEach items="${list}" var="contest">
					<li>
						<div class="com_front_content_img">
							<a href="#"></a>
							<img src="img/contestImg/${contest.photoName}">
						</div>
						<article>
							<a href="#"><h3>${contest.title}</h3></a>
							<p class="com_front_content_date">${contest.startDate} ~ ${contest.endDate}</p>
							<p class="com_front_content_host">${contest.sponser}</p>
						</article>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>
	<div id="com_post_board">
		<div class="container">
			<!-- 게시판 제목 -->
			<p class="title">
				<img src="img/CompetitionBoard/con_title_logo.gif"> 공모전
			</p>
			<div id="tableView">
				<form action="" method="get" onsubmit="">
					<table>
						<tr>
							<th>공모명</th>
							<th>주최</th>
							<th>진행사항</th>
							<th>진행기간</th>
							<th>조회수</th>
						</tr>
						<!-- 게시판 내용 -->
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>
						<tr>
							<td><a href="#">아아아아아아아</a></td>
							<td>우리집</td>
							<td>D-23</td>
							<td>2016.10.25<br>~<br>2016.11.18
							</td>
							<td>12456</td>
						</tr>

					</table>
				</form>
				<div id="boardPage">1.2.3.4.5....</div>
				<div id="boardSearchView">
					<form action="" method="get" onsubmit="">
						<div id="boardSearchBar">
							<select>
								<option>공모전명</option>
								<option>주최사</option>
							</select> <input type="text" placeholder="검색 키워드"> <input
								type=submit value="검색">
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="board_background"></div>
	</div>
	<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript"
		src="js/smoothscroll-for-websites-master/SmoothScroll.js"></script>
</body>
</html>