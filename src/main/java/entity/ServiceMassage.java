/**  
* @Title: ServiceMassage.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author PC  
* @date 2019年5月10日  
* @version V1.0  
*/ 

package entity;


/**  
* @ClassName: ServiceMassage  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author PC  
* @date 2019年5月10日  
*    
*/
public class ServiceMassage extends MyMassage {
	/**  
	* 创建一个新的实例 ServiceMassage.  
	*    
	*/
	public ServiceMassage(String magString,String reciverIdString) {
		// TODO Auto-generated constructor stub
		this.senderIdString="service";
		this.magString = magString;
		this.receiveIdString = reciverIdString;
	}
}
