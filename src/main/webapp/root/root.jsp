<%@page import="entity.Admin"%>
<%@page import="entity.Root"%>
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

<a href="root/addnewperson.jsp">新增管理员</a>
<table border="1">
<tr>
<th>姓名</th>
<th>ID</th>
<th>类别</th>
</tr>
<%
	Admin a = (Admin)request.getSession().getAttribute("admin");
	Root root = new Root(a);
	Admin[] admins = root.findAdmin();
	String kind = "空";
	for(int i = 0;i<admins.length;i++)
	{
		switch(admins[i].getState()){
			case Admin.aftersale_adm:
				kind = "售后管理员";
				break;
			case Admin.finance_adm:
				kind = "财务管理员";
				break;
			case Admin.order_adm:
				kind = "订单管理员";
				break;
			case Admin.product_adm:
				kind = "产品管理员";
				break;
			case Admin.root_adm:
				kind = "root";
				break;
			default:
				break;
		
		}
		out.println("<tr> <td>"+admins[i].getName()+"</td> <td>"+admins[i].getId()+"</td>  <td>"+kind+"</td> </tr>");
	}
%>
</table>

</body>
</html>