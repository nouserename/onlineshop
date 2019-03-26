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
public class Order {
	private String id;
	private String customerId;
	
	private int price;
	private int productId;
	private int state;
	
	/**  
	* @Fields field:field:未发货  
	*/ 
	final static int NR_waitForReceiving 	= 0;
	
	/**  
	* @Fields field:field:未收货  
	*/ 
	final static int NR_unCollected 		= 1;

	/**  
	* @Fields field:field:已收货,此状态下可以申请售后(此状态由未收货状态经过7天自动改变而来),申请售后函数暂未实现  
	*/ 
	final static int NR_Collected 			= 2;

	/**  
	* @Fields field:field:等待审核  
	*/ 
	final static int NR_waitForReview 		= 3;

	/**  
	* @Fields field:field:卖家等待买家退货 
	*/ 
	final static int NR_waitForReturn 		= 4;

	/**  
	* @Fields field:field:退货完成  
	*/ 
	final static int NR_returnedFinish 		= 5;

	/**  
	* @Fields field:field:审核未通过 
	*/ 
	final static int NR_reviewNotPass 		= 6;
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
	 * @return orderNo
	 */
	/**
	 * @return customer
	 */
	public String getCustomer() {
		return customerId;
	}
	/**
	 * @param customer 要设置的 customer
	 */
	public void setCustomer(String customer) {
		this.customerId = customer;
	}
	/**
	 * @return totalPrice
	 */
	public int getTotalPrice() {
		return price;
	}
	/**
	 * @param totalPrice 要设置的 totalPrice
	 */
	public void setTotalPrice(int totalPrice) {
		this.price = totalPrice;
	}
	/**
	 * @return amount
	 */
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
	/**
	 * @return product
	 */
	public int getProduct() {
		return productId;
	}
	/**
	 * @param product 要设置的 product
	 */
	public void setProduct(int product) {
		this.productId = product;
	}
	
	
	

}
