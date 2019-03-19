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
public interface FindOrder {
	/**
	 * @param whos 传入下单人信息
	 * @return 返回订单信息
	 * */
	abstract public Order[] findOrder(Customer whos);
	
	
	abstract public Order[] findOrderUsingState(int state);
	
	abstract public Order[] findOrderUsingId(int id);

}
