/**  
* @Title: SearchAndResults.java  
* @Package controler.user.shop  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author SongKaikai  
* @date 2019��3��8��  
* @version V1.0  
*/ 
package controler.user.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Customer;
import entity.Product;

/**
 * @author SongKaikai
 *
 */
public class SearchAndResults extends HttpServlet{
	Customer customer = new Customer();
	Product[] products;

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
		String productname = req.getSession().getAttribute("keyword").toString();
		//String productname = productnam.getBytes("utf-8").toString();
		System.out.println(productname);
		//String productname = new String(productnam.getBytes(), "UTF-8");
		//System.out.println(productname);
		Product[] products;
		 try {
			products =  new Customer().searchProduct(productname);
			if (products.equals(null)) {
				PrintWriter writer = resp.getWriter();
				System.out.println("z�ҵ���");
				writer.println("<p>δ��������Ʒ</p>");
			}
			if(!products.equals(null)) {
				resp.setContentType("text/html;charset=utf-8");
				PrintWriter writer = resp.getWriter();
				System.out.println("�ϴδ�����ϱ�һ�仰��");
				System.out.println(products[0].getName());
				for (Product product : products) {
					
//					<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
//					<div class="sub_mingxing"><a href=""><img src="./image/liebiao_xiaomi5c.jpg" alt=""></a></div>
//					<div class="pinpai"><a href="">С���ֻ�5c</a></div>
//					<div class="youhui">��������S1 �˺˸����ܴ�����</div>
//					<div class="jiage">1499.00Ԫ</div>
//				</div>
					String info =
					"<div class='mingxing fl mb20' style='border:2px solid #fff;width:225px;cursor:pointer;' onmouseout=\"this.style.border='2px solid #fff'\" onmousemove=\"this.style.border='2px solid red' \"> <div class='sub_mingxing'><a href='./shop/productdetails.jsp?proId="+product.getId()+"'><img src='../"+product.getImages()[0]+"' alt=''></a></div> <div class='pinpai'><a href=''>"+product.getName()+"</a></div> <div class='youhui'>"+product.getProcessor()+"</div> <div class='jiage'>"+product.getPrice()+"</div> </div>";
					
					
					writer.println(info);
				}
				writer.flush();
				writer.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	

}
