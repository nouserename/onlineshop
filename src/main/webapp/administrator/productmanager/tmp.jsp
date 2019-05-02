<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var time = 5;
		var secondEle = document.getElementById("second");
		var timer = setInterval(function(){
			secondEle.innerHTML = time;
			time--;
			if(time==0){
				clearInterval(timer);
				location.href="./newlyincreased.jsp";
			}
				
		},1000);
	}
</script>
</head>
<body>
	 <h2><%=request.getAttribute("message")%></h2>
	 <h2><%=request.getAttribute("smessage")%></h2>
	 <br/>
	 <span style="color:red" id="second">5</span>秒钟后跳转，如不跳转点击<a href="./newlyincreased.jsp">这里</a>!
</body>
</html>