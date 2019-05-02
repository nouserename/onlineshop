<%@page import="entity.Product"%>
<%@page import="entity.Product_administrator"%>
<%@page import="entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" content='text/html;Nebula'>
<title>Insert title here</title>
</head>
<body>
<a href="newlyincreased.jsp">新增手机</a>
<table border="1">
<tr>
<th>产品编号</th>
<th>手机名称</th>
<th>价格</th>
<th>处理器</th>
<th>像素</th>
<th>操作</th>


</tr>
<%
	Admin admin = (Admin)request.getSession().getAttribute("admin");
	Product_administrator product_administrator = new Product_administrator(admin);
	Product[] products = product_administrator.searchProduct("");
	for(Product p:products)
	{
		out.println("<tr> <td>"+p.getId()+"</td> <td>"+p.getName()+"</td> <td>"+p.getPrice()+"元</td> <td>"+p.getProcessor()+"</td><td>"+p.getPixel()+"百万</td><td><form action='/onlineshop/administrator/productmanager/ProductManager' method='post'><input hidden type='text' name='pid' value='"+p.getId()+"'><input type='submit' value='删除'></form></td></tr>");
	}
%>
</table>

</body>
</html>