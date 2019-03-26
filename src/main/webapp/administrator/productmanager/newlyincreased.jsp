<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>addproducts</title>
</head>
<style>


body{
line-height: 250%;
    position: absolute;
    left: 30%;
    top:10%
}

</style>
</head>
<body>

<div class="info">
    <form action=" ">
        商品名称:<input type="text" name="productsname">
        价格:<input type="text" name="price">
        <br>
        像素:<input type="text" name="pixel">
        电池容量:<input type="text" name="battery">
        <br>
        内存:<input type="text" name="EMS memory">
        系列名称:<input type="text" name="product line">
        <br>
        CPU:<input type="text" name="cpu">
        <script>
        </form>
function myFunction() {
  var x = document.getElementById("myFile");
  var x = document.getElementById("1");
   var x = document.getElementById("2");
    var x = document.getElementById("3");
     var x = document.getElementById("4");
      var x = document.getElementById("5");
       var x = document.getElementById("6");
  x.disabled = true;
}
 </script>
<br><br>


        缩略图：<input type="file" id="myFile">
        用户首页展示图：<input type="file" id="1">
       <br> 商品详细1图：<input type="file" id="2">
        商品详细2图：<input type="file" id="3">
       <br> 商品详细3图：<input type="file" id="4">
        商品详细4图：<input type="file" id="5">
 <br> 商品详细5图：<input type="file" id="6">
    <br><br>

      商品详细1文字:<input type="text" name="1">
        商品详细2文字:<input type="text" name="2">
        <br>
        商品详细3文字:<input type="text" name="3">
       商品详细4文字:<input type="text" name="4">
        <br>
        商品详细5文字:<input type="text" name="5">
        <br>
        用户首页文字:<input type="text" name="6">
        <br>
        <input type="submit" value="Submit">

      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </form>
    </div>
</body>
</html>