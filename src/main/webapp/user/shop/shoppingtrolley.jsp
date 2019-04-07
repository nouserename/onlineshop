<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="entity.Product"%>
<%@page import="entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>我的购物车-小米商城</title>
		<link rel="stylesheet" type="text/css" href="../../css/style.css">
	</head>
	<body>
	<!-- start header -->
	<!--end header -->
<script type="text/javascript">
	function getSelectNumber(){
		var len = 0;
		var price = 0;
		var pro = document.getElementsByClassName("oneProduct");
		var proLen = pro.length;
		for(var i = 0;i<proLen;i++){
			if(pro[i].checked == true){
				var e = pro[i].parentElement;
				alert(e.length);
				price+=parseInt(e.innerHTML);
				len++;
			}
		}
		document.getElementById("selectedNumber").innerHTML = len;
		document.getElementById("selectAllPrice").innerHTML = price;
	}
	
	function allCheck(){
			var pro = document.getElementsByClassName("oneProduct");
			
			var len = pro.length;
		var all = document.getElementById("selectAll");
		if(all.checked==false){
			for(var i = 0;i<len;i++){
				pro[i].checked = false;
			}
		}else{
			for(var i = 0;i<len;i++){
				pro[i].checked = true;
			}
		}
	}
</script>
<!-- start banner_x -->
		<div class="banner_x center">
			<a href="./index.html" target="_blank"><div class="logo fl"></div></a>
			
			<div class="wdgwc fl ml40">我的购物车</div>
			<div class="wxts fl ml20">温馨提示：产品是否购买成功，以最终下单为准哦，请尽快结算</div>
			<div class="dlzc fr">
				<ul>
					<li><a href="./login.html" target="_blank">登录</a></li>
					<li>|</li>
					<li><a href="./register.html" target="_blank">注册</a></li>	
				</ul>
				
			</div>
			<div class="clear"></div>
		</div>
		<div class="xiantiao"></div>
		<div class="gwcxqbj">
			<div class="gwcxd center">
				<div class="top2 center">
					<div class="sub_top fl">
						<input id="selectAll" type="checkbox" value="quanxuan" class="quanxuan" onclick="allCheck()" />全选/取消全选
					</div>
					<div class="sub_top fl">商品名称</div>
					<div class="sub_top fl">单价</div>
					<div class="sub_top fl">数量</div>
					<div class="sub_top fl">小计</div>
					<div class="sub_top fr">操作</div>
					<div class="clear"></div>
				</div>
				<form id="myFrom" action="" method="post">
				<div class="content2 center">
					<div class='sub_content fl '>
						<input type='checkbox' value='quanxuan' class='oneProduct' />
					</div>
					<div class='sub_content fl'><img src=''></div>
					<div class='sub_content fl ft20'>小米6全网通6GB内存+64GB 亮黑色</div>
					<div class='sub_content fl '>2499元</div>
					<div class="sub_content fl">
						<input class='shuliang' type='number' value='1' step='1' min='1' >
					</div>
					<div class='sub_content fl'>2499元</div>
					<div class='sub_content fl'><a href=''>×</a></div>
					<div class='clear'></div>
				</div>
				<%
				Customer customer = (Customer)request.getSession().getAttribute("customer");
				Map<Product,Integer> map = customer.searchTrolley(customer);
				int len = map.size();
				int allPrice = 0;
				Set<Product> keySet = map.keySet();
				for(Product product:keySet)
				{
					// 					out.print("<div class='content2 center'>");
// 					out.print("<div class='sub_content fl '>");
// 					out.print("<input type='checkbox' value='quanxuan' class='quanxuan' />");
// 					out.print("</div>");
// 					out.print("<div class='sub_content fl'><img src=''></div>");
// 					out.print("<div class='sub_content fl ft20'>"+product.getName()+"</div>");
// 					out.print("<div class='sub_content fl '>"+product.getPrice()+"元</div>");
// 					out.print("<input class='shuliang' type='number' value='"+map.get(product)+"' step='1' min='1' >");
// 					out.print("</div>");
// 					out.print("<div class='sub_content fl'>"+product.getPrice()+"元</div>");
// 					out.print("<div class='sub_content fl'><a href=''>×</a></div>");
// 					out.print("<div class='clear'></div>");
// 					out.print("</div>");
					int count = map.get(product);
					double price = product.getPrice();
					allPrice+=count*price;
					String info =
				"<div class='content2 center'>"
					+"<div class='sub_content fl '>"
						+"<input type='checkbox' value='quanxuan' class='oneProduct' onclick='getSelectNumber()' />"
					+"</div>"
					+"<div class='sub_content fl'><img src=''></div>"
					+"<div class='sub_content fl ft20'>"+product.getName()+"</div>"
					+"<div class='sub_content fl '>"+price+"元</div>"
					+"<div class='sub_content fl'>"
					+"<input class='shuliang' type='number' value='"+count+"' step='1' min='1' >"
					+"</div>"
					+"<div  class='sub_content fl'><span>"+price*count+"<span>元</div>"
					+"<div class='sub_content fl'><a href=''>×</a></div>"
					+"<div class='clear'></div>"
				+"</div>";
					out.println(info);
				}
				%>
				<div class="content2 center">
					<div class='sub_content fl '>
						<input type='checkbox' value='quanxuan' class='oneProduct' />
					</div>
					<div class='sub_content fl'><img src=''></div>
					<div class='sub_content fl ft20'>小米6全网通6GB内存+64GB 亮黑色</div>
					<div class='sub_content fl '>2499元</div>
					<div class="sub_content fl">
						<input class='shuliang' type='number' value='1' step='1' min='1' >
					</div>
					<div class='sub_content fl'>2499元</div>
					<div class='sub_content fl'><a href=''>×</a></div>
					<div class='clear'></div>
				</div>
				<div class="content2 center">
					<div class='sub_content fl '>
						<input type='checkbox' value='quanxuan' class='oneProduct' />
					</div>
					<div class='sub_content fl'><img src=''></div>
					<div class='sub_content fl ft20'>小米6全网通6GB内存+64GB 亮黑色</div>
					<div class='sub_content fl '>2499元</div>
					<div class="sub_content fl">
						<input class='shuliang' type='number' value='1' step='1' min='1' >
					</div>
					<div class='sub_content fl'>2499元</div>
					<div class='sub_content fl'><a href=''>×</a></div>
					<div class='clear'></div>
				</div>
				<div class="content2 center">
					<div class="sub_content fl ">
						<input type="checkbox" value="quanxuan" class="oneProduct" />
					</div>
					<div class="sub_content fl"><img src="./image/gwc_xiaomi6.jpg"></div>
					<div class="sub_content fl ft20">小米6全网通6GB内存+64GB 亮黑色</div>
					<div class="sub_content fl ">2499元</div>
					<div class="sub_content fl">
						<input class="shuliang" type="number" value="1" step="1" min="1" >
					</div>
					<div class="sub_content fl">2499元</div>
					<div class="sub_content fl"><a href="">×</a></div>
					<div class="clear"></div>
				</div>
				</form>
			</div>
			<div class="jiesuandan mt20 center">
				<div class="tishi fl ml20">
					<ul>
						<li><a href="./liebiao.html">继续购物</a></li>
						<li>|</li>
						<li>共<span><%=len %></span>件商品，已选择<span id="selectedNumber"></span>件</li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="jiesuan fr">
					<div class="jiesuanjiage fl">合计（不含运费）：<span id="selectAllPrice">元</span></div>
					<div class="jsanniu fr"><input class="jsan" type="submit" name="jiesuan"  value="去结算"/></div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
			
		</div>

  

	
	<!-- footer -->
	<div>
	<footer class="center">
			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
	</div>

	</body>
</html>
