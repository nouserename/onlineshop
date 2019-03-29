/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author YWB
 *
 */
public class Product_administrator extends Admin {
	
	/**  
	* @Title: addProduct  
	* @Description: 新建一个产品  
	* @param @param product
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean addProduct(Product product) {
		//TODO
		return true;
	}
	
	/**  
	* @Title: rmProduct  
	* @Description: 删除参数中的product
	* @param @param product
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean rmProduct(Product product) {
		//TODO
		return true;
	}
	


	
	/**
	 * 修改产品信息
	 * */
	public boolean modifyProductInfo(Product product) {
		//TODO
		
		return true;
	}
	/**
	* <p>Title: searchProduct</p>  
	* <p>Description: </p>  
	* @param phoneName
	* @return  
	 * @throws IOException 
	 * @throws SQLException 
	* @see entity.User#searchProduct(java.lang.String)  
	*/ 
	@Override
	public Product[] searchProduct(String phoneName) throws SQLException, IOException {
		// TODO 自动生成的方法存根
		return super.searchProduct(phoneName);
	}
	
	

}
