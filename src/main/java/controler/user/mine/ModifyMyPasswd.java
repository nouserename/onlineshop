/**  
* @Title: ModifyMyAddress.java  
* @Package controler.user.mine  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.user.mine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;

/**
 * @author SongKaikai
 *
 */
public class ModifyMyPasswd extends HttpServlet{
	//Customer customer = new Customer();

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
		//super.doPost(req, resp);
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		String originalpw = req.getParameter("originalpw");
		String newpw = req.getParameter("newpw");
		String confirmpw = req.getParameter("confirmpw");
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			if(confirmpw.equals(newpw))
			{
				if(customer.modifyPasswd(originalpw,newpw))
				{
					//修改成功。
					writer.println("<script type='text/javascript'>alert('修改成功！')</script>");
					resp.sendRedirect("../../user/userhomepage.jsp");
				} else {
					//前端页面提示修改失败。
					writer.println("<script type='text/javascript'>alert('修改失败！请重新操作。')</script>");
					req.getRequestDispatcher("../../user/modifymyPasswd.jsp");
				}
				
			}else {
				//前端页面提示新密码输入的不一致。
				writer.println("<script type='text/javascript'>alert('两次输入的新密码不一致请重新输入。')</script>");
				req.getRequestDispatcher("../../user/modifymyPasswd.jsp");
			}
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
