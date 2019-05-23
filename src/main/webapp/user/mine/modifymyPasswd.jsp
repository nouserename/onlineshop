<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>星云商城-个人中心</title>
		<link rel="stylesheet" type="text/css" href="../../css/style.css">
		<script type="text/javascript">
		function confirm(){
			var newpw = document.getElementById("newpw").value;
			var confirmpw = document.getElementById("confirmpw").value;
			if(newpw != confirmpw)
			{
					alert("两次输入的密码不相等！");
					return false;
			}
		}
		</script>
	</head>
	<body>
	<!-- start header -->
		<header>
			<div class="top center">
			<div class="left fl">
					<ul>
						<li><a href="../userhomepage.jsp">返回用户首页</a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="../shop/shoppingtrolley.jsp">购物车</a></div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
	<!--end header -->
	<!-- start banner_x -->
		<div class="banner_x center">
			<a href="#" target="_blank"><div class="logo fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="#">Nebula1</a></li>
					<li><a href="#">Nebula2</a></li>
					<li><a href="#">Nebula3</a></li>
					<li><a href="#">Nebula4</a></li>
					<li><a href="#">Nebula5</a></li>
					<li><a href="#">Nebula6</a></li>
					<li><a href="#">NebulaX</a></li>
					<li><a href="#">NebulaX-plus</a></li>
					<li><a href="#">Nebula&galaxy</a></li>
					<li><a href="#">moon</a></li>
				</ul>
			</div>
		</div>
<!-- end banner_x -->
<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
		<div class="lfnav fl">
			<div class="ddzx"><a href="mine.jsp">订单中心</a></div>
		</div>
		<div class="rtcont fr">
				<form action="ModifyMyPasswd" method="POST">

					<label for="originalpw" id="originalpwlabel">原密码：</label> <input type="password" name="originalpw" id="originalpw" /> 
					<br>
					<label for="newpw" id="newpwlabel">新密码：</label><input type="password" name="newpw" id="newpw" />
					<br>

					<div align="center"></div>
					<label for="confirmpw" id="confirmpwlabel">确认密码：</label> <input type="password" name="confirmpw" id="confirmpw" onblur="confirm()"/> 
					<br>
					<input type="submit" name="确认" id="btnskk" title="确认" value="确认" onclick="confirm()">
				</form>
			</div>
		<div class="clear"></div>
		</div>
	</div>
<!-- self_info -->
		
	<footer class="mt20 center">			
			<div class="mt20">星云商城|星云UI|NebulaChat|星云书城|星云路由器|星云天猫店|星云淘宝直营店|星云移动|隐私政策|</div>
			<div>©xingyun.bjut.edu.cn 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
	</body>
</html>
