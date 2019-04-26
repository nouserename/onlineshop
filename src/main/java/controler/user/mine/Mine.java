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
		// TODO 自动生成的构造函数存根
		customer = new Customer();
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
		// TODO 自动生成的方法存根
		super.doGet(req, resp);
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
			Customer customer =  (Customer)req.getSession().getAttribute("customer");
			Address[] address = customer.getAddr();
			String ad = customer.getName() + ";" + customer.getId() + ";" + address[0].getAddress() + ";" + address[1].getAddress() + ";" + address[2].getAddress() ;
			resp.setContentType("text/html;charset=UTF-8");	
			PrintWriter writer = resp.getWriter();
			writer.println(ad);
			writer.flush();
			writer.close();
		}else if (req.getParameter("event").equals("overallOrders")) {
			Customer customer =  (Customer)req.getSession().getAttribute("customer");
			try {
				int len = customer.searchOrder(customer).length;
				Order[] overallOrders = new Order[len];
				overallOrders =	customer.searchOrder(customer);
				
				
				
				resp.setContentType("text/html;charset=UTF-8");	
				PrintWriter wr = resp.getWriter();
				
				String st = "今天必须成功";
				System.out.println(st);
				//writer.println(st);
				wr.println(st);
				
//				writer.println("<div class='ddzxbt'>交易订单</div>");
				
//				for(int i=0;i<len;i++) {
//					String info = customer.searchInfoOfProduct(overallOrders[i].getProduct());
//					String[] pro = info.split(";");
//					System.out.println("该商品信息为："+pro[0] + pro[1]);
//					
//					writer.println("<div class='ddxq'>"
//							+ "<div class='ddspt fl'><img src= "+ pro[0] +" alt='加载失败'></div>"
//							+ "<div class='ddbh fl'>订单号:"+ overallOrders[i].getId() +"</div>"
//							+ "<div class='ztxx fr'>"
//							+ "<ul>"
//							+     "<li>已发货</li>"
//							+     "<li>" + pro[1] +"</li>"
//							+     "<li>"+ "地址" +"</li>"
//							+     "<div class='clear'></div>"
//							+ "</ul>"
//							+"</div>"
//							+"<div class='clear'></div>"
//							+"</div>"
//							);
//					
//					
//				}
				
				wr.flush();
				wr.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
