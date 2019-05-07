<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>星云商城-个人中心</title>
		<link rel="stylesheet" type="text/css" href="../../css/style.css">
		<style type="text/css">
			#address1{position:relative;left:3em;width: 40em;height:3em;border-radius:5px;border:0.5;}
			#address2{position:relative;left:3em;width: 40em;height:3em;border-radius:5px;border:0.5;}
			#address3{position:relative;left:3em;width: 40em;height:3em;border-radius:5px;border:0.5;}
			.editor{position:relative;left:46.7em;top:-3em;}
		</style>
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
				            obj3.value = myArray[2] + "电话：" + myArray[3] + "收货人：" + myArray[4];
				            obj4.value = myArray[5] + "电话：" + myArray[6] + "收货人：" + myArray[7];
				            obj5.value = myArray[8] + "电话：" + myArray[9] + "收货人：" + myArray[10];
				            
				            
				        } else 
				            alert("AJAX服务器返回错误！");
				        }
				    }
				}
			
			function overallOrders(){
				//alert("函数起作用了");
				var httpOrders = new XMLHttpRequest();
				httpOrders.open("POST","Mine",true);
				httpOrders.setRequestHeader("Content-type","application/x-www-form-urlencoded");
				httpOrders.send("event="+"overallOrders");
				//alert("函数起作用了skk");
				httpOrders.onreadystatechange = function(){
					if(httpOrders.readyState == 4){
						if(httpOrders.status == 200){
							alert("返回了！");
							var tt = document.getElementById("orderinfo");
							var sk = httpOrders.responseText;
							//alert(sk);
							tt.innerHTML = sk;
							//alert(tt.InnerHTML);
						}
						
					}
				}
				
				
			}
			
			function orderState(state){
				alert("发送请求了");
				alert(state);
				var httpOrders = new XMLHttpRequest();
				httpOrders.open("POST","Mine",true);
				httpOrders.setRequestHeader("Content-type","application/x-www-form-urlencoded");
				httpOrders.send("event="+state);
			
				httpOrders.onreadystatechange = function(){
					if(httpOrders.readyState == 4){
						if(httpOrders.status == 200){
							//alert("返回了！");
							var tt = document.getElementById("orderinfo");
							var sk = httpOrders.responseText;
							//alert(sk);
							tt.innerHTML = sk;
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
						<li><a href="#" target="_blank">星云商城</a></li>
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
					<li><a href="./liebiao.html" target="_blank">Nebula1</a></li>
					<li><a href="">Nebula2</a></li>
					<li><a href="">Nebula3</a></li>
					<li><a href="">Nebula4</a></li>
					<li><a href="">Nebula5</a></li>
					<li><a href="">Nebula6</a></li>
					<li><a href="">NebulaX</a></li>
					<li><a href="">NebulaX-plus</a></li>
					<li><a href="">Nebula&galaxy</a></li>
					<li><a href="">moon</a></li>
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
<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
		<div class="lfnav fl">
			<div class="ddzx">订单中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="#" onclick="overallOrders()">全部订单</a></li>
					<li><a href="#" onclick="orderState('daifahuo')">待发货</a></li>
					<li><a href="#" onclick="orderState('daishouhuo')">待收货</a></li>
				</ul>
			</div>
			<div class="ddzx">个人中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="./self_info.html" style="color:#ff6700;font-weight:bold;">我的个人中心</a></li>
					<li><a href="addressadministration.jsp">地址管理</a></li>
					<li><a href="modifymyPasswd.jsp">修改密码</a></li>
				</ul>
			</div>
		</div>
		<div class="rtcont fr" id="orderinfo" style="height:auto;">
			<div class="grzlbt ml40">我的资料</div>
			<div class="subgrzl ml40"><span>昵称</span><span id="nameOfCustomer"></span></div>
			<div class="subgrzl ml40"><span>手机号</span><span id="idOfCustomer"></span></div>
			<div class="subgrzl ml40"><span>密码</span><span>************</span></div>
			<div class="subgrzl ml40"><span>个性签名</span><span id="signature">一支穿云箭，千军万马来相见！</span></div>
			<div class="subgrzl ml40"><span>我的爱好</span><span>游戏，音乐，旅游，健身</span></div>
			
			<div class="subgrzl ml40"><span>收货地址1</span><input type="text" id="address1" readonly="readonly"><span></span></div>
			<div class="subgrzl ml40"><span>收货地址1</span><input type="text" id="address2" readonly="readonly"><span></span></div>
			<div class="subgrzl ml40"><span>收货地址1</span><input type="text" id="address3" readonly="readonly"><span></span></div>
			
			
			
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