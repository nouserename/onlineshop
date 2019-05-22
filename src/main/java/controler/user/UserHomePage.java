/**  
* @Title: UserHomePage.java  
* @Package controler.user  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Queue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;

/**
 * @author SongKaikai
 *
 */
public class UserHomePage extends HttpServlet{

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
		Customer customer = (Customer)req.getSession().getAttribute("customer");
		@SuppressWarnings("unchecked")
		Queue<Customer> queue =  (Queue<Customer>)getServletContext().getAttribute("serviceObj");
		queue.add(customer);
		PrintWriter writer = resp.getWriter();
		writer.print("ok");
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
				req.setCharacterEncoding("UTF-8");
				System.out.println(req.getCharacterEncoding());
				
				
				String keyWord = req.getParameter("key");
				System.out.println(keyWord);
				
				
				req.getSession().setAttribute("keyword", keyWord);
				req.getRequestDispatcher("/user/shop/searchandresults.jsp").forward(req, resp);		
	}

}
