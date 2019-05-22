/**  
* @Title: CustomerService.java  
* @Package controler.administrator.customerservice  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.administrator.customerservice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Queue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Admin;
import entity.Customer;
import entity.Service;

/**
 * @author SongKaikai
 *
 */
public class CustomerService extends HttpServlet{

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
		@SuppressWarnings("unchecked")
		Queue<Customer> queue = (Queue<Customer>)getServletContext().getAttribute("serviceObj");
		Customer customer;
		PrintWriter writer = resp.getWriter();
		
		String id = "no";
		try {
			customer = queue.element();
			id = customer.getId();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			writer.print(id);
			writer.flush();
			writer.close();
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
		@SuppressWarnings("unchecked")
		Queue<Customer> queue = (Queue<Customer>)getServletContext().getAttribute("serviceObj");
		Customer customer;
		customer = queue.poll();
		System.out.println(queue.size()+"-------========");
		for (Customer customer1 : queue) {
			System.out.println(customer1.getId()+"--------00000000000000");
		}
		Service service = (Service)(Admin)req.getSession().getAttribute("admin");
		service.customerIdString = customer.getId();
		resp.sendRedirect(req.getContextPath()+"/administrator/customerservice/talk.jsp");
	}

}
