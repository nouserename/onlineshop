<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<div class="text" style=" text-align:center;"><br />&emsp;&emsp;&emsp;&emsp;&emsp;星云手机值得拥有</div><br />
<form action="AddNewPerson" method="post">
&emsp;昵称&emsp;&emsp;<input type="text" name="nichen" Size=30 /><br />
&emsp;手机号&emsp;&emsp;<input type="text" name="username" Size=30 /><br />
&emsp;密码&emsp;&emsp;<input type="text" name="passwd" Size=30 /><br />
 再次确认&emsp;<input type="text" Size=30 /><br />
&emsp;类别&emsp;&emsp;<select name="adminkind">
					  <option value ="1">财务管理员</option>
					  <option value ="2">售后管理员</option>
					  <option value="3">root</option>
					  <option value="4">产品管理员</option>
					  <option value="5">订单管理员</option>
					</select><br />
&emsp;&emsp;&emsp;&emsp;&emsp;<input type="submit"  title="确认" value="确认" />&emsp;&emsp;&emsp;&emsp;&emsp;<input type="button" id="btn2" title="清空" value="清空" /></center><br />
</form>

</body>
</html>