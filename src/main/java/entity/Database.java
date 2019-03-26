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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**  
* @ClassName: Database  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author WenbinYu  
* @date 2019年3月22日  
*    
*/
public class Database {
	//?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false
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
    /**  
    * @Title: executeQuery  
    * @Description: 封装了jdbc的对应方法  
    * @param @param connection
    * @param @param sql
    * @param @return
    * @param @throws SQLException    参数  
    * @return ResultSet    返回类型  
    * @throws  
    */  
    private static ResultSet executeQuery(Connection connection,String sql) throws SQLException {
    	PreparedStatement statement = connection.prepareStatement(sql);
    	ResultSet resultSet = statement.executeQuery();
    	return resultSet;
    }
    
    
     
    private static int executeUpdate(Connection connection,String sql) throws SQLException {
    	PreparedStatement statement = connection.prepareStatement(sql);
    	int influenceLine = statement.executeUpdate();
    	return influenceLine;
    }
    
    /**  
     * @Title: executeUpdate  
     * @Description: 封装了jdbc对应的方法  
     * @param @param connection
     * @param @param sql
     * @param @return
     * @param @throws SQLException    参数  
     * @return int    返回类型  
     * @throws  
     */ 
    public static int executeUpdate(String sql) throws SQLException {
    	return executeUpdate(getConnection(), sql);
    }
    
    /**  
     * @Title: executeQuery  
     * @Description: 封装了jdbc的对应方法  
     * @param @param connection
     * @param @param sql
     * @param @return
     * @param @throws SQLException    参数  
     * @return ResultSet    返回类型  
     * @throws  
     */ 
    public static ResultSet executeQuery(String sql) throws SQLException {
    	return executeQuery(getConnection(), sql);
    }
    
    
    public static Connection opendb(){
        
        try {
            Connection connection = Database.getConnection();
            
            System.out.println("数据库连接成功");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
    Connection connection = opendb();
    System.out.println(connection);
}

}


