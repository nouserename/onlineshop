/**  
* @Title: loginFilter.java  
* @Package controler  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author PC  
* @date 2019��5��2��  
* @version V1.0  
*/ 

package controler;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Admin;
import entity.Customer;

/**  
* @ClassName: loginFilter  
* @Description: TODO(������һ�仰��������������)  
* @author PC  
* @date 2019��5��2��  
*    
*/
public class loginFilter implements Filter{

	/**
	* <p>Title: destroy</p>  
	* <p>Description: </p>    
	* @see javax.servlet.Filter#destroy()  
	*/ 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/**
	* <p>Title: doFilter</p>  
	* <p>Description: </p>  
	* @param request
	* @param response
	* @param chain
	* @throws IOException
	* @throws ServletException  
	* @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)  
	*/ 
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		String user_agent = httpServletRequest.getHeader("user-agent");
		if(user_agent.equals("")||user_agent==null
				||
				user_agent.contains("python")
				||
				user_agent.contains("java")
				||
				user_agent.contains("c++")
				
				)
		{
			httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/error.jsp");
		}
		
		if (httpServletRequest.getServletPath().endsWith("index.jsp")
				||
				httpServletRequest.getServletPath().endsWith("error.jsp")
				||
				httpServletRequest.getServletPath().endsWith(".png")
				||
				httpServletRequest.getServletPath().endsWith(".jpg")
				||
				httpServletRequest.getServletPath().endsWith(".gif")
				||
				httpServletRequest.getServletPath().endsWith("Index")
				||
				httpServletRequest.getServletPath().endsWith("Login.jsp")
				||
				httpServletRequest.getServletPath().endsWith(".css")
				||
				httpServletRequest.getServletPath().endsWith(".js")
				||
				httpServletRequest.getServletPath().endsWith("userregistration.jsp")
				||
				httpServletRequest.getServletPath().endsWith("UserRegistration")
				) {
			chain.doFilter(request, response);
			
		} else {

		Customer customer = (Customer)httpServletRequest.getSession().getAttribute("customer");
		Admin admin = (Admin)httpServletRequest.getSession().getAttribute("admin");
		if(admin!=null||customer!=null)
		{
			chain.doFilter(request, response);
		}
		else {
			System.out.println(httpServletRequest.getServletPath());
			httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/unLogin.jsp");
		}
		}
		
	}

	/**
	* <p>Title: init</p>  
	* <p>Description: </p>  
	* @param filterConfig
	* @throws ServletException  
	* @see javax.servlet.Filter#init(javax.servlet.FilterConfig)  
	*/ 
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
