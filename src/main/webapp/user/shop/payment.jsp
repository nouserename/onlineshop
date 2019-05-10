<%@page import="java.util.Map"%>

<%@page import="java.util.Set"%>
<%@page import="entity.Customer" %>
<%@page import="entity.Product" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>支付</title>
		<link rel="stylesheet" type="text/css" href="/onlineshop/css/style.css">
	</head>
	<body>
	<script>
			var xmlhttp = new XMLHttpRequest();
		function pay(){
			xmlhttp.open("POST","Payment",true);
			xmlhttp.send();
			xmlhttp.onreadystatechange=callback;
		}
		
		function callback(){
			var flag = xmlhttp.responseText;
			alert(flag);
			if(flag=="true"){
				var body = document.getElementById("formdiv");
				alert(body);
				body.innerHTML = "<h1>付款成功</h1>";
			}
			if(flag=="false"){
				var body = document.body;
				body.innerHTML = "<h1>付款失败</h1>";
			}
			
		}
	</script>
	<!-- start header -->
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="/onlineshop/user/userhomepage.jsp" target="_blank">星云商城</a></li>
						<li>|</li>
						<li><a href="">星云UI</a></li>
						<li>|</li>
						<li><a href="">NebulaChat</a></li>
						<li>|</li>
						<li><a href="">游戏</a></li>
						<li>|</li>
						<li><a href="">星云阅读</a></li>
						<li>|</li>
						<li><a href="">星云cloud</a></li>
						<li>|</li>
						<li><a href="">星云financial</a></li>
						<li>|</li>
						<li><a href="">开发者</a></li>
						<li>|</li>
						<li><a href="">问题反馈</a></li>
						<li>|</li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="shoppingtrolley.jsp">购物车</a></div>
					<div class="fr">
						<ul>
							<li><a href="../../index.jsp" target="_blank">登录</a></li>
							<li>|</li>
							<li><a href="../../userregistration.jsp" target="_blank" >注册</a></li>
							<li>|</li>
							<li><a href="../mine/mine.jsp">我的</a></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
	<!--end header -->

<!-- start banner_x -->
		<div class="banner_x center">
			<a href="./index.html" target="_blank"><div class="logo fl"></div></a>
			<a href=""><div class="ad_top fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=1" target="_blank">Nebula1</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=2">Nebula2</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=3">Nebula3</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=4">Nebula4</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=5">Nebula5</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=6">Nebula6</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=7">NebulaX</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=8">NebulaX-plus</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=9">Nebula&galaxy</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=10">moon</a></li>
				</ul>
			</div>
			<div class="search fr">
				<form action="UserHomePage" method="post">
					<div class="text fl">
						<input type="text" class="shuru" name="key" placeholder="Nebula&galaxy">
					</div>
					<div class="submit fl">
						<input type="submit" class="sousuo"  value="搜索"/>
					</div>
					<div class="clear"></div>
				</form>
				<div class="clear"></div>
			</div>
		</div>
<!-- end banner_x -->
		<div id="formdiv">
			<form action="Payment" method="post">
			
				支付宝账号：<input type="text" name="payid"><br>
				支付宝密码：<input type="password" name="password"><br>
				<input type="button" value="确认付款" onclick="pay()"><br />
			</form>
		</div>

	<!-- start banner_y -->
	<!-- end banner -->


		<footer class="mt20 center">			
			<div class="mt20">星云商城|星云UI|NebulaChat|星云书城|星云路由器|星云天猫店|星云淘宝直营店|星云移动|隐私政策|</div>
			<div>©xingyun.bjut.edu.cn 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>

	<!-- end danpin -->


	</body>
</html>
