/**  
* @Title: CustomerMassage.java  
* @Package entity  
* @Description: TODO(��һ�仰�������ļ���ʲô)  
* @author PC  
* @date 2019��5��10��  
* @version V1.0  
*/ 

package entity;


/**  
* @ClassName: CustomerMassage  
* @Description: TODO(������һ�仰��������������)  
* @author PC  
* @date 2019��5��10��  
*    
*/
public class CustomerMassage extends MyMassage {
	/**  
	* ����һ���µ�ʵ�� CustomerMassage.  
	*    
	*/
	public CustomerMassage(String msgString,String senderIdString) {
		this.magString = msgString;
		this.receiveIdString = "service";
		this.senderIdString = senderIdString;
	}
}
