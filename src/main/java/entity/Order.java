/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.util.Calendar;

/**
 * @author YWB
 *
 */
public class Order {
	private int id;
	private int orderNo;
	private Customer customer;
	private Calendar orderDate;
	private double totalPrice;
	private int amount;
	private int state;
	final static int NR_notDelivered = 0;
	final static int NR_unCollected = 1;
	final static int NR_finish = 2;
	final static int NR_returning = 3;
	final static int NR_returned = 4;
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
	 * @return orderNo
	 */
	public int getOrderNo() {
		return orderNo;
	}
	/**
	 * @param orderNo 要设置的 orderNo
	 */
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * @return customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer 要设置的 customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return orderDate
	 */
	public Calendar getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate 要设置的 orderDate
	 */
	public void setOrderDate(Calendar orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice 要设置的 totalPrice
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount 要设置的 amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state 要设置的 state
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * 将订单状态转换为NotDelivered
	 * */
	public boolean orderNotDelivered() {
		
		//TODO
		
		return true;
	}
	
	/**
	 * 将订单状态改为unCollected
	 * */
	public boolean orderUnCollected() {
		//TODO
		return true;
	}
	
	/**
	 * 将订单状态改为Finish
	 * */
	public boolean orderFinish() {
		//TODO
		return true;
	}
	/**
	 * 将订单状态改为Returning
	 * 
	 * */
	public boolean orderReturning() {
		//TODO
		return true;
	}
	/**
	 * 将订单状态改为Returned
	 * 
	 * */
	public boolean orderReturned() {
		//TODO
		return true;
	}
	
	
	

}
