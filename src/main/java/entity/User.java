/**  
* @Title: User.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author WenbinYu  
* @date 2019��3��15��  
* @version V1.0  
*/ 

package entity;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**  
* @ClassName: User  
* @Description: TODO(������һ�仰��������������)  
* @author WenbinYu  
* @date 2019��3��15��  
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
	 * @param id Ҫ���õ� id
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
	 * @param passwd Ҫ���õ� passwd
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
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param user �����½�ߵ���Ϣ
	 * @return �û���Ϣ���ڣ������û���Ϣ������weinull
	 * user.name�д洢�����û���𣬴˴���Ҫ�����name��ֵѡ���ѯ���ű�
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
	* @Description: ��ѯ�����и�����״̬�Ĳ�Ʒ��Ϣ 
	* @param @param state
	* @param @return    ����  
	* @return Product[]    ��������  
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
	* @Description: �˺������ڲ�ѯ�ֻ�������Ϊ�ؼ������Ϊ���򷵻������ֻ���Ϣ  
	* @param @param string
	* @param @return    ����  
	* @return Product[]    ��������  
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
