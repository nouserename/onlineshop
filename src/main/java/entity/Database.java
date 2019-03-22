/**  
* @Title: Database.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author WenbinYu  
* @date 2019年3月22日  
* @version V1.0  
*/ 

package entity;

import java.sql.Connection;
import java.sql.DriverManager;

/**  
* @ClassName: Database  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author WenbinYu  
* @date 2019年3月22日  
*    
*/
public class Database {
    private static final  String url = "jdbc:mysql://39.105.17.254:3306/onlineshop?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false";
private static final  String username = "root";
private static final  String password = "root";
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            return  connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
        
    }
    public static void closeConnection(Connection connection){
	try {
		
		
		if(connection!=null)connection.close();
	} catch (Exception e) {
		e.fillInStackTrace();
	}
}
    
    public static void opendb(){
        
        try {
            Database.getConnection();
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    opendb();
}

}


