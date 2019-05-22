/**  
* @Title: Index.java  
* @Package controler  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
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

import entity.Admin;
import entity.Customer;
import entity.Service;
import entity.User;
import tool.Security;

/**
 * @author SongKaikai
 *
 */

public class Index extends HttpServlet{
	
	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = -7356128917124282172L;
	public static final String nip = "127.0.0.1";
	public static final String npt = "8080";
	private User user = new User();
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
		// TODO 自动生成的方法存根
		

		
		
		String kind = req.getParameter("kind");
		
		String passwd = req.getParameter("passwd");
		passwd = Security.getSHA256StrJava(passwd);
		String id = req.getParameter("userid");
		if(id==null||id.equals("")||passwd == null||passwd.equals("")||kind==null||kind.equals(""))
		{
			resp.sendRedirect(req.getContextPath()+"/error.jsp");
			return;
		}
		user.setName(kind);
		user.setPasswd(passwd);
		user.setId(id);
		Admin currentAdmin;
		Customer currentCustomer;
		
		try {
			if (user.getName().equals("admin")) {
				currentAdmin =  (Admin) user.logIn(user);
			
				if (currentAdmin!=null&&user.getPasswd().equals(currentAdmin.getPasswd())) {
					req.getSession().setAttribute("admin", currentAdmin);
					int admin_kind = currentAdmin.getState();
					switch (admin_kind) {
					case Admin.finance_adm:
						req.getRequestDispatcher("/administrator/financialmanager/financialmanager.jsp").forward(req, resp);
//						resp.sendRedirect(req.getContextPath()+"/administrator/financialmanager/financialmanager.jsp");
						break;
					case Admin.aftersale_adm:
						req.getRequestDispatcher("/administrator/aftersalesmanager/aftersalesmanager.jsp").forward(req, resp);
//						resp.sendRedirect(req.getContextPath()+"/administrator/aftersalesmanager/aftersalesmanager.jsp");
						break;
					case Admin.root_adm:
						req.getRequestDispatcher("/root/root.jsp").forward(req, resp);
//						resp.sendRedirect(req.getContextPath()+"/administrator/root/root.jsp");
						break;
					case Admin.product_adm:
						req.getRequestDispatcher("/administrator/productmanager/productmanager.jsp").forward(req, resp);
//						resp.sendRedirect(req.getContextPath()+"/administrator/productmanager/productmanager.jsp");
						break;
					case Admin.order_adm:
						req.getRequestDispatcher("/administrator/ordermanager/ordermanager.jsp").forward(req, resp);
//						resp.sendRedirect(req.getContextPath()+"/administrator/ordermanager/ordermanager.jsp");
						break;
					case Admin.service:
						Service service = new Service(currentAdmin);
						req.getSession().setAttribute("admin", service);
						//req.getRequestDispatcher("/administrator/customerservice/customerservice.jsp").forward(req, resp);
						resp.sendRedirect("/onlineshop/administrator/customerservice/customerservice.jsp");
						break;
						
					default:
						break;
					}
					
					return;
				}
				else {
					
					PrintWriter writer = resp.getWriter();
					writer.println("<p> 用户名或密码错误</p>");
				}
			} else {

				currentCustomer = (Customer)user.logIn(user);
				//System.out.println(currentCustomer.getId()+"-------------");
				if (currentCustomer!=null&&user.getPasswd().equals(currentCustomer.getPasswd())) {
					req.getSession().setAttribute("customer", currentCustomer);
					resp.sendRedirect(req.getContextPath()+"/user/userhomepage.jsp");
					return;
				}else {
					resp.setContentType("text/html;charset=UTF-8");
					
					PrintWriter writer = resp.getWriter();
					writer.println("<p> 用户名或密码错误</p>");
					writer.flush();
					writer.close();
					String aString = ""
							+ ""
							+ ""
							+ "";
				}
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		return;
	
		
	}
	

}
