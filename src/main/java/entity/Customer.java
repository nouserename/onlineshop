/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.internal.compiler.batch.Main;

import entity.exception.UserNotFoundException;
import tool.Security;

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
	public Customer(String id) {
		// TODO 自动生成的构造函数存根
		String sqlString = "select * from customer where customer_id = '"+id+"'";
		try {
			ResultSet resultSet = Database.executeQuery(sqlString);
			if(resultSet.next())
			{
				this.setId(id);
				this.setName(resultSet.getString("name"));
				this.setPasswd(resultSet.getString("passwd"));
			}
			else {
				throw new UserNotFoundException("根据给定的id没有找到该用户");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
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
	* @param @param parm.parm[0]是用户名字(name)，parm[1]是账号(customer_id)，parm[2]是密码(passwd)
	* @param @return    参数  
	* @return boolean    注册成功返回true
	* @throws  
	*/  
	public boolean logOn(String[] parm) throws SQLException {
		String sql2 = "select * from customer where customer_id = '"+parm[1]+"'";
		ResultSet resultSet = Database.executeQuery(sql2);
		if (resultSet.next()) {
			Database.closeConnection();
			return false;
		} else {

			String sql = "insert into customer(customer_id,name,passwd) values('"+parm[1]+"','"+parm[0]+"','"+parm[2]+"')";
			int column = Database.executeUpdate(sql);
			if (column==1) {
				Database.closeConnection();
				return true;
			} else {
				Database.closeConnection();
				return false;
			}
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
			map.put(new Product(resultSet.getInt("product_id"),resultSet.getInt("price"),
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
		Database.closeConnection();
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
			Database.closeConnection();
			return true;
		} else {
			Database.closeConnection();
			return false;
		}
	}
	
	/**
	 * @throws SQLException   
	* @Title: modifyTrolleyProduct  
	* @Description:  根据第一个参数的proId修改数据库对应的数据，第二个参数表示加一还是减一,现在第二个参数改了，直接表示要改成的数量
	* @param @param proId
	* @param @param num
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean modifyTrolleyProduct(int proId,int operate) throws SQLException {
		
		String sql = "update trolley set amount = "+operate+" where product_id = "+proId+" and customer_id = '"+this.getId()+"'";
		int line = Database.executeUpdate(sql);
		if (line==1) {
			Database.closeConnection();
			return true;
		}
		Database.closeConnection();
		return false;
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
	public boolean addProduct2Trolley(int proId) throws SQLException{
		String sql1 = "Select * from trolley where customer_id = '" + this.getId() + "' and product_id = " + proId;
		
		ResultSet resultSet1 = Database.executeQuery(sql1);
		if(resultSet1.next()) {				//判断购物车里有没有相应的customer和对应的product。该情况下是有。
				String sql2 = "Update trolley Set amount = amount + 1 where customer_id = '" + this.getId() + "'";
				int a1 = Database.executeUpdate(sql2);
				if(a1>0) {
					Database.closeConnection();
					return true;
				}
				else {
					Database.closeConnection();
					return false;
				}
		}
		else {	//该情况为数据库中购物车表没有含有相应的信息，此时应该将相应的信息插入到购物车里。
			String sql3 = "Insert trolley(amount,customer_id,product_id) values(1,'" + this.getId() + "'," + proId + ")";
			int a2 = Database.executeUpdate(sql3);
			if(a2>0) {
				Database.closeConnection();
				return true;
			}				
			else {
				Database.closeConnection();
				return false;
			}
				
		}
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
	public boolean pay(Product[] products) throws SQLException{
		if(this.addr.length==0) {       //判定该用户的地址是否为空,该用户的地址为空。
			return false;
		}
		else {  //该用户包含地址。
			
			for(int i = 0; i<products.length;i++) {  //将产品插入order（订单）数据库表
				String callName = "{ call payment('"+this.getId()+"',"+products[i].getId()+","+Order.NR_waitForReceiving+") }";
				Database.callableExecute(callName);
				
			}
			Database.closeConnection();
			return true;  //全部商品插入成功。
		}
	}
	
	
	
	/**  
	* @Title: searchOrder  
	* @Description: 此函数用于查询当前客户的所有订单  
	* @param @return    参数  
	* @return Order[]    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder(Customer customer) throws SQLException{
		String sqlString = "Select * from orders where customer_id = '" + customer.getId() + "'";
		ResultSet resultSet = Database.executeQuery(sqlString);
		
		
		
		List<Order> orderList = new ArrayList<Order>();
		
		while (resultSet.next()) {
			orderList.add(new Order(resultSet.getString("order_id"), resultSet.getString("customer_id"), 
					Integer.parseInt(resultSet.getString("price")), Integer.parseInt(resultSet.getString("product_id")), 
					Integer.parseInt(resultSet.getString("state"))));
			
		}
		
		if(orderList.get(0).getId() == null)	//如果什么也没有查到则直接返回空。	
			return null;
		
		
		Order[] orderArray = new Order[orderList.size()];
		
		
		for(int i=0; i<orderList.size();i++) {
			orderArray[i] = new Order();
			System.out.println("是这一句话"+orderList.get(i).getId());
			orderArray[i].setId(orderList.get(i).getId());
			orderArray[i].setCustomer(orderList.get(i).getCustomer());
			orderArray[i].setTotalPrice(orderList.get(i).getTotalPrice());
			orderArray[i].setProduct(orderList.get(i).getProduct());
			orderArray[i].setState(orderList.get(i).getState());
		}
		
		Database.closeConnection();
		return orderArray;
	}
	
	
	/**  
	* @Title: searchOrder  
	* @Description: 此函数根据参数state返回对应的order
	* @param @param state
	* @param @return    参数  
	* @return Order[]    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder(Order[] orders,int state) throws SQLException{
		List<Order> orderList = new ArrayList<Order>();
		
		for(int i=0; i<orders.length;i++) {
			if(orders[i].getState() == state)
				orderList.add(orders[i]);
		}
		
		Order[] orderArray = new Order[orderList.size()];
		
		for(int i=0;i<orderList.size();i++) {
			orderArray[i] = orderList.get(i);
		}
		
		return orderArray;
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
	public boolean modifyPasswd(String oldPasswd,String newPasswd) throws SQLException {
		String sqlString = "Select passwd from customer Where customer_id = '" + this.getId() +"'";
		ResultSet resultSet = Database.executeQuery(sqlString);
		resultSet.next();
		if(Security.getSHA256StrJava(oldPasswd).equals(resultSet.getString("passwd"))) {
			String sqlString2 = "Update customer set passwd = '" + Security.getSHA256StrJava(newPasswd) + "' WHERE customer_id = '" + this.getId() + "'";
			int state = Database.executeUpdate(sqlString2);
			
			if(state != 0) {
				Database.closeConnection();
				return true;
			}
			else {
				Database.closeConnection();
				return false;
			}
		}
		else {
			System.out.println("修改错误");
			Database.closeConnection();
			return false;
		}
		
		
		
	}
	
	public Product searchProduct(int proId)
	{
		Product product = null;
		String sqlString = "select * from product where product_id = "+proId;
		try {
			ResultSet resultSet = Database.executeQuery(sqlString);
			if(resultSet.next())
			{
				product = new Product(resultSet.getInt("product_id"),resultSet.getInt("price"),
						resultSet.getString("name"),resultSet.getString("image1"),
						resultSet.getString("image2"),resultSet.getString("image3"),
						resultSet.getString("image4"),resultSet.getString("image5"),
						resultSet.getString("image6"),resultSet.getString("image7"),resultSet.getString("description1"),
						resultSet.getString("description2"),resultSet.getString("description3"),
						resultSet.getString("description4"),resultSet.getString("description5"),
						resultSet.getString("description6"),resultSet.getString("group"),
						resultSet.getInt("memory"),resultSet.getInt("pixel"),
						resultSet.getInt("battery"),resultSet.getString("processor"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			Database.closeConnection();
		}
		return product;
		
	}

	/**
	 * @throws SQLException   
	* @Title: searchInfoOfProduct  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param product
	* @param @return    参数  
	* @return String    返回类型  
	* @throws  
	*/  
	public String searchInfoOfProduct(int product) throws SQLException {
		String sqlString = "SELECT image1,price FROM product where product_id = '" + product +"'";
		ResultSet resultSet = Database.executeQuery(sqlString);
		resultSet.next();
		String str = resultSet.getString("image1") + ";" +resultSet.getString("price");
		
		return str;
	}
	
	
	
	/**  
	* @Title: searchOrderFullInofo
	* @Description: 此函数用于查询当前客户的所有订单和对用的产品信息  
	* @param @return    参数  
	* @return Order[]    返回类型  
	* @throws  
	*/  
	public String[] searchOrderFullInfo(Customer customer,int state) throws SQLException{
		ResultSet resultSet;
		if(state == -1) {	//查询所有订单
			String sql1 = "SELECT * FROM orders LEFT JOIN product ON orders.product_id = product.product_id WHERE customer_id = '" + customer.getId() + "'";
			resultSet = Database.executeQuery(sql1);
			
		}else {
			String sql2 = "SELECT * FROM orders LEFT JOIN product ON orders.product_id = product.product_id WHERE customer_id = '" + customer.getId() + "' AND state ='" + state + "'";
			resultSet = Database.executeQuery(sql2);
		}
		
		List<String> list = new ArrayList<String>();
		
		while (resultSet.next()) {
			list.add(resultSet.getString("image1") + ";" + resultSet.getString("order_id") + ";" + resultSet.getString("state") + ";" + resultSet.getString("price"));
		}
		
		if(list.isEmpty())
			return null;
		
		String str[] = new String[list.size()];
		for(int i=0;i<list.size();i++)
			str[i] = list.get(i);
		
		return str;
		
		
		
	}
	

	/**  
	* @Title: searchOrderFullInofo
	* @Description: 此函数用于将当前订单的状态该为等待审核  
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean applyAfterSales(int orderid) throws SQLException {
		String sql = "UPDATE orders SET state=" + Order.NR_waitForReview + " WHERE order_id=" + orderid;
		System.out.println(sql);
		int k = Database.executeUpdate(sql);
		System.out.println("已经申请售后！");
		Database.closeConnection();
		if(k==0)
			return false;
		return true;
	}
	
	/**  
	* @Title: searchOrderFullInofo
	* @Description: 此函数用于将当前订单的状态改为已收到
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean receiveCommodity(int orderid) throws SQLException{
		String sql = "UPDATE orders SET state=" + Order.NR_Collected + " WHERE order_id=" + orderid;
		System.out.println(sql);
		int k = Database.executeUpdate(sql);
		System.out.println("已经收到商品！");
		Database.closeConnection();
		if(k==0)
			return false;
		return true;
	}
	
	/**  
	* @Title: searchOrderFullInofo
	* @Description: 此函数用于将当前订单的状态改为已收到
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public String firstAddress() throws SQLException{
		String sql = "SELECT addr1 FROM customer WHERE customer_id=" + this.getId();
		ResultSet resultSet = Database.executeQuery(sql);
		resultSet.next();
		String[] addr = resultSet.getString("addr1").split("/");
		String result = addr[0] + addr[1] + addr[2] + addr[3];
		return result;
	}
	
	
	
	
	

}
