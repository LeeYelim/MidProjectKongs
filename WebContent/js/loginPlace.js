var loginForm = $("#loginForm");
var signUpForm = $("#signUpForm");
var loginDuration = 500;
var visibleDuration = 350;

$(function(){
	$("#loginPlace input[type=button]").click(function(){
		var btnTmp = $(this).get(0).name;

		switch(btnTmp)  {
			case "cancle"   : 
			$("#loginPlace").hide();  
			loginForm.css({"right":"50%"});
			reset();
			break;

			case "sign"     : 
			showSignUpView();         
			break;

			case "login"    : 
			showLoginView();          
			break;
		}
	});

	$("#loginView").click(function(){
		loginForm.fadeIn(visibleDuration);
		signUpForm.fadeOut(0);
		$("#loginPlace").fadeIn(visibleDuration);
	})
});

function showSignUpView(){
	loginForm.animate({
		right:"60%"
	}, {duration:loginDuration, queue:false}).fadeOut(loginDuration);

	signUpForm.css({
		right:"40%"
	}).animate({
		right:"50%"
	}, {duration:loginDuration, queue:false}).fadeIn(loginDuration);
}

function showLoginView(){
	signUpForm.animate({right:"40%"}, {duration:loginDuration, queue:false}).fadeOut(loginDuration);

	loginForm.css({right:"60%"}).animate({right:"50%"}, {duration:loginDuration, queue:false}).fadeIn(loginDuration);
}

function reset(){
	signUpForm.find("input[type=text]").val('');
	signUpForm.find("input[type=password]").val('');

	loginForm.find("input[type=text]").val('');
	loginForm.find("input[type=password]").val('');
}