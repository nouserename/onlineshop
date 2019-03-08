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
public class Customer {
	private int id;
	private String name;
	private String passwd;
	private boolean sex;
	private int credit;
	private Address[] addr;
	private Product[] products;
	private Order[] orders;
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
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

}
