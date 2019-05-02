/**  
* @Title: User.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author WenbinYu  
* @date 2019年3月15日  
* @version V1.0  
*/ 

package entity;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**  
* @ClassName: User  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author WenbinYu  
* @date 2019年3月15日  
*    
*/
public class User {
	private String passwd;
	private String id;
	private String name;
	
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd 要设置的 passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param user 传入登陆者的信息
	 * @return 用户信息存在，返回用户信息，否则weinull
	 * user.name中存储的是用户类别，此处需要你根据name的值选择查询哪张表
	 * @throws SQLException 
	 * */
	public User logIn(User user) throws SQLException {
		if (user.getName().equals("customer")) {
			
		String sql = "select * from customer where customer_id = "+user.getId();
		ResultSet rs = Database.executeQuery(sql);
//		connection.close();
//		statement.close();
		if(rs.next()) {
			Customer customer = new Customer();
			Address[] addresses = new Address[3];
			addresses[0] = new Address(rs.getString("addr1"));
			addresses[1] = new Address(rs.getString("addr2"));
			addresses[2] = new Address(rs.getString("addr3"));
			System.out.println(addresses[0].getAddress());
			System.out.println(addresses[1].getAddress());
			System.out.println(addresses[2].getAddress());
			System.out.println("asdalsdjdalksdd");
			
			customer.setId(rs.getString("customer_id"));
			customer.setName(rs.getString("name"));
			customer.setAddr(addresses);
			
			customer.setPasswd(rs.getString("passwd"));
			Database.closeConnection();
			return customer;
		}
		Database.closeConnection();
		return null;
		} else {
			
			String sql = "select * from admin where admin_id = "+user.getId();
			ResultSet rs = Database.executeQuery(sql);
			if (rs.next()) {
				Admin admin = new Admin();
				admin.setId(rs.getString("admin_id"));
				admin.setName(rs.getString("name"));
				admin.setState(rs.getInt("position"));
				admin.setPasswd(rs.getString("passwd"));
				Database.closeConnection();
				return admin;
			}
			Database.closeConnection();
			return null;
			
		}
	}
	
	
	/**
	 * @throws SQLException   
	* @Title: search  
	* @Description: 查询参数中给定的状态的产品信息 
	* @param @param state
	* @param @return    参数  
	* @return Product[]    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder(int state) throws SQLException {
		String sql = "select * from orders where state = "+state;
		ResultSet resultSet = Database.executeQuery(sql);
		ArrayList<Order> list = new ArrayList<Order>();
		while (resultSet.next()) {
			list.add(new Order(resultSet.getString("order_id"),resultSet.getString("customer_id"),resultSet.getInt("price"),resultSet.getInt("product_id"),resultSet.getInt("state")));
		}
		int size = list.size();
		Order[] orders = new Order[size];
		for(int i = 0;i<size;i++) {
			orders[i]= list.get(i); 
		}
		Database.closeConnection();
		return orders;
	}
	
	
	/**
	 * @throws IOException 
	 * @throws SQLException   
	* @Title: search  
	* @Description: 此函数用于查询手机，参数为关键词如果为空则返回所有手机信息  
	* @param @param string
	* @param @return    参数  
	* @return Product[]    返回类型  
	* @throws  
	*/  
	public Product[] searchProduct(String phoneName) throws SQLException, IOException {
		String sql = "select * from product where `name` like '%" + phoneName +"%'";
		ResultSet resultSet = Database.executeQuery(sql);
		ArrayList<Product> list = new ArrayList<Product>();
		
		
		while (resultSet.next()) {
			
			list.add(new Product(resultSet.getInt("product_id"),resultSet.getInt("price"),
					resultSet.getString("name"),resultSet.getString("image1"),
					resultSet.getString("image2"),resultSet.getString("image3"),
					resultSet.getString("image4"),resultSet.getString("image5"),
					resultSet.getString("image6"),resultSet.getString("image7"),resultSet.getString("description1"),
					resultSet.getString("description2"),resultSet.getString("description3"),
					resultSet.getString("description4"),resultSet.getString("description5"),
					resultSet.getString("description6"),resultSet.getString("group"),
					resultSet.getInt("memory"),resultSet.getInt("pixel"),
					resultSet.getInt("battery"),resultSet.getString("processor")));
		}
		int size = list.size();
		Product[] products = new Product[size];
		for(int i = 0;i<size;i++) {
			products[i]= list.get(i); 
		}
		Database.closeConnection();
		return products;
	}

}
