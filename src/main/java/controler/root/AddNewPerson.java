/**  
* @Title: AddNewPerson.java  
* @Package controler.root  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.root;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Admin;
import entity.Root;
import tool.Security;

/**
 * @author SongKaikai
 *
 */
public class AddNewPerson extends HttpServlet{

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
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String useridString = req.getParameter("username");
		String passwdString = Security.getSHA256StrJava(req.getParameter("passwd"));
		String nameString = req.getParameter("nichen");
		int state = Integer.parseInt(req.getParameter("adminkind"));
		try {
			new Root().addAdmin(new Admin(useridString, state, nameString, passwdString));
//			resp.setContentType("text/html;charset=UTF-8");	
//			PrintWriter printWriter = resp.getWriter();
//			printWriter.println("<p>新增成功！</p>");
//			printWriter.flush();
//			for (int i = 0; i < 3; i++) {
//				Thread.sleep(1000);
//				printWriter.println("<h2>"+(3-i)+"秒后返回.........."+"</h2>");
//				printWriter.flush();
//			}
//			printWriter.close();
			resp.sendRedirect(req.getContextPath()+"/root/tmp.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			resp.sendRedirect(req.getContextPath()+"/root/root.jsp");
			e.printStackTrace();
			
		}
	}

}
