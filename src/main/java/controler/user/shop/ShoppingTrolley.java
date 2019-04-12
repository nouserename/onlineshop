/**  
* @Title: ShoppingTrolley.java  
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
import entity.Product;

/**
 * @author SongKaikai
 *
 */
public class ShoppingTrolley extends HttpServlet{

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
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String num = req.getParameter("num");
		System.out.println(id+"---"+num);
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		try {
			boolean b = customer.modifyTrolleyProduct(Integer.parseInt(id), Integer.parseInt(num));
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			if (b) {
				
				writer.print("true");
			} else {
				writer.print("false");

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		// TODO Auto-generated method stub
		String[] productsid = req.getParameterValues("fuckingProduct");
		req.getSession().setAttribute("trollryvale", productsid);
		req.getRequestDispatcher("/user/shop/payment.jsp").forward(req, resp);
	}

}
