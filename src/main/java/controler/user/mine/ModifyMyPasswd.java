/**  
* @Title: ModifyMyAddress.java  
* @Package controler.user.mine  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
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
		// TODO �Զ����ɵķ������
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
					//�޸ĳɹ���
					writer.println("<script type='text/javascript'>alert('�޸ĳɹ���')</script>");
					resp.sendRedirect("../../user/userhomepage.jsp");
				} else {
					//ǰ��ҳ����ʾ�޸�ʧ�ܡ�
					writer.println("<script type='text/javascript'>alert('�޸�ʧ�ܣ������²�����')</script>");
					req.getRequestDispatcher("../../user/modifymyPasswd.jsp");
				}
				
			}else {
				//ǰ��ҳ����ʾ����������Ĳ�һ�¡�
				writer.println("<script type='text/javascript'>alert('��������������벻һ�����������롣')</script>");
				req.getRequestDispatcher("../../user/modifymyPasswd.jsp");
			}
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
