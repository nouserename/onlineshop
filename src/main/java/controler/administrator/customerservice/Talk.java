/**  
* @Title: Talk.java  
* @Package controler.administrator.customerservice  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.administrator.customerservice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Admin;
import entity.CustomerMassage;
import entity.Service;
import entity.ServiceMassage;

/**
 * @author SongKaikai
 *
 */
public class Talk extends HttpServlet{

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
		StringBuffer stringBuffer = new StringBuffer();
		Service service = (Service)(Admin)req.getSession().getAttribute("admin");
		@SuppressWarnings("unchecked")
		Set<CustomerMassage> set = (Set<CustomerMassage>)getServletContext().getAttribute("cmsg");
		for (Iterator<CustomerMassage> iterator = set.iterator(); iterator.hasNext();) {
			CustomerMassage customerMassage = (CustomerMassage) iterator.next();
			if(customerMassage.getSenderIdString().equals(service.customerIdString)) {
				stringBuffer.append("<div class=\"atalk\"><span>"+customerMassage.getMagString()+"</span></div>");
			}
			set.remove(customerMassage);
		}
		PrintWriter writer = resp.getWriter();
		writer.println(stringBuffer.toString());
		writer.flush();
		writer.close();
		
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
		Service service = (Service)(Admin)req.getSession().getAttribute("admin");
		ServiceMassage massage = new ServiceMassage(wordString,service.customerIdString);
		@SuppressWarnings("unchecked")
		Set<ServiceMassage> set = (Set<ServiceMassage>)getServletContext().getAttribute("smsg");
		set.add(massage);
		PrintWriter writer = resp.getWriter();
		writer.println("ok");
		writer.flush();
		writer.close();
	}

}
