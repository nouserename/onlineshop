/**  
* @Title: AddressAdministration.java  
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

import entity.Address;
import entity.Customer;
import entity.Database;

/**
 * @author SongKaikai
 *
 */
public class AddressAdministration extends HttpServlet{
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		Address[] addr = customer.getAddr();
		
		writer.println(addr[0].justAddress() + ";" + addr[1].justAddress() + ";" + addr[2].justAddress());
		writer.flush();
		writer.close();
			
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		Address[] addr = customer.getAddr();
		if(req.getParameter("event").equals("onload"))
		{
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			
			//Customer customer = (Customer)req.getSession().getAttribute("customer");
			//Address[] addr = customer.getAddr();
			
			writer.println(addr[0].justAddress() + ";" + addr[1].justAddress() + ";" + addr[2].justAddress());
			writer.flush();
			writer.close();
		}else if (req.getParameter("table").equals("table1")) {
			updateInfo(req, resp, 1 ,addr[0]);
			//Address[] addr = customer.getAddr();
			req.getRequestDispatcher("mine.jsp").forward(req, resp);
		}else if (req.getParameter("table").equals("table2")) {
			updateInfo(req, resp, 2,addr[1]);
			req.getRequestDispatcher("mine.jsp").forward(req, resp);
		}else {
			updateInfo(req, resp, 3,addr[2]);
			req.getRequestDispatcher("mine.jsp").forward(req, resp);
		}
	}
	
	
	void updateInfo(HttpServletRequest req, HttpServletResponse resp,int i,Address addr) {
		addr.setCity(req.getParameter("city"));
		addr.setConsigneeName(req.getParameter("customer"));
		addr.setDistrict(req.getParameter("district"));
		addr.setOther(req.getParameter("other"));
		addr.setPhoneNumber(req.getParameter("telephoneNo"));
		addr.setProvince(req.getParameter("province"));
		
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		
		String addrString = req.getParameter("province") + "/" + req.getParameter("city") + "/" + req.getParameter("district") 
							 + "/" + req.getParameter("other") + "/" +req.getParameter("telephoneNo") + "/" + req.getParameter("customer");
		
		String sql = "UPDATE customer SET addr" + i + "='"+addrString + "' WHERE customer_id=" + customer.getId();

		try {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter writer = resp.getWriter();
			if (Database.executeUpdate(sql) == 0) {
				writer.println("<script>alert(\"修改失败，请稍后再试！\")</script>");
			}else {
				writer.println("<script>alert(\"修改成功！\")</script>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
