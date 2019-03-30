/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * @author YWB
 *
 */
public class Root extends Admin {
	public Admin[] admins;
	/**  
	* 创建一个新的实例 Root.  
	 * @throws SQLException 
	*    
	*/
	public Root() throws SQLException {
		admins = findAdmin();
	}
	
	
	
	/**
	 * @throws SQLException   
	* @Title: findAdmin  
	* @Description: 查询管理员信息
	* @param @param admin
	* @param @return    参数  
	* @return Admin[]    返回类型  
	* @throws  
	*/  
	public Admin[] findAdmin() throws SQLException {
		String sqlString = " select * from admin ";
		ResultSet re= Database.executeQuery(sqlString);
		 List<Admin> ad = new ArrayList<Admin>();
		 while(re.next()) {
			 ad.add(new Admin(re.getString("admin_id"),re.getInt("position"),re.getString("name"),re.getString("passwd")));
		 }	
		 Admin[] a = new Admin[ad.size()] ;
		 for(int i=0; i<ad.size();i++) {
			 a[i]=ad.get(i);
		 }
		Database.closeConnection();
		return a;
	}
	
	/**
	 * @throws SQLException   
	* @Title: deleteAdmin  
	* @Description: 删除参数中的admin
	* @param @param admin
	* @param @return    参数  
	* @return boolean    返回类型  
	* @throws  
	*/  
	public boolean deleteAdmin(Admin admin) throws SQLException {
		String sqlString = " delete * from admin where admin_id = '"+ admin.getId()+"'";
		int s= Database.executeUpdate(sqlString);
		if (s==0) {
			Database.closeConnection();
			return false;
			
		}
		Database.closeConnection();
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
	public boolean addAdmin(Admin admin) throws SQLException{
		
		String sqlString = " select * from admin where admin_id = '"+ admin.getId()+"'";
		ResultSet re= Database.executeQuery(sqlString);
		if(re.next()) {
			String sq = "Update admin set admin_id = '" + admin.getId() + "',position=" + admin.getState() + ",name='" + admin.getName() + "',passwd='"+admin.getPasswd()+"'";
			int rs= Database.executeUpdate(sq);
			if(rs==0) {
				Database.closeConnection();
				return false;
			}
			else {
				Database.closeConnection();
				return true;}
		}
		else {
			String a =" Insert INTO admin (admin_id, position, name, passwd) VALUES ('"+admin.getId()+"',"+admin.getState()+",'"+admin.getName()+"','"+admin.getPasswd()+"')";
			int r= Database.executeUpdate(a);
			if(r==0) {
				Database.closeConnection();
				return false;
			}
			else {
				Database.closeConnection();
				return true;}
		}
		
	
		
	}
	

}
