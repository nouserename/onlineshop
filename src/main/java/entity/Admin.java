/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

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
	/**  
	* @Title: searchProduct  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param phoneName
	* @param @return    参数  
	* @return Product []    返回类型  
	* @throws  
	*/  
	public Product[] searchProduct(String phoneName) {
		
		// TODO 自动生成的方法存根
		return null;
	}
	/**  
	* @Title: searchOrder  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param state
	* @param @return    参数  
	* @return Order []    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder(int state) {
		// TODO 自动生成的方法存根
		return null;
	}
	/**  
	* @Title: search  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param state
	* @param @return    参数  
	* @return Order []    返回类型  
	* @throws  
	*/  
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
