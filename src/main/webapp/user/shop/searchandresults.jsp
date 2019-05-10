<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>星云手机列表</title>
		<link rel="stylesheet" type="text/css" href="/onlineshop/css/style.css">
		<script type="text/javascript">
	
		function searchproduct() 
		{
			var allPhone = document.getElementById("allPhone");
			var html = allPhone.innerHTML;
	
			var httpRequest = new XMLHttpRequest();
			httpRequest.open("POST","shop/SearchAndResults",true);
			httpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			httpRequest.send();
			httpRequest.onreadystatechange = function(){
				if (httpRequest.status==200&&httpRequest.readyState==4) {
					var proInfo = httpRequest.responseText;
					allPhone.innerHTML = html+proInfo+"<div class='clear'></div>";
				}
			}
		}
	</script>
		
	</head>
	<body onload="searchproduct()">
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
					<div class="gouwuche fr"><a href="shop/shoppingtrolley.jsp">购物车</a></div>
					<div class="fr">
						<ul>
							<li><a href="./login.html" target="_blank">登录</a></li>
							<li>|</li>
							<li><a href="./register.html" target="_blank" >注册</a></li>
							<li>|</li>
							<li><a href="mine/mine.jsp">我的</a></li>
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
						<input type="text" class="shuru" name="key" placeholder="Nebula">
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

	<!-- start banner_y -->
	<!-- end banner -->

	<!-- start danpin -->
		<div class="danpin center" style="height: auto;">
			
			<div class="biaoti center" >小米手机</div>
			<div class="main center" style="height: auto;" id="allPhone">
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:225px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href="./xiangqing.html" target="_blank"><img src="./image/liebiao_xiaomi6.jpg" alt=""></a></div>
					<div class="pinpai"><a href="./xiangqing.html" target="_blank">小米6</a></div>
					<div class="youhui">5.16早10点开售</div>
					<div class="jiage">2499.00元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:225px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_xiaomi5c.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">小米手机5c</a></div>
					<div class="youhui">搭载澎湃S1 八核高性能处理器</div>
					<div class="jiage">1499.00元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:225px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_xiaomint2.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">小米Note 2</a></div>
					<div class="youhui">5月9日-20日 小米Note 2 享花呗12期分期免息</div>
					<div class="jiage">2799.00元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:225px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_xiaomimix.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">小米MIX</a></div>
					<div class="youhui">5月9日-20日小米MIX 享花呗12期分期免息</div>
					<div class="jiage">3499.00元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:225px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_xiaomi5s.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">小米5s</a></div>
					<div class="youhui">“暗夜之眼”超感光相机 / 无孔式超声波</div>
					<div class="jiage">1999.00元</div>
				</div>

 				
			</div>
			<!-- <div class="main center mb20">
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_xiaomi5.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">小米手机5</a></div>
					<div class="youhui">骁龙820处理器 / UFS 2.0 闪存</div>
					<div class="jiage">1799.00元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_hongmin4.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">红米Note 4</a></div>
					<div class="youhui">十核旗舰处理器 / 全金属一体化机身 </div>
					<div class="jiage">1399.00元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/pinpai3.png" alt=""></a></div>
					<div class="pinpai"><a href="">小米手机5 64GB</a></div>
					<div class="youhui">5月9日-10日，下单立减100元</div>
					<div class="jiage">1799元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_hongmin42.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">红米4</a></div>
					<div class="youhui">2.5D 玻璃，金属一体化机身</div>
					<div class="jiage">999.00元</div>
				</div>
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_hongmin4x.jpg" alt=""></a></div>
					<div class="pinpai"><a href="">红米Note 4X 全网通版</a></div>
					<div class="youhui">多彩金属 / 4100mAh 超长续航</div>
					<div class="jiage">1299.00元</div>
				</div> -->
				
				<div class="clear"></div>
			</div>
		</div>
		

		<footer class="mt20 center">			
			<div class="mt20">星云商城|星云UI|NebulaChat|星云书城|星云路由器|星云天猫店|星云淘宝直营店|星云移动|隐私政策|</div>
			<div>©xingyun.bjut.edu.cn 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>

	<!-- end danpin -->


	</body>
</html>