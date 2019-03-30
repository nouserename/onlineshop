
<%@page import="controler.Index"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>create new account</title>
    <link rel="stylesheet" href="css/globalcss.css" type="text/css" />
</head>
<style>
h1 {
  text-align: center;
}
div.nebula{
 position: static;
  margin: 0% 0% 0% 5%;
}
div.info{
 margin: 3% 30% 75% 43%;
}
</style>
</head>
<body>
<h1>������������ID</h1>

        <div id="pageHeader">
            <img src="NEBULA.jpg" alt="nebula"/>
			<form action="">
				<input type="text" name="search" id="search" placeholder="搜索">
				<input type="submit" name="searchButton" id="searchButton">
			</form>
            <ul id="ul">
				<li id="li1"><a href="">首页</a></li>
				<li id="li2"><a href="">购物车</a></li>
				<li id="li3"><a href="">我的</a></li>
			</ul>
     	</div>

<div class="info">

<form action="Index" method="POST">
账号:<br>
  <input type="text" name="userid" id="userid">
  <br>
密码:<br>
  <input type="text" name="passwd" id="passwd">
  <br>
<input type="radio" name = "kind" id="radio1" value = "customer">至尊客户
<input type="radio" name = "kind" id = "radio2" value = "admin">企业高管
<br>
  <input type="submit" value="Submit">

    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset">
</form>
    </div>
    
    
    <div id="pageFooter">
			<hr>
            <div id="eduction">
				<p><span class="caption">Nebula 与教育</span></p>
                <p class="detail">高校师生选购</p>
            </div>
            <div id="business">
                <p><span class="caption">Nebula 与商务</span></p>
                <p class="detail">商务选购</p>
            </div>
            <div id="nebulaValues">
				<p><span class="caption">Nebula 价值观</span></p>
                <p class="detail">辅助功能</p>
                <p class="detail">环境责任</p>
                <p class="detail">隐私</p>
                <p class="detail">供应商责任</p>
            </div>
            <div id="aboutNebula">
				<p><span class="caption">关于 Nebula</span></p>
                <p class="detail">Newsroom</p>
                <p class="detail">Nebula 管理层</p>
                <p class="detail">工作机会</p>
                <p class="detail">创造就业</p>
                <p class="detail">活动</p>
                <p class="detail">联系 Nebula</p>
            </div>
            <div id="authorize">
                <p>更多选购方式：前往 Nebula Store 商店。致电 000-000-0000。</p>
            </div>
			<hr>
            <div id="copyright">
                <p><span>Copyright &copy; 2019 Nebula Inc. 保留所有权利。</span> 隐私政策 | 使用条款 | 销售政策 | 法律信息 | 网站地图</p>
                <p>京公安网安备--------- 京ICP备10214630 营业执照 无线电发射设备销售备案编号---------</p>
            </div>
			<br>
        </div>
    
    
</body>
</html>

