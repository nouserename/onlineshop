<%@page import="controler.Index"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>会员登录</title>
		<link rel="stylesheet" type="text/css" href="./css/login.css">
		 <script src="./js/verificationCode.js" type="text/javascript"></script>
		<script type="text/javascript">
			function check(){
				var id = document.getElementById("userIdForCheck");
				if(id.value.length==0){
					alert("用户名不能为空！");
					return false;
				}
				var passwd = document.getElementById("passwdForCheck");
				if(passwd.value.length==0){
					alert("密码不能为空！");
					return false
				}
				var p = document.getElementById("verifyPictureForCheck");
				if(p.value.length==0){
					alert("验证码不能为空！");
					return false;
				}
				var r1 = document.getElementById("radio1");
				var r2 = document.getElementById("radio2");
				if(!r1.checked&&!r2.checked){
					alert("请选择类别！");
					return false;
				}
				return true;
			}
		
		</script>
	</head>
	<body>
		<!-- login -->
		<div class="top center">
			<div class="logo center">
				<a href="#" target="_blank"><img src="./image/mistore_logo.png" alt=""></a>
			</div>
		</div>
		
		<form  method="post" action="Index" class="form center" onsubmit="return check()">
		<div class="login">
			<div class="login_center">
				<div class="login_top">
					<div class="left fl">会员登录</div>
					<div class="right fr">您还不是我们的会员？<a href="./userregistration.jsp" target="_self">立即注册</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="login_main center">
					<div class="username">用户名:&nbsp;<input id="userIdForCheck" class="shurukuang" type="text" name="userid" placeholder="请输入你的用户名"/></div>
					<div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;<input id="passwdForCheck" class="shurukuang" type="password" name="passwd" placeholder="请输入你的密码"/></div>
					<div class="username">
						<div class="left fl">验证码:&nbsp;<input id="verifyPictureForCheck" class="yanzhengma" type="text" name="username" placeholder="请输入验证码"/></div>
						<div class="right fl"><img src="./image/yanzhengma.jpg"></div>
						<div class="clear"></div>
					</div>
					<div class="username" style="height: 20px;line-height: 20px;margin: 10px;" >
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<label style="text-align: center;">用户：<input type="radio" name="kind" id="radio1" value="customer"></label>
							<label style="text-align: center;">管理者：<input type="radio" name="kind" id="radio2" value="admin"></label>
					</div>
				</div>
				<div class="login_submit" style="margin: 10px;">
					<input class="submit" type="submit" name="submit" value="立即登录" >
				</div>
				
			</div>
		</div>
		</form>
		<footer>
			<div class="copyright">简体 | 繁体 | English | 常见问题</div>
			<div class="copyright">星云公司版权所有-京ICP备10046444-<img src="./image/ghs.png" alt="">京公网安备11010802020134号-京ICP证110507号</div>

		</footer>
	</body>
</html>