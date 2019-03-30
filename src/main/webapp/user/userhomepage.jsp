<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Language" content="zh-cn" />
<title>Insert title here</title>
</head>
<body>
<%
	
	String sessionId = session.getId();
	if(session.isNew()){
		response.getWriter().print("sessionId="+sessionId);
	}
	else{
		response.getWriter().print("failed"+sessionId);
	}
%>
<form action="" method="get">
<input type="text" name="s" class="input" placeholder="输入 回车搜索" autofocus x-webkit-speech>
<input type="button" name="" id="" class="btn">
</form>

<div style="position: absolute; top: 10px; right:200px;">
<a href="/example/html/lastpage.html" style="text-decoration:none" >
首页
</a>
</div>
<div style="position: absolute; top: 10px; right:100px;">
<a href="/example/html/lastpage.html" style="text-decoration:none" >
购物车
</a>
</div>
<div style="position: absolute; top: 10px; right:10px;">
<a href="/example/html/lastpage.html" style="text-decoration:none" >
我的
</a>
</div>
<p align="center";">星云手机1</p>
<p align="center";">星云手机2</p>
<p align="center";">星云手机3</p>
</body>
</html>