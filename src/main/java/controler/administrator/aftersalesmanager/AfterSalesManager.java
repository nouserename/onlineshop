/**  
* @Title: aftersalesmanager.java  
* @Package controler.administrator.aftersalesmanager  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.administrator.aftersalesmanager;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Aftersales_administrator;
import entity.Order;

/**
 * @author SongKaikai
 *
 */
public class AfterSalesManager extends HttpServlet{

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
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		Order o = new Order();
		o.setId(req.getParameter("orderId"));
		if(req.getParameter("kind").equals("yes"))
		{
			try {
				new Aftersales_administrator().verify(true, o);
				
				resp.sendRedirect(req.getContextPath()+"/administrator/aftersalesmanager/aftersalesmanager.jsp");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//goto errorpage
				e.printStackTrace();
			}
		}else if (req.getParameter("kind").equals("no")) {
			try {
				new Aftersales_administrator().verify(true, o);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			resp.sendRedirect(req.getContextPath()+"/administrator/aftersalesmanager/aftersalesmanager.jsp");
		}
		else {
			req.getSession().invalidate();
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
		doGet(req, resp);
		
	}

}
