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
public class Service extends Admin implements FindOrder{

	public String customerIdString;
	
	
	public Service(Admin admin){
		this.setId(admin.getId());
		this.setName(admin.getName());
		this.setPasswd(admin.getPasswd());
	}
	
	
	
	/**  
	* 创建一个新的实例 Service.  
	*    
	*/
	public Service() {
		// TODO Auto-generated constructor stub
	}
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
	
	
	

}
