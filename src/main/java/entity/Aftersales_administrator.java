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
public class Aftersales_administrator extends Admin implements FindOrder{

	/* （非 Javadoc）
	 * @see entity.FindOrder#findOrder(entity.Customer)
	 */
	public Order[] findOrder(Customer whos) {
		// TODO 自动生成的方法存根
		return null;
	}

	/* （非 Javadoc）
	 * @see entity.FindOrder#findOrderUsingState(int)
	 */
	public Order[] findOrderUsingState(int state) {
		// TODO 自动生成的方法存根
		return null;
	}

	/* （非 Javadoc）
	 * @see entity.FindOrder#findOrderUsingId(int)
	 */
	public Order[] findOrderUsingId(int id) {
		// TODO 自动生成的方法存根
		return null;
	}
	
	public boolean verify(boolean agrNage,Order o) {
		//TODO
		return true;
	}

}
