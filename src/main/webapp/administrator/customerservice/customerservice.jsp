<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    
    
</head>
<body>
<script type="text/javascript">
self.setInterval("query()",3000);
function query(){
	var h3 = document.getElementsByTagName("h3")[0];
	var form = document.getElementsByTagName("form")[0];
	var httpRequest = new XMLHttpRequest();
	httpRequest.open("get","CustomerService",true);
	httpRequest.send();
	httpRequest.onreadystatechange = function(){
		if(httpRequest.status==200&&httpRequest.readyState==4){
			var result = httpRequest.responseText;
			if(result=='no'){
				h3.innerHTML = "当前没有等待服务的客户";
				form.innerHTML = "" ;

			}else{
				h3.innerHTML = "当前需要服务的客户是"+result;
				form.innerHTML = "<input type='text' hidden value = '"+result+"' name='customerId'> <input type='submit' value='开始服务'>" ;
			}
		}
		
	}
	
	
	
}



</script>
    <h3></h3>
    <form action="CustomerService" method="post">
    
    </form>
</body>
</html>
