/**  
* @Title: modifyPasswd.java  
* @Package onlineshop  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author dell  
* @date 2019��5��3��  
* @version V1.0  
*/ 
package onlineshop;

import java.awt.desktop.PrintFilesEvent;
import java.sql.ResultSet;

import entity.Database;
import tool.Security;

/**
 * @author dell
 *
 */
public class modifyPasswd {

	/**  
	* @Title: main  
	* @Description: TODO(������һ�仰�����������������)  
	* @param @param args    ����  
	* @return void    ��������  
	* @throws  
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sqlString2 = "SELECT * FROM orders LEFT JOIN product on orders.product_id = product.product_id WHERE customer_id = '15011329606'";
		try {
			ResultSet resultSet = Database.executeQuery(sqlString2);
			
			while (resultSet.next()) {
				System.out.println("�ҵ��ˣ�");
				System.out.println(resultSet.getString("order_id"));
				System.out.println(resultSet.getString("image1"));
				System.out.println(resultSet.getString("price"));
				
			}
			
			System.out.println("������");
			Database.closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
