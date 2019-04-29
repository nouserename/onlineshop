<%@page import="entity.Product"%>
<%@page import="entity.Customer"%>
<%@page import="entity.Order"%>
<%@page import="entity.Order_administrator"%>
<%@page import="entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>financial</title>
</head>
<body>
<table>
<tr>
<th>订单编号</th>
<th>客户手机号</th>
<th>客户名字</th>
<th>产品名字</th>
<th>产品价格</th>
<th>操作</th>
</tr>
<%
	Admin a = (Admin)request.getSession().getAttribute("admin");
    Order[] orders = a.searchOrder(Order.NR_waitForReturn);
    Customer customer;
	Product product;
	int len = orders.length;
	for(int i = 0;i<len;i++)
	{
		customer = new Customer(orders[i].getCustomer());
		product = new Product(orders[i].getProduct());
		out.println("<tr> <td>"+orders[i].getId()+"</td> <td>"+customer.getId()+"</td> <td>"+customer.getName()+"</td> <td>"+product.getName()+"</td> <td>"+product.getPrice()+"</td> <td> <form method='get' action='/onlineshop/administrator/financialmanager/FinancialManager'><input hidden type='text' name='orderId' value='"+orders[i].getId()+"'><input type='submit' value='打钱'></form></td></tr>");
	}
    
%>


</table>

</body>
</html>