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
	* ����һ���µ�ʵ�� Service.  
	*    
	*/
	public Service() {
		// TODO Auto-generated constructor stub
	}
	/* ���� Javadoc��
	 * @see entity.FindOrder#findOrder(entity.Customer)
	 */
	public Order[] findOrder(Customer whos) {
		// TODO �Զ����ɵķ������
		return null;
	}

	/* ���� Javadoc��
	 * @see entity.FindOrder#findOrderUsingState(int)
	 */
	public Order[] findOrderUsingState(int state) {
		// TODO �Զ����ɵķ������
		return null;
	}

	/* ���� Javadoc��
	 * @see entity.FindOrder#findOrderUsingId(int)
	 */
	public Order[] findOrderUsingId(int id) {
		// TODO �Զ����ɵķ������
		return null;
	}
	
	
	

}
