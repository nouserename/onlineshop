/**  
* @Title: CustomerMassage.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author PC  
* @date 2019年5月10日  
* @version V1.0  
*/ 

package entity;


/**  
* @ClassName: CustomerMassage  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author PC  
* @date 2019年5月10日  
*    
*/
public class CustomerMassage extends MyMassage {
	/**  
	* 创建一个新的实例 CustomerMassage.  
	*    
	*/
	public CustomerMassage(String msgString,String senderIdString) {
		this.magString = msgString;
		this.receiveIdString = "service";
		this.senderIdString = senderIdString;
	}
}
