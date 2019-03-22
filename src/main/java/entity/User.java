/**  
* @Title: User.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author WenbinYu  
* @date 2019年3月15日  
* @version V1.0  
*/ 

package entity;


/**  
* @ClassName: User  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author WenbinYu  
* @date 2019年3月15日  
*    
*/
public class User {
	private String passwd;
	private String id;
	private String name;
	
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd 要设置的 passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param user 传入登陆者的信息
	 * @return 用户信息存在，返回用户信息，否则weinull
	 * user.name中存储的是用户类别，此处需要你根据name的值选择查询哪张表
	 * */
	public User logIn(User user) {
		return null;
	}
	
	
	/**  
	* @Title: search  
	* @Description: 查询参数中给定的状态的产品信息 
	* @param @param state
	* @param @return    参数  
	* @return Product[]    返回类型  
	* @throws  
	*/  
	public Order[] searchOrder(int state) {
		return null;
	}
	
	
	/**  
	* @Title: search  
	* @Description: 此函数用于查询手机，参数为关键词如果为空则返回所有手机信息  
	* @param @param string
	* @param @return    参数  
	* @return Product[]    返回类型  
	* @throws  
	*/  
	public Product[] searchProduct(String phoneName) {
		
		return null;
	}

}
