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
public class Root extends Admin {
	public Admin[] admins;
	/**  
	* 创建一个新的实例 Root.  
	*    
	*/
	public Root() {
		admins = findAdmin();
	}
	
	
	
	/**  
	* @Title: findAdmin  
	* @Description: 查询管理员信息
	* @param @param admin
	* @param @return    参数  
	* @return Admin[]    返回类型  
	* @throws  
	*/  
	public Admin[] findAdmin() {
		
		return null;
	}
	
	/**  
	* @Title: deleteAdmin  
	* @Description: 删除参数中的admin
	* @param @param admin
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean deleteAdmin(Admin admin) {
		return true;
	}
	
	
	/**  
	* @Title: addAdmin  
	* @Description: 此函数有两个作用，先在数据库做一次查询，如果查到有管理员，则修改信息，如果没有则新增一条记录  
	* @param @param admin
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean addAdmin(Admin admin) {
		
		return true;
		
	}
	

}
