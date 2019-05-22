<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="/onlineshop/css/style.css">
    <style type="text/css">
        .talk_con{
            width:600px;
            height:500px;
            border:1px solid #666;
            margin:50px auto 0;
            background:#f9f9f9;
        }
        .talk_show{
            width:580px;
            height:420px;
            border:1px solid #666;
            background:#fff;
            margin:10px auto 0;
            overflow:auto;
        }
        .talk_input{
            width:580px;
            margin:10px auto 0;
        }
        .whotalk{
            width:80px;
            height:30px;
            float:left;
            outline:none;
        }
        .talk_word{
            width:420px;
            height:26px;
            padding:0px;
            float:left;
            margin-left:10px;
            outline:none;
            text-indent:10px;
        }        
        .talk_sub{
            width:56px;
            height:30px;
            float:left;
            margin-left:10px;
        }
        .atalk{
           margin:10px; 
        }
        .atalk span{
            display:inline-block;
            background:#0181cc;
            border-radius:10px;
            color:#fff;
            padding:5px 10px;
        }
        .btalk{
            margin:10px;
            text-align:right;
        }
        .btalk span{
            display:inline-block;
            background:#ef8201;
            border-radius:10px;
            color:#fff;
            padding:5px 10px;
        }
    </style>
    <script type="text/javascript">      
    // 
    
    
    	
        window.onload = function(){
            var Words = document.getElementById("words");
            var Who = document.getElementById("who");
            var TalkWords = document.getElementById("talkwords");
            var TalkSub = document.getElementById("talksub");
            

            TalkSub.onclick = function(){
	            //定义空字符串
                var str = "";
                TalkWords.innerText = "";
                if(TalkWords.value == ""){
	                 // 消息为空时弹窗
                    alert("消息不能为空");
                    return;
                }
                /* if(Who.value == 0){
	                //如果Who.value为0n那么是 A说
                    str = '<div class="atalk"><span>A说 :' + TalkWords.value +'</span></div>';
                }
                else{
                    str = '<div class="btalk"><span>B说 :' + TalkWords.value +'</span></div>' ;  
                } */
                Words.innerHTML = Words.innerHTML + str;
                var httpRequest = new XMLHttpRequest();
            	httpRequest.open("post","RequestCustomerService",true);
            	httpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
            	httpRequest.send("word="+TalkWords.value);
            	httpRequest.onreadystatechange = function(){
            		if(httpRequest.status==200&&httpRequest.readyState==4)
            			{
            				var word = httpRequest.responseText;
            				if(word!=""){
            				Words.innerHTML = Words.innerHTML + '<div class="btalk"><span>' + TalkWords.value +'</span></div>';
			            	TalkWords.value = "";
            					
            				}
            			}
            	}
            	
            }
            self.setInterval("monitor()",1000);
            
            
            
            
        }

        	function monitor(){
        		var Words = document.getElementById("words");
        		var httpRequest1 = new XMLHttpRequest();
            	httpRequest1.open("get","RequestCustomerService",true);
            	httpRequest1.send();
            	httpRequest1.onreadystatechange = function(){
            		if(httpRequest1.status==200&&httpRequest1.readyState==4){
            			var return_word = httpRequest1.responseText;
            			if(return_word!="")
            				{
            				
            			Words.innerHTML = Words.innerHTML +  return_word ;
            				}
            		}
            	}
        }
    

    </script>
</head>
<body>
	<!-- start header -->
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="/onlineshop/user/userhomepage.jsp" target="_blank">星云商城</a></li>
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
							<li><a href="/onlineshop/index.jsp" target="_blank">登录</a></li>
							<li>|</li>
							<li><a href="/onlineshop/userregistration.jsp" target="_blank" >注册</a></li>
							<li>|</li>
							<li><a href="/onlineshop/mine/mine.jsp">我的</a></li>
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
			<a href="/onlineshop.index.jsp" target="_blank"><div class="logo fl"></div></a>
			<a href=""><div class="ad_top fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=1" target="_blank">Nebula1</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=2">Nebula2</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=3">Nebula3</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=4">Nebula4</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=5">Nebula5</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=6">Nebula6</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=7">NebulaX</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=8">NebulaX-plus</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=9">Nebula&galaxy</a></li>
					<li><a href="/onlineshop/user/shop/productdetails.jsp?proId=10">moon</a></li>
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
		<div class="talk_con">
        <div class="talk_show" id="words">
            
        </div>
        <div class="talk_input">
            
            <input type="text" class="talk_word" id="talkwords">
            <input type="button" value="发送" class="talk_sub" id="talksub">
        </div>
    </div>

	<!-- start banner_y -->
	<!-- end banner -->


		<footer class="mt20 center">			
			<div class="mt20">星云商城|星云UI|NebulaChat|星云书城|星云路由器|星云天猫店|星云淘宝直营店|星云移动|隐私政策|</div>
			<div>©xingyun.bjut.edu.cn 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>

	<!-- end danpin -->


	</body>
</html>
