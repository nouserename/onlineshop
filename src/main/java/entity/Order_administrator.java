/**  
* @Title: Order_administrator.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author WenbinYu  
* @date 2019年3月19日  
* @version V1.0  
*/ 

package entity;


/**  
* @ClassName: Order_administrator  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author WenbinYu  
* @date 2019年3月19日  
*    
*/
public class Order_administrator extends Admin {
	
	
	
	
	
	
	/**  
	* 创建一个新的实例 Order_administrator.  
	*    
	*/
	public Order_administrator() {
		// TODO 自动生成的构造函数存根
		
	}
	
	/**  
	* @Title: print  
	* @Description: 打印所有未发货的订单信息 ,打印即发货，所以此函数需要将订单状态改为已发货(未收货)
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean print() {
		
		return true;
		
	}

	/**
	* <p>Title: search</p>  
	* <p>Description: </p>  
	* @param state
	* @return  
	* @see entity.User#search(int)  
	*/ 
	@Override
	public Order[] search(int state) {
		// TODO 自动生成的方法存根
		return super.search(state);
	}

}
