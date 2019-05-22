/**  
* @Title: RequestCustomerService.java  
* @Package controler.user.shop  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.user.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;
import entity.CustomerMassage;
import entity.ServiceMassage;

/**
 * @author SongKaikai
 *
 */
public class RequestCustomerService extends HttpServlet{

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
		StringBuffer sBuffer = new StringBuffer();
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		@SuppressWarnings("unchecked")
		Set<ServiceMassage> set = (Set<ServiceMassage>)getServletContext().getAttribute("smsg");
		for (Iterator<ServiceMassage> iterator = set.iterator(); iterator.hasNext();) {
			ServiceMassage serviceMassage = (ServiceMassage) iterator.next();
			if(serviceMassage.getReceiveIdString().equals(customer.getId())) {
				sBuffer.append("<div class=\"atalk\"><span>"+serviceMassage.getMagString()+"</span></div>");
			}
			set.remove(serviceMassage);
		}
		PrintWriter writer = resp.getWriter();
		writer.println(sBuffer.toString());
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
		String wordString = req.getParameter("word");
		System.out.println(wordString);
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		@SuppressWarnings("unchecked")
		Set<CustomerMassage> set = (Set<CustomerMassage>)getServletContext().getAttribute("cmsg");
		CustomerMassage massage = new CustomerMassage(wordString, customer.getId());
		set.add(massage);
		getServletContext().setAttribute("cmsg", set);
		resp.getWriter().println("ok");
		resp.getWriter().flush();
		resp.getWriter().close();
	}

}
