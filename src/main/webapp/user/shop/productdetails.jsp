<%@page import="entity.Product"%>
<%@page import="entity.Finance_administrator"%>
<%@page import="entity.Admin"%>
<%@page import="entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>商品详情</title>
</head>
<body>
<%
	String proId = request.getParameter("proId");
	Product product =new Customer().searchProduct(Integer.parseInt(proId));
	
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
<input type="button" onclick="add()" name="加入购物车" value="加入购物车">
此界面能做的不来不能还不到一定呢，先放一边吧！

</body>
</html>