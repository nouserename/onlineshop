<%@page import="tool.Security"%>
<%@page import="entity.Product"%>
<%@page import="entity.Customer"%>
<%@page import="static controler.Index.*" %>
<%@page import="java.io.File" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="北京工业大学"/>
		<title>星云商城</title>
		<link rel="stylesheet" type="text/css" href="../css/style.css">
	</head>
	<body>
	<%
		Customer customer = (Customer)request.getSession().getAttribute("customer");
		if(customer==null)
		{
			Thread.sleep(1000);
			out.println("<script type=\"text/javascript\"> function wornning(){alert(\"您还没有登陆，亲先登陆！\"); window.location.href=\"../index.jsp \";}</script>");
		}
	%>
	<script type="text/javascript">
	window.onload =  wornning();
	
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

	<!-- start banner_y -->
		<div class="banner_y center">
			<div class="nav">				
			</div>
		
		</div>	

		<div class="sub_banner center">
			<div class="datu fl"><a href=""><img src="./image/hongmi4x.png" alt=""></a></div>
			<div class="datu fl"><a href=""><img src="./image/xiaomi5.jpg" alt=""></a></div>
			<div class="datu fr"><a href=""><img src="./image/pinghengche.jpg" alt=""></a></div>
			<div class="clear"></div>


		</div>
	<!-- end banner -->
	<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>

	<!-- start danpin -->
		<div class="danpin center">
		<div class="peijian w">
			<div class="biaoti center">属于你的Nebula系列</div>
			<div class="main center" style="height: auto;">
				<div class="content">
					<div class="remen fl">
					<div class="xinpin"><span>新品</span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=1"><img src="../image/Nebula1.jpg"></a></div>
						<div class="miaoshu"><a href="">Nebula1</a></div>
						<div class="jiage">1999元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=1">
								<span>牛皮牛皮666</span>
								<span>来自黑暗游侠的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span>新品</span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=2"><img src="../image/Nebula2.jpg"></a></div>
						<div class="miaoshu"><a href="">Nebula2</a></div>
						<div class="jiage">2999元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=2">
								<span>卢本伟牛逼</span>
								<span>来至于复仇之魂的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=3"><img src="../image/Nebula3.jpg"></a></div>
						<div class="miaoshu"><a href="">Nebula3</a></div>
						<div class="jiage">3999元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=3">
								<span>安拉胡阿克巴</span>
								<span>来至于撼地神牛的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:red">享6折</span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=4"><img src="../image/Nebula4.jpg"></a></div>
						<div class="miaoshu"><a href="">Nebula4</a></div>
						<div class="jiage">4999元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=4">
								<span>安拉胡阿克巴！</span>
								<span>来至于世界和平组织的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=5"><img src="../image/Nebula5.jpg"></a></div>
						<div class="miaoshu"><a href="">Nebula5</a></div>
						<div class="jiage">5999元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=5">
								<span>吃火锅不吃底料！</span>
								<span>来至于世界之树的评价</span>
							</a>
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<div class="content" >
					<div class="remen fl">
					<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=6"><img src="../image/Nebula6.jpg"></a></div>
						<div class="miaoshu"><a href="">Nebula6</a></div>
						<div class="jiage">5000元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=6">
								<span>垃圾东西！</span>
								<span>来至于矮人火枪手的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=7"><img src="../image/NebulaX.jpg"></a></div>
						<div class="miaoshu"><a href="./shop/productdetails.jsp?proId=7">NebulaX</a></div>
						<div class="jiage">10999元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=7">
								<span>66666666！</span>
								<span>来至于剧毒术士的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=8"><img src="../image/NebulaX-plus.jpg"></a></div>
						<div class="miaoshu"><a href="./shop/productdetails.jsp?proId=8">NebulaX-plus</a></div>
						<div class="jiage">12999元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=8">
								<span>3333333！</span>
								<span>来至于炼金术士的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=9"><img src="../image/Nebula&galaxy.jpg"></a></div>
						<div class="miaoshu"><a href="./shop/productdetails.jsp?proId=9">Nebula&galaxy</a></div>
						<div class="jiage">18999元</div>
						<div class="pingjia">775人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=9">
								<span>扎西德勒</span>
								<span>来至于冰封王座的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href="./shop/productdetails.jsp?proId=11"><img src="../image/moon.jpg"></a></div>
						<div class="miaoshu"><a href="./shop/productdetails.jsp?proId=11">moon</a></div>
						<div class="jiage">5888元</div>
						<div class="pingjia">775人评价</div>
						<div class="piao">
							<a href="./shop/productdetails.jsp?proId=11">
								<span>扎西德勒</span>
								<span>来至于冰封王座的评价</span>
							</a>
						</div>
					</div>
					<!-- <div class="remenlast fr">
						<div class="hongmi"><a href=""><img src="./image/hongmin4.png" alt=""></a></div>
						<div class="liulangengduo"><a href=""><img src="./image/liulangengduo.png" alt=""></a></div>					
					</div> -->
					<div class="clear"></div>
					
				</div>				
					<%
					String a = "<div class=\"content\" style=\"margin-top:14px; \">";
					String b = "<div class=\"clear\"></div></div>";
					Product[] products = customer.searchProduct("");
					int down = 5;
					int len = products.length;
					int i = 0;
					int j = 0;
					int step = 0;
					while(step<len)
					{
						
							out.println(a);
						
					for(i = step;i<(step+5)&&i<len;i++)
					{
						
						if(products[i].getId()>0)
						{
							String t = Security.createWord(3, 10);
							String n = products[i].getImages()[0].split("/")[1];
							String imgP = "http://"+nip+":"+npt+File.separator+"onlineshop"+File.separator+"image"+File.separator+n;
							String info = " <div class=\"remen fl\"> ";
							info+="<div class=\"xinpin\"><span style=\"background:#fff\"></span></div> ";
							info+="<div class=\"tu\"><a href=\"./shop/productdetails.jsp?proId="+products[i].getId()+" \"><img src="+imgP+"></a></div> ";
							info+="<div class=\"miaoshu\"><a href=\"./shop/productdetails.jsp?proId="+products[i].getId()+" \">"+products[i].getName()+"</a></div> ";
							info+="<div class=\"jiage\">"+products[i].getPrice()+"元</div> ";
							info+="<div class=\"pingjia\">"+(int)(1+Math.random()*(1000-1+1))+"人评价</div> ";
							info+="<div class=\"piao\"> ";
							info+="<a href=\"./shop/productdetails.jsp?proId="+products[i].getId()+" \"> ";
							info+="<span>扎西德勒</span>";
							info+="<span>来至于"+t+"的评价</span>";
							info+="</a></div></div>";
							
								out.println(info);
							
							
						}
						
						
					}
						out.println(b);
					
					step+=5;
					}
					
					%>
			</div>
		</div>
		<div class="clear"></div>
		<footer class="mt20 center">			
			<div class="mt20">星云商城|星云UI|NebulaChat|星云书城|星云路由器|星云天猫店|星云淘宝直营店|星云移动|隐私政策|</div>
			<div>©xingyun.bjut.edu.cn 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
	</body>
</html>