<%@page import="entity.Product"%>
<%@page import="entity.Customer"%>
<%@page import="entity.Order"%>
<%@page import="entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>订单编号</th>
<th>客户手机号</th>
<th>客户名字</th>
<th>产品名字</th>
<th>产品价格</th>
<th></th>
<th></th>

</tr>

<%
	Admin a = (Admin)request.getSession().getAttribute("admin");
    Order[] orders = a.searchOrder(Order.NR_waitForReview);
    Customer customer;
	Product product;
	int len = orders.length;
	for(int i = 0;i<len;i++)
	{
		customer = new Customer(orders[i].getCustomer());
		product = new Product(orders[i].getProduct());
		out.println("<tr> <td>"+orders[i].getId()+"</td> <td>"+customer.getId()+"</td> <td>"+customer.getName()+"</td> <td>"+product.getName()+"</td> <td>"+product.getPrice()+"</td> <td> <form method='get' action='/onlineshop/administrator/aftersalesmanager/AfterSalesManager'><input hidden type='text' value='yes' name='kind'><input hidden type='text' name='orderId' value='"+orders[i].getId()+"'><input type='submit' value='同意'></form></td><td><form method='get' action='/onlineshop/administrator/aftersalesmanager/AfterSalesManager'><input hidden type='text' value='no' name='kind'><input hidden type='text' name='orderId' value='"+orders[i].getId()+"'><input type='submit' value='不同意'></td></tr>");
	}
    
%>
</table>
</body>
</html>