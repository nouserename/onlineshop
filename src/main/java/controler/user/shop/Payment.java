/**  
* @Title: Payment.java  
* @Package controler.user.shop  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.user.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;
import entity.Order;
import entity.Product;

/**
 * @author SongKaikai
 *
 */
public class Payment extends HttpServlet{

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
		doPost(req, resp);
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
		// TODO 自动生成的方法存根
		//此函数的参数需要前端人员构造一个数组，注意！！！数组中的商品数量用出现的频次表示
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		String[] productsid = (String[])req.getSession().getAttribute("trollryvale");
		for (String string : productsid) {
			System.out.println(string);
		}
		int len = productsid.length;
		Product[] products = new Product[len];
		for(int i = 0;i<len;i++) {
			products[i]= new Product(Integer.parseInt(productsid[i])); 
		}
		try {
			boolean b = customer.pay(products);
			PrintWriter writer = resp.getWriter();
			if (b) {
				writer.print("true");
			} else {
				writer.print("false");

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
