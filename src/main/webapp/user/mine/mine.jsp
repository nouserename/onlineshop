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
			function personalInfo(){
				var httpRequest = new XMLHttpRequest();
				httpRequest.open("POST","Mine",true);
				httpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
				httpRequest.send("event="+"onload");	
				httpRequest.onreadystatechange = function(){
					if (httpRequest.readyState == 4) {
				        if (httpRequest.status == 200) {
				            var obj1 = document.getElementById("nameOfCustomer");
				            var obj2 = document.getElementById("idOfCustomer");
				            var obj3 = document.getElementById("address1");
				            var obj4 = document.getElementById("address2");
				            var obj5 = document.getElementById("address3");
				            
				            var myArray = httpRequest.responseText.split(";");
				            obj1.innerHTML = myArray[0];
				            obj2.innerHTML = myArray[1];
				            obj3.value = myArray[2] + "  电话：" + myArray[3] + "  收货人：" + myArray[4];
				            obj4.value = myArray[5] + "  电话：" + myArray[6] + "  收货人：" + myArray[7];
				            obj5.value = myArray[8] + "  电话：" + myArray[9] + "  收货人：" + myArray[10];
				            
				            
				        } else 
				            alert("AJAX服务器返回错误！");
				        }
				    }
				}
			
			function overallOrders(){
				var httpOrders = new XMLHttpRequest();
				httpOrders.open("POST","Mine",true);
				httpOrders.setRequestHeader("Content-type","application/x-www-form-urlencoded");
				httpOrders.send("event=overallOrders");
				httpOrders.onreadystatechange = function(){
					if(httpOrders.readyState == 4){
						if(httpOrders.status == 200){
							var tt = document.body;
							//alert(tt);
							var sk = httpOrders.responseText;
							//alert(sk);
							tt.InnerHTML = sk;
							//alert(tt.InnerHTML);
						}
						
					}
				}
				
				
			}
		</script>
		
		
	</head>
	<body onload="personalInfo()">
	<!-- start header -->
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="http://www.mi.com/" target="_blank">小米商城</a></li>
						<li>|</li>
						<li><a href="">MIUI</a></li>
						<li>|</li>
						<li><a href="">米聊</a></li>
						<li>|</li>
						<li><a href="">游戏</a></li>
						<li>|</li>
						<li><a href="">多看阅读</a></li>
						<li>|</li>
						<li><a href="">云服务</a></li>
						<li>|</li>
						<li><a href="">金融</a></li>
						<li>|</li>
						<li><a href="">小米商城移动版</a></li>
						<li>|</li>
						<li><a href="">问题反馈</a></li>
						<li>|</li>
						<li><a href="">Select Region</a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="./dingdanzhongxin.html">我的订单</a></div>
					<div class="fr">
						<ul>
							<li><a href="../../login.html" target="_blank">登录</a></li>
							<li>|</li>
							<li><a href="../../register.html" target="_blank" >注册</a></li>
							<li>|</li>
							<li><a href="#top">个人中心</a></li>
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
					<li><span id="test"></span></li>
					<li><a href="">红米</a></li>
					<li><a href="">平板·笔记本</a></li>
					<li><a href="">电视</a></li>
					<li><a href="">盒子·影音</a></li>
					<li><a href="">路由器</a></li>
					<li><a href="">智能硬件</a></li>
					<li><a href="">服务</a></li>
					<li><a href="">社区</a></li>
				</ul>
			</div>
			<div class="search fr">
				<form action="" method="post">
					<div class="text fl">
						<input type="text" class="shuru"  placeholder="小米6&nbsp;小米MIX现货">
					</div>
					<div class="submit fl">
						<input type="submit" class="sousuo" value="搜索"/>
					</div>
					<div class="clear"></div>
				</form>
				<div class="clear"></div>
			</div>
		</div>
<!-- end banner_x -->
<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
		<div class="lfnav fl">
			<div class="ddzx">订单中心</div>
			<div class="subddzx">
				<ul>
					<li><span onclick="overallOrders()">全部订单</a></li>
					<li><a href="">待发货</a></li>
					<li><a href="">待收货</a></li>
					<li><a href="">售后订单</a></li>
				</ul>
			</div>
			<div class="ddzx">个人中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="./self_info.html" style="color:#ff6700;font-weight:bold;">我的个人中心</a></li>
					<li><a href="">地址管理</a></li>
					<li><a href="">修改密码</a></li>
				</ul>
			</div>
		</div>
		<div class="rtcont fr">
			<div class="grzlbt ml40">我的资料</div>
			<div class="subgrzl ml40"><span>昵称</span><span id="nameOfCustomer"></span><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>手机号</span><span id="idOfCustomer"></span><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>密码</span><span>************</span><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>个性签名</span><span id="signature">一支穿云箭，千军万马来相见！</span><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>我的爱好</span><span>游戏，音乐，旅游，健身</span><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>收货地址1</span><input type="text" id="address1"><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>收货地址1</span><input type="text" id="address2"><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>收货地址1</span><input type="text" id="address3"><span><a href="">编辑</a></span></div>
			
			
			
			<!-- <div class="subgrzl ml40"><span>收货地址1</span><span id="address1"></span><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>收货地址2</span><span id="address2"></span><span><a href="">编辑</a></span></div>
			<div class="subgrzl ml40"><span>收货地址3</span><span id="address3"></span><span><a href="">编辑</a></span></div> -->
			<!-- <form action="Mine" method="POST">
				<input type="button" value="tijiao" onclick="personalInfo()">
			</form> -->
		</div>
		<div class="clear"></div>
		</div>
	</div>
	<!-- <span id="test"></span> -->
<!-- self_info -->
		
		<footer class="mt20 center">			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div id="testtest">©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
	</body>
</html>