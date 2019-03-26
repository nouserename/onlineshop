/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author YWB
 *
 */
public class Customer extends User{
	private boolean sex;
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
	 * @throws SQLException   
	* @Title: logOn  
	* @Description: 注册  
	* @param @param parm
	* @param @return    参数  
	* @return boolean    注册成功返回true
	* @throws  
	*/  
	public boolean logOn(String[] parm) throws SQLException {
		String sql = "insert into customer values ('"+parm[1]+"','"+parm[0]+"','"+parm[2]+"')";
		int column = Database.executeUpdate(sql);
		if (column==1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
	
	/**
	 * @throws IOException 
	 * @throws SQLException   
	* @Title: searchTrollry  
	* @Description: 当用户打开购物车界面时调用此函数， ,键中是产品信息，值里面是对应数量
	* @param @return    参数  
	* @return Product[]    返回类型  
	* @throws  
	*/  
	public Map<Product, Integer> searchTrolley(Customer customer) throws SQLException, IOException {
		String sql = "SELECT * FROM (SELECT product.*,amount,customer_id FROM product LEFT JOIN trolley ON product.product_id=trolley.product_id ) AS a WHERE customer_id = '"+customer.getId()+"'";
		ResultSet resultSet = Database.executeQuery(sql);
		Map<Product, Integer> map = new HashMap<Product, Integer>();
		while (resultSet.next()) {
			map.put(new Product(resultSet.getInt("product_id"),resultSet.getDouble("price"),
					resultSet.getString("name"),resultSet.getString("image1"),
					resultSet.getString("image2"),resultSet.getString("image3"),
					resultSet.getString("image4"),resultSet.getString("image5"),
					resultSet.getString("image6"),resultSet.getString("image7"),resultSet.getString("description1"),
					resultSet.getString("description2"),resultSet.getString("description3"),
					resultSet.getString("description4"),resultSet.getString("description5"),
					resultSet.getString("description6"),resultSet.getString("group"),
					resultSet.getInt("memory"),resultSet.getInt("pixel"),
					resultSet.getInt("battery"),resultSet.getString("processor")), resultSet.getInt("amount"));
		}
		
		return map;
	}
	
	
	/**
	 * @throws SQLException   
	* @Title: deleteTrolleyProduct  
	* @Description: 根据参数中的产品id删除购物车中的对应产品  
	* @param @param proId
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean deleteTrolleyProduct(int proId,Customer customer) throws SQLException {
		String sql = "delete from trolley where product_id = "+proId+"and customer_id = '"+customer.getId()+"'";
		int num = Database.executeUpdate(sql);
		if (num>0) {
			return true;
			
		} else {
			return false;
		}
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
	* @Title: addProduct2Trolley  
	* @Description: 此函数及其麻烦，设计者须谨慎编写，必要之时多多做几次测试
	* 				先查询数据库购物车表是否有与当前客户id以及产品Id对应的记录，如果有，则修改数量
	* 				如果没有，则插入一条记录 
	* @param @param proId
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean addProduct2Trolley(int proId) {
		
		return true;
	}
	
	
	/**  
	* @Title: pay  
	* @Description: 此函数为付款函数，本应该调用支付宝接口，此处假设调用完毕，所以只需要修改添加订单即可，
	* 				需要说明的是，参数中同一间商品出现的次数表示用户购买的数量  
	* 				!!!此处需强烈说明，pay函数开始必须先判断当前客户有没有设置地址
	* 				！！！强烈说明，此函数须将订单状态设为待发货
	* 				此处须将参数中传入的几件商品构造成几个订单，并将信息插入数据库
	* @param @param products
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean pay(Product[] products) {
		
		return true;
	}
	
	
	
	/**  
	* @Title: searchOrder  
	* @Description: 此函数用于查询当前客户的所有订单  
	* @param @return    参数  
	* @return Order[]    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder(Customer customer) {
		
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
