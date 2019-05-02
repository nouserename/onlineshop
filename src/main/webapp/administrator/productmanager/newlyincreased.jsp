<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>add products</title>
</head>
<style>

input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
    -webkit-appearance: none;
}
 
input[type="number"] {
    -moz-appearance: textfield;
}
</style>
</head>
<body>
<form action="/onlineshop/administrator/productmanager/NewlyIncreased" method="post" enctype="multipart/form-data"> 
名称：<input type="text" name="name"><br/>
像素<input type="number" name="pixel" onkeypress="return (/[\d]/.test(String.fromCharCode(event.keyCode)))"><br/>
内存<input type="number" name="mem" onkeypress="return (/[\d]/.test(String.fromCharCode(event.keyCode)))"><br/>
处理器<input type="text" name="cpu"><br/>
描述<input type="text" name="des"><br/>
价格<input type="number" name="price" onkeypress="return (/[\d]/.test(String.fromCharCode(event.keyCode)))"><br/>
电池<input type="number" name="buttery" onkeypress="return (/[\d]/.test(String.fromCharCode(event.keyCode)))"><br/>
所属系列<input type="text" name="series"><br/>
图片<input type="file" name="picture">
<input type="submit" value="提交">
</form>
</body>
</html>