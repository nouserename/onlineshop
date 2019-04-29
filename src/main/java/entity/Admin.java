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
public class Admin extends User{
	private int position;
	public final static int finance_adm = 1;
	public final static int aftersale_adm = 2;
	public final static int root_adm = 3;
	public final static int product_adm = 4;
	public final static int order_adm = 5;
	
	public Admin(String id,int state,String name,String passwd) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setName(name);
		this.setPasswd(passwd);
		this.setState(state);
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @throws IOException 
	 * @throws SQLException   
	* @Title: searchProduct  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param phoneName
	* @param @return    参数  
	* @return Product []    返回类型  
	* @throws  
	*/  
	@Override
	public Product[] searchProduct(String phoneName) throws SQLException, IOException {
		return super.searchProduct(phoneName);
		// TODO 自动生成的方法存根

	}
	/**
	 * @throws SQLException   
	* @Title: searchOrder  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param state
	* @param @return    参数  
	* @return Order []    返回类型  
	* @throws  
	*/  
	@Override
	public Order[] searchOrder(int state) throws SQLException {
		// TODO 自动生成的方法存根
		return super.searchOrder(state);
	}
	/**  
	* @Title: search  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param state
	* @param @return    参数  
	* @return Order []    返回类型  
	* @throws  
	*/  
	@Deprecated
	public Order[] search(int state) {
		// TODO 自动生成的方法存根
		return null;
	}
	/**
	 * @return state
	 */
	public int getState() {
		return position;
	}
	/**
	 * @param state 要设置的 state
	 */
	public void setState(int state) {
		this.position = state;
	}

}
