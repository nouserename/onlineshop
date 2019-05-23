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
			function personalInfo()
			{
				var httpRequest = new XMLHttpRequest();
				httpRequest.open("POST","AddressAdministration",true);
				httpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
				httpRequest.send("event=onload");	
				httpRequest.onreadystatechange = function(){
					if(httpRequest.readyState == 4 && httpRequest.status == 200)
					{
						var threeDivision = httpRequest.responseText;
						var address = threeDivision.split(";");
						for(var i=1;i<=3;i++)
						{
							var infoDivision = address[i-1].split("/");
							document.getElementById("peopleOfReceive"+i).value = infoDivision[0];
							document.getElementById("contact"+i).value = infoDivision[1];
							document.getElementById("province"+i).value = infoDivision[2];
							document.getElementById("city"+i).value = infoDivision[3];
							document.getElementById("district"+i).value = infoDivision[4];
							document.getElementById("other"+i).value = infoDivision[5];
						}
						//window.history.back(-1);
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
					<li><a href="#" target="_blank">Nebula1</a></li>
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
			<div class="ddzx"><a href="mine.jsp" >我的首页</a></div>
		</div>
		<div class="rtcont fr" style="height:auto">
				<h1 align="center">第一条地址</h1>
				<form action="AddressAdministration" method="post">
					<div style="border: 3px solid #000">
						<input type="hidden" name="table" value="table1">
						<input type="hidden" name="event" value="isWrong1">
						<br />
						&emsp;&emsp;<label class="peopleOfReceive">收货人:&emsp; <input type="text" name="customer" id="peopleOfReceive1"></label>
						<!-- <div style="text-align: right">
							<input type="button" value="删除" />
						</div> -->
						<br /> 
						&emsp;&emsp;<label class="contact">联系方式 ：<input type="text" name="telephoneNo" id="contact1"></label>
						<div style="text-align: right">
							<input type="submit" value="修改" />
						</div>
						<br />
						&emsp;&emsp;<label class="affress">地址:</label>
						<br>
						 &emsp;&emsp;<label class="province">省：<input type="text" name="province" id="province1"></label><label class="city">市：<input type="text" name="city" id="city1"></label>
						 &emsp;&emsp;<label class="district">区：<input type="text" name="district" id="district1"></label><label class="other">详细地址：<input type="text" name="other" id="other1"></label>
						<br />
					</div>
				</form>

				<h1 align="center">第二条地址</h1>
				<form action="AddressAdministration" method="post">
					<div style="border: 3px solid #000">
						<input type="hidden" name="table" value="table2">
						<input type="hidden" name="event" value="isWrong2">
						<br />
						&emsp;&emsp;<label class="peopleOfReceive">收货人:&emsp; <input type="text" name="customer" id="peopleOfReceive2"></label>
						<!-- <div style="text-align: right">
							<input type="button" value="删除" />
						</div> -->
						<br /> 
						&emsp;&emsp;<label class="contact">联系方式 ：<input type="text" name="telephoneNo" id="contact2"></label>
						<div style="text-align: right">
							<input type="submit" value="修改" />
						</div>
						<br />
						&emsp;&emsp;<label class="affress">地址:</label>
						<br>
						 &emsp;&emsp;<label class="province">省：<input type="text" name="province" id="province2"></label><label class="city">市：<input type="text" name="city" id="city2"></label>
						 &emsp;&emsp;<label class="district">区：<input type="text" name="district" id="district2"></label><label class="other">详细地址：<input type="text" name="other" id="other2"></label>
						<br />
					</div>
				</form>

				<h1 align="center">第三条地址</h1>
				<form action="AddressAdministration" method="post">
					<div style="border: 3px solid #000">
						<input type="hidden" name="table" value="table3">
						<input type="hidden" name="event" value="isWrong3">
						<br />
						&emsp;&emsp;<label class="peopleOfReceive">收货人:&emsp; <input type="text" name="customer" id="peopleOfReceive3"></label>
						<!-- <div style="text-align: right">
							<input type="button" value="删除" />
						</div> -->
						<br />
						&emsp;&emsp;<label class="contact">联系方式 ：<input type="text" name="telephoneNo" id="contact3"></label>
						<div style="text-align: right">
							<input type="submit" value="修改" />
						</div>
						<br />
						&emsp;&emsp;<label class="affress">地址:</label>
						<br>
						&emsp;&emsp;<label class="province">省：<input type="text" name="province" id="province3"></label><label class="city">市：<input type="text" name="city" id="city3"></label>
						 &emsp;&emsp;<label class="district">区：<input type="text" name="district" id="district3"></label><label class="other">详细地址：<input type="text" name="other" id="other3"></label>
						<br />
					</div>
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
