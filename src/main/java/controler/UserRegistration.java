/**  
* @Title: UserHomePage.java  
* @Package controler  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
* @version V1.0  
*/ 
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;
import tool.Security;

/**
 * @author SongKaikai
 *
 */
public class UserRegistration extends HttpServlet{
	/**  
	* @Fields field:field:{todo}(��һ�仰�������������ʾʲô)  
	*/ 
	private static final long serialVersionUID = 1L;
	private Customer customer  = new Customer();
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
		// TODO �Զ����ɵķ������
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
		
		String[] parm = new String[3];
		req.setCharacterEncoding("utf-8");
		parm[0] = req.getParameter("username");
		parm[1] = req.getParameter("tel");
		parm[2] = req.getParameter("password");
		parm[2] =Security.getSHA256StrJava(parm[2]);
		System.out.println(parm[0]);
		try {
			boolean bool = customer.logOn(parm);
			if(bool) {
				customer.setName(parm[0]);
				customer.setId(parm[1]);
				customer.setPasswd(parm[2]);
				req.getSession().setAttribute("customer", customer);
				resp.sendRedirect(req.getContextPath()+"/registrationSuccess.jsp");
				return;
			}else {
				resp.setContentType("text/html;charset=UTF-8");
				
				PrintWriter writer = resp.getWriter();
				writer.println("<p>ע��ʧ��</p>");
				writer.flush();
				writer.close();
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}

}
