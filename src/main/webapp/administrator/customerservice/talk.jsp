<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
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
            	httpRequest.open("post","Talk",true);
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
            	httpRequest1.open("get","Talk",true);
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
<a href="customerservice.jsp">返回首页</a>
    <div class="talk_con">
        <div class="talk_show" id="words">
            
        </div>
        <div class="talk_input">
            
            <input type="text" class="talk_word" id="talkwords">
            <input type="button" value="发送" class="talk_sub" id="talksub">
        </div>
    </div>
</body>
</html>
