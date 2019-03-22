
<%@page import="controler.Index"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>create new account</title>
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
<div class="nebula"><img src="NEBULA.jpg" alt="nebula" width="100" height="100"/>
</div>
<h1>������������ID</h1>
<div class="info">

<form action="Index" method="POST">
  �ǳ�:<br>
  <input type="text" name="kickname" id="kickname">
  <br>
  ����:<br>
  <input type="text" name="address" id="address">
  <br>
    ����:<br>
  <input type="password" name="password" id="password">
  <br>
    ȷ������:<br>
  <input type="password" name="verifypassword" >
  <br><br>
  <input type="submit" value="Submit">

    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset">
</form>
    </div>
</body>
</html>

