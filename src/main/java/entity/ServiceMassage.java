/**  
* @Title: ServiceMassage.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author PC  
* @date 2019��5��10��  
* @version V1.0  
*/ 

package entity;


/**  
* @ClassName: ServiceMassage  
* @Description: TODO(������һ�仰��������������)  
* @author PC  
* @date 2019��5��10��  
*    
*/
public class ServiceMassage extends MyMassage {
	/**  
	* ����һ���µ�ʵ�� ServiceMassage.  
	*    
	*/
	public ServiceMassage(String magString,String reciverIdString) {
		// TODO Auto-generated constructor stub
		this.senderIdString="service";
		this.magString = magString;
		this.receiveIdString = reciverIdString;
	}
}
