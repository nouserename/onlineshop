<%@page import="java.net.InetAddress"%>
<%@page import="entity.exception.ProdutNotFoundException"%>
<%@page import="entity.Product"%>
<%@page import="entity.Finance_administrator"%>
<%@page import="entity.Admin"%>
<%@page import="entity.Customer"%>
<%@page import="java.lang.Exception"%>
<%@page import="java.io.File" %>
<%@page import="static controler.Index.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>小米6立即购买-小米商城</title>
		<link rel="stylesheet" type="text/css" href="../../css/style.css">
	</head>
	<body>
<%
	try{
		String proId = request.getParameter("proId");
		Product product =new Customer().searchProduct(Integer.parseInt(proId));
		
	}catch(Exception e){
		response.sendRedirect(request.getContextPath()+"/user/userhomepage.jsp");
	}
	
%>
<script type="text/javascript">
	
	
	function getRequest() {
	  var url = window.location.search; //获取url中"?"符后的字串
	  var theRequest = new Object();
	  if (url.indexOf("?") != -1) {
	    var str = url.substr(1);
	    strs = str.split("&");
	    for(var i = 0; i < strs.length; i ++) {
	      
	      theRequest[strs[i].split("=")[0]]=decodeURI(strs[i].split("=")[1]);
	      
	    }
	  }
	  return theRequest;
	}
	var proId= getRequest().proId;
	var httpRequest = new XMLHttpRequest();
	function add() {
		httpRequest.open("get","ProductDetail?proId="+proId,true);
		httpRequest.send();
		httpRequest.onreadystatechange = function(){
			if(httpRequest.readyState == 4 && httpRequest.status == 200)
				{
					var c = httpRequest.responseText;
					if(c=="yes"){
						alert("加入购物车成功");
					}else if (c=="no") {
						alert("加入购物车失败");
					}else{
						alert("服务器返回了无法处理的数据");
					}
				}
		}
	}
	
	
	

</script>


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

	
	<!-- xiangqing -->
	<%
		Customer customer = new Customer();
		String proId = request.getParameter("proId");
		Product product = customer.searchProduct(Integer.parseInt(proId));
		int dm = product.getMemory()*2;
		int hp = (int)product.getPrice()+500;
		String discription;
		if(product.getDescription()[0]!=null&& !product.getDescription()[0].equals("null"))
			discription = product.getDescription()[0];
		else
			discription = "目前没有对该商品的描述";
		String info = "";
		out.println();
	%>
	<form action="ProductDetail" method="post">
	<div class="xiangqing">
		<div class="neirong w">
			<div class="xiaomi6 fl"><%product.getName(); %></div>
			<nav class="fr">
				<li><a href="">概述</a></li>
				<li>|</li>
				<li><a href="">变焦双摄</a></li>
				<li>|</li>
				<li><a href="">设计</a></li>
				<li>|</li>
				<li><a href="">参数</a></li>
				<li>|</li>
				<li><a href="">F码通道</a></li>
				<li>|</li>
				<li><a href="">用户评价</a></li>
				<div class="clear"></div>
			</nav>
			<div class="clear"></div>
		</div>	
	</div>
	
	<div class="jieshao mt20 w">
	<%
		String im = "image";
		String n = product.getImages()[0].split("/")[1];
	%>
		<div class="left fl"><img height="100%" width="100%" src=<%="http://"+nip+":"+npt+"/onlineshop"+ File.separator+im+File.separator+n %>></div>
		<div class="right fr">
			<div class="h3 ml20 mt20"><%= product.getName() %></div>
			<div class="jianjie mr40 ml20 mt10"><%=discription %></div>
			<div class="jiage ml20 mt10"><%=product.getPrice() %>元</div>
			<div class="ft20 ml20 mt20">选择版本</div>
			<div class="xzbb ml20 mt10">
				<div class="banben fl">
					<a>
						<span>全网通版 6GB+<%=product.getMemory() %>GB </span>
						<span><%=product.getPrice() %>元</span>
					</a>
				</div>
				<div class="banben fr">
					<a>
						<span>全网通版 6GB+<%= dm %>GB</span>
						<span><%= hp %>元</span>
					</a>
				</div>
			</div>
			<div class="ft20 ml20 mt20">选择颜色</div>
			<div class="xzbb ml20 mt10">
				<div class="banben" style="float: left;">
					<a>
						<span class="yuandian"></span>
						<span class="yanse">亮黑色</span>
					</a>
				</div>
				<div class="banben" style="float: right;">
					<a>
						<span class="yuandian"></span>
						<span class="yanse">大强黑</span>
					</a>
				</div>
				
				<div class="clear"></div>
			</div>
			<div class="xqxq mt20 ml20">
				<div class="top1 mt10">
					<div class="left1 fl"><%=product.getName() %> 全网通版 6GB内存 <%=product.getMemory() %>GB 亮黑色</div>
					<div class="right1 fr"><%=product.getPrice() %>元</div>
					<div class="clear"></div>
				</div>
				<div class="bot mt20 ft20 ftbc">总计：<%=product.getPrice() %>元</div>
			</div>
			<div class="xiadan ml20 mt20">
					<input type="text" hidden name = "pid" value=<%=proId %>>
					<input class="jrgwc"  type="submit" name="jrgwc" value="立即选购" />
					<input class="jrgwc" type="button" name="jrgwc" onclick = "add()"value="加入购物车" />
				
			</div>
		</div>
		<div class="clear"></div>
	</div>
	</form>
	<!-- footer -->
	<footer class="mt20 center">			
			<div class="mt20">星云商城|星云UI|NebulaChat|星云书城|星云路由器|星云天猫店|星云淘宝直营店|星云移动|隐私政策|</div>
			<div>©xingyun.bjut.edu.cn 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>

	</body>
</html>