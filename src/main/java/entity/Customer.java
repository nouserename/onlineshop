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
	* ����һ���µ�ʵ�� Customer.  
	*    
	*/
	public Customer(String id) {
		// TODO �Զ����ɵĹ��캯�����
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
				throw new UserNotFoundException("���ݸ�����idû���ҵ����û�");
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
	* ����һ���µ�ʵ�� Customer.  
	*    
	*/
	public Customer() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	/**
	 * @return sex
	 */
	public boolean isSex() {
		return sex;
	}
	/**
	 * @param sex Ҫ���õ� sex
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
	 * @param addr Ҫ���õ� addr
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
	 * @param products Ҫ���õ� products
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
	 * @param orders Ҫ���õ� orders
	 */
	public void setOrders(Order[] orders) {
		this.orders = orders;
	}
	
	
	/**
	 * @throws SQLException   
	* @Title: logOn  
	* @Description: ע��  
	* @param @param parm.parm[0]���û�����(name)��parm[1]���˺�(customer_id)��parm[2]������(passwd)
	* @param @return    ����  
	* @return boolean    ע��ɹ�����true
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
	* @Description: ���û��򿪹��ﳵ����ʱ���ô˺����� ,�����ǲ�Ʒ��Ϣ��ֵ�����Ƕ�Ӧ����
	* @param @return    ����  
	* @return Product[]    ��������  
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
	* @Description: ���ݲ����еĲ�Ʒidɾ�����ﳵ�еĶ�Ӧ��Ʒ  
	* @param @param proId
	* @param @return    ����  
	* @return boolean    ��������  
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
	* @Description:  ���ݵ�һ��������proId�޸����ݿ��Ӧ�����ݣ��ڶ���������ʾ��һ���Ǽ�һ,���ڵڶ����������ˣ�ֱ�ӱ�ʾҪ�ĳɵ�����
	* @param @param proId
	* @param @param num
	* @param @return    ����  
	* @return boolean    ��������  
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
	* @Description: �˺��������鷳��������������д����Ҫ֮ʱ��������β���
	* 				�Ȳ�ѯ���ݿ⹺�ﳵ���Ƿ����뵱ǰ�ͻ�id�Լ���ƷId��Ӧ�ļ�¼������У����޸�����
	* 				���û�У������һ����¼ 
	* @param @param proId
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean addProduct2Trolley(int proId) throws SQLException{
		String sql1 = "Select * from trolley where customer_id = '" + this.getId() + "' and product_id = " + proId;
		
		ResultSet resultSet1 = Database.executeQuery(sql1);
		if(resultSet1.next()) {				//�жϹ��ﳵ����û����Ӧ��customer�Ͷ�Ӧ��product������������С�
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
		else {	//�����Ϊ���ݿ��й��ﳵ��û�к�����Ӧ����Ϣ����ʱӦ�ý���Ӧ����Ϣ���뵽���ﳵ�
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
	* @Description: �˺���Ϊ���������Ӧ�õ���֧�����ӿڣ��˴����������ϣ�����ֻ��Ҫ�޸���Ӷ������ɣ�
	* 				��Ҫ˵�����ǣ�������ͬһ����Ʒ���ֵĴ�����ʾ�û����������  
	* 				!!!�˴���ǿ��˵����pay������ʼ�������жϵ�ǰ�ͻ���û�����õ�ַ
	* 				������ǿ��˵�����˺����뽫����״̬��Ϊ������
	* 				�˴��뽫�����д���ļ�����Ʒ����ɼ���������������Ϣ�������ݿ�
	* @param @param products
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean pay(Product[] products) throws SQLException{
		if(this.addr.length==0) {       //�ж����û��ĵ�ַ�Ƿ�Ϊ��,���û��ĵ�ַΪ�ա�
			return false;
		}
		else {  //���û�������ַ��
			
			for(int i = 0; i<products.length;i++) {  //����Ʒ����order�����������ݿ��
				String callName = "{ call payment('"+this.getId()+"',"+products[i].getId()+","+Order.NR_waitForReceiving+") }";
				Database.callableExecute(callName);
				
			}
			Database.closeConnection();
			return true;  //ȫ����Ʒ����ɹ���
		}
	}
	
	
	
	/**  
	* @Title: searchOrder  
	* @Description: �˺������ڲ�ѯ��ǰ�ͻ������ж���  
	* @param @return    ����  
	* @return Order[]    ��������  
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
		
		if(orderList.get(0).getId() == null)	//���ʲôҲû�в鵽��ֱ�ӷ��ؿա�	
			return null;
		
		
		Order[] orderArray = new Order[orderList.size()];
		
		
		for(int i=0; i<orderList.size();i++) {
			orderArray[i] = new Order();
			System.out.println("����һ�仰"+orderList.get(i).getId());
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
	* @Description: �˺������ݲ���state���ض�Ӧ��order
	* @param @param state
	* @param @return    ����  
	* @return Order[]    ��������  
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
	* @Description: �޸ĵ�ǰ�ͻ������� 
	* @param @param oldPasswd
	* @param @param newPasswd
	* @param @return    ����  
	* @return boolean    ��������  
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
			System.out.println("�޸Ĵ���");
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
	* @Description: TODO(������һ�仰�����������������)  
	* @param @param product
	* @param @return    ����  
	* @return String    ��������  
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
	* @Description: �˺������ڲ�ѯ��ǰ�ͻ������ж����Ͷ��õĲ�Ʒ��Ϣ  
	* @param @return    ����  
	* @return Order[]    ��������  
	* @throws  
	*/  
	public String[] searchOrderFullInfo(Customer customer,int state) throws SQLException{
		ResultSet resultSet;
		if(state == -1) {	//��ѯ���ж���
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
	* @Description: �˺������ڽ���ǰ������״̬��Ϊ�ȴ����  
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean applyAfterSales(int orderid) throws SQLException {
		String sql = "UPDATE orders SET state=" + Order.NR_waitForReview + " WHERE order_id=" + orderid;
		System.out.println(sql);
		int k = Database.executeUpdate(sql);
		System.out.println("�Ѿ������ۺ�");
		Database.closeConnection();
		if(k==0)
			return false;
		return true;
	}
	
	/**  
	* @Title: searchOrderFullInofo
	* @Description: �˺������ڽ���ǰ������״̬��Ϊ���յ�
	* @param @return    ����  
	* @return boolean    ��������  
	* @throws  
	*/  
	public boolean receiveCommodity(int orderid) throws SQLException{
		String sql = "UPDATE orders SET state=" + Order.NR_Collected + " WHERE order_id=" + orderid;
		System.out.println(sql);
		int k = Database.executeUpdate(sql);
		System.out.println("�Ѿ��յ���Ʒ��");
		Database.closeConnection();
		if(k==0)
			return false;
		return true;
	}
	
	/**  
	* @Title: searchOrderFullInofo
	* @Description: �˺������ڽ���ǰ������״̬��Ϊ���յ�
	* @param @return    ����  
	* @return boolean    ��������  
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
