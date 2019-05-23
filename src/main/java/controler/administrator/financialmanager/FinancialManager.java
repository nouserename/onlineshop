/**  
* @Title: FinancialManager.java  
* @Package controler.administrator.financialmanager  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
* @version V1.0  
*/ 
package controler.administrator.financialmanager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Finance_administrator;

/**
 * @author SongKaikai
 *
 */
public class FinancialManager extends HttpServlet{

	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
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
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("orderId");
		if (new Finance_administrator().received(Integer.parseInt(id))) {
			
			//resp.sendRedirect("../../financialmanager.jsp");
			resp.sendRedirect(req.getContextPath()+"/administrator/financialmanager/financialmanager.jsp");
		}else {
			//resp.sendRedirect("../../tmp.jsp");
			resp.sendRedirect(req.getContextPath()+"/administrator/financialmanager/tmp.jsp");
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
