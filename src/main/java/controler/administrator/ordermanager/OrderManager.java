/**  
* @Title: OrderManager.java  
* @Package controler.administrator.ordermanager  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.administrator.ordermanager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Admin;
import entity.Order_administrator;

/**
 * @author SongKaikai
 *
 */
public class OrderManager extends HttpServlet{

	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

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
		Admin admin = (Admin)req.getSession().getAttribute("admin");
		Order_administrator order_administrator = new Order_administrator(admin);
		try {
			boolean p = order_administrator.print();
			if (p) {
				
				resp.sendRedirect(req.getContextPath()+"/administrator/ordermanager/tmp.jsp");
			}else {
				resp.setContentType("text/html;charset=UTF-8");	
				PrintWriter writer = resp.getWriter();
				writer.println("打印失败");
				writer.println("<a href="+req.getContextPath()+"/administrator/ordermanager/ordermanager.jsp"+">点击这里回首页</a>");
				writer.flush();
				writer.close();
			}
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
		super.doPost(req, resp);
	}

}
