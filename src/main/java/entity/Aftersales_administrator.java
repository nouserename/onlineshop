/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.sql.SQLException;

/**  
* @ClassName: Aftersales_administrator  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author WenbinYu  
* @date 2019年3月19日  
*    
*/ 
public class Aftersales_administrator extends Admin{


	
	/**  
	* @Title: verify  
	* @Description: 用来同意或者拒绝客户的售后申请  ，true表示同意，false表示不同意，同意将订单状态改为等待退货，不同意改为审核未通过
	* @param @param agrNage
	* @param @param o
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean verify(boolean agrNage,Order o) {
		//TODO
		return true;
	}

	/**
	* <p>Title: searchOrder</p>  
	* <p>Description: </p>  
	* @param state
	* @return  
	 * @throws SQLException 
	* @see entity.Admin#searchOrder(int)  
	* 返回所有状态为等待审核的订单
	*/ 
	@Override
	public Order[] searchOrder(int state) throws SQLException {
		// TODO 自动生成的方法存根
		return super.searchOrder(state);
	}
	

}
