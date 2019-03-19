/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.util.Map;

/**
 * @author YWB
 *
 */
public class Customer extends User{
	private boolean sex;
	private int credit;
	private Address[] addr;
	private Product[] products;
	private Order[] orders;
	/**  
	* 创建一个新的实例 Customer.  
	*    
	*/
	public Customer() {
		// TODO 自动生成的构造函数存根
	}
	
	/**
	 * @return sex
	 */
	public boolean isSex() {
		return sex;
	}
	/**
	 * @param sex 要设置的 sex
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	/**
	 * @return credit
	 */
	public int getCredit() {
		return credit;
	}
	/**
	 * @param credit 要设置的 credit
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}
	/**
	 * @return addr
	 */
	public Address[] getAddr() {
		return addr;
	}
	/**
	 * @param addr 要设置的 addr
	 */
	public void setAddr(Address[] addr) {
		this.addr = addr;
	}
	/**
	 * @return products
	 */
	public Product[] getProducts() {
		return products;
	}
	/**
	 * @param products 要设置的 products
	 */
	public void setProducts(Product[] products) {
		this.products = products;
	}
	/**
	 * @return orders
	 */
	public Order[] getOrders() {
		return orders;
	}
	/**
	 * @param orders 要设置的 orders
	 */
	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
	
	
	/**  
	* @Title: logOn  
	* @Description: 注册  
	* @param @param parm
	* @param @return    参数  
	* @return boolean    注册成功返回true
	* @throws  
	*/  
	public boolean logOn(String[] parm) {
		
		return true;
		
	}
	
	
	/**  
	* @Title: search  
	* @Description: 此函数用于查询手机，参数为关键词如果为空则返回所有手机信息  
	* @param @param string
	* @param @return    参数  
	* @return Product[]    返回类型  
	* @throws  
	*/  
	public Product[] search(String phoneName) {
		
		return null;
	}
	
	
	/**  
	* @Title: searchTrollry  
	* @Description: 当用户打开购物车界面时调用此函数，此函数没有参数是因为默认用当前customer的id ,键中是产品信息，值里面是对应数量
	* @param @return    参数  
	* @return Product[]    返回类型  
	* @throws  
	*/  
	public Map<Product, Integer> searchTrolley() {
		
		return null;
	}
	
	
	/**  
	* @Title: deleteTrolleyProduct  
	* @Description: 根据参数中的产品id删除购物车中的对应产品  
	* @param @param proId
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean deleteTrolleyProduct(int proId) {
		
		return true;
	}
	
	/**  
	* @Title: modifyTrolleyProduct  
	* @Description:  根据第一个参数的proId修改数据库对应的数据，第二个参数表示加一还是减一
	* @param @param proId
	* @param @param num
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean modifyTrolleyProduct(int proId,int operate) {
		
		return true;
	}
	
	
	/**  
	* @Title: pay  
	* @Description: 此函数为付款函数，本应该调用支付宝接口，此处假设调用完毕，所以只需要修改添加订单即可，
	* 				需要说明的是，参数中同一间商品出现的次数表示用户购买的数量  
	* 				!!!此处需强烈说明，pay函数开始必须先判断当前客户有没有设置地址
	* @param @param products
	* @param @return    参数  
	* @return Order[]    返回类型  
	* @throws  
	*/  
	public Order[] pay(Product[] products) {
		
		return null;
	}
	
	
	
	/**  
	* @Title: searchOrder  
	* @Description: 此函数用于查询当前客户的所有订单  
	* @param @return    参数  
	* @return Order[]    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder() {
		
		return null;
	}
	
	
	/**  
	* @Title: searchOrder  
	* @Description: 此函数根据参数state返回对应的order
	* @param @param state
	* @param @return    参数  
	* @return Order[]    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder(Order[] orders,int state) {
		
		return null;
	}
	
	
	/**  
	* @Title: modifyPasswd  
	* @Description: 修改当前客户的密码 
	* @param @param oldPasswd
	* @param @param newPasswd
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean modifyPasswd(String oldPasswd,String newPasswd) {
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
