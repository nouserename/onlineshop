/**  
* @Title: Mine.java  
* @Package controler.user.mine  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.user.mine;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Address;
import entity.Customer;
import entity.Database;
import entity.Order;

/**
 * @author SongKaikai
 *
 */
public class Mine extends HttpServlet{
	/**  
	* 创建一个新的实例 Mine.  
	*    
	*/
	Order[] orders;
	Customer customer;
	public Mine() {
		// TODO 自动生成的构		customer = new Customer();
//		orders = customer.searchOrder();
	}
	/**
	* <p>Title: doGet</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		System.out.println("该订单号是：" + id);
		Customer customer =  (Customer)req.getSession().getAttribute("customer");
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			boolean bool = customer.applyAfterSales(Integer.parseInt(id));
			System.out.println("该SQL的结果是：" + bool);
			if(bool)
				writer.println("申请成功！");
			else
				writer.println("申请失败，请稍后再试！");
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	* <p>Title: doPost</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("event").equals("onload")) {
			//System.out.println("加载了两次！");
			Customer customer =  (Customer)req.getSession().getAttribute("customer");
			Address[] address = customer.getAddr();
			String ad = customer.getName() + ";" + customer.getId() + ";" + address[0].getAddress() + ";" + address[1].getAddress() + ";" + address[2].getAddress() ;
			resp.setContentType("text/html;charset=UTF-8");	
			PrintWriter writer = resp.getWriter();
			writer.println(ad);
			writer.flush();
			writer.close();
		}else if (req.getParameter("event").equals("overallOrders")) {
			//System.out.println("输出全部订单！");
			printOrder(req, resp, -1);	//输出全部订单
		}else if(req.getParameter("event").equals("daifahuo")){
			printOrder(req, resp, Order.NR_waitForReceiving);
		}else if (req.getParameter("event").equals("daishouhuo")) {
			printOrder(req, resp, Order.NR_unCollected);
		}else if (req.getParameter("event").equals("dengdaishenhe")) {
			printOrder(req, resp, Order.NR_waitForReview);
		}else if (req.getParameter("event").equals("address1")) {
			String str = req.getParameter("address");
			modifyAddress(req, resp, str, 1);
		}else if (req.getParameter("event").equals("address2")) {
			String str = req.getParameter("address");
			modifyAddress(req, resp, str, 2);
		}else{
			System.out.println(req.getParameter("event"));
			String str = req.getParameter("address");
			modifyAddress(req, resp, str, 3);
		}
	}
	
	void modifyAddress(HttpServletRequest req, HttpServletResponse resp,String address,int num)
	{
		Customer customer =  (Customer)req.getSession().getAttribute("customer");
		String sql = "UPDATE customer SET addr" + num + "='" + address + "' WHERE customer_id=" + customer.getId();
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			
			if(Database.executeUpdate(sql) == 0)
				writer.println("修改失败，请重新尝试!");
			else
				writer.println("修改成功！");
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	void printOrder(HttpServletRequest req, HttpServletResponse resp,int state) {
		Customer customer =  (Customer)req.getSession().getAttribute("customer");
		try {
			
			resp.setContentType("text/html;charset=UTF-8");	
			PrintWriter writer = resp.getWriter();
			
			String[] str = customer.searchOrderFullInfo(customer,state);	//查询该状态订单
			
			if(str == null)
			{
				writer.println("<div class='ddzxbt'>交易订单</div>");
				writer.println("<div class='ddxq'>订单为空！</div>");
			}else {
				//String st = "今天必须成功";
				//System.out.println(st);
				//writer.println(st);
				//wr.println(st);
				
				writer.println("<div class='ddzxbt'>交易订单</div>");
				//System.out.println("怎么回事!");
				
				for(int i=0;i<str.length;i++)
				{
					String[] stringSplit = str[i].split(";");
					writer.println("<div class='ddxq'>"
							+ "<div class='ddspt fl'><img src= '../../"+ stringSplit[0] +"' alt='加载失败' style=\"height:5em;width:5em;\"></div>"
							+ "<div class='ddbh fl'>订单号:"+ stringSplit[1] +"</div>"
							+ "<div class='ztxx fr'>"
							+ "<ul>"
							+     "<li id=\"li"+ stringSplit[1] + "\"><font size=\"2em\">"+ exchangeState(Integer.parseInt(stringSplit[2])) +"</font></li>"
							+     "<li>" + stringSplit[3] +"</li>"
							+     "<li>"+ "地址" +"</li>"
							+	  "<li><button class=\"applyAfterSales\" id=\"button" + stringSplit[1] + " \" onclick=\"applyAfterSales('"+ stringSplit[1] + "')\">申请售后</input></li>"
							+     "<div class='clear'></div>"
							+ "</ul>"
							+"</div>"
							+"<div class='clear'></div>"
							+"</div>"
							);	
				}
				
				
			}
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	String exchangeState(int state) {
		switch (state) {
		case Order.NR_waitForReceiving:
			return "未发货";
		case Order.NR_unCollected:
			return "未收货";
		case Order.NR_Collected:
			return "已收货";
		case Order.NR_waitForReview:
			return "等待审核";
		case Order.NR_waitForReturn:
			return "卖家等待买家退货 ";
		case Order.NR_returnedFinish:
			return "退货完成";
		case Order.NR_reviewNotPass:
			return "审核未通过";
		default:
			return "状态出错";
		}
	}
	
}


