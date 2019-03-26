/**  
* @Title: Security.java  
* @Package tool  
* @Description: TODO(用一句话描述该文件做什么)  
* @author WenbinYu  
* @date 2019年3月22日  
* @version V1.0  
*/ 

package tool;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**  
* @ClassName: Security  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author WenbinYu  
* @date 2019年3月22日  
*    
*/
public class Security {
	
	
	
	/**  
	* @Title: byte2Hex  
	* @Description: 二进制转16进制 
	* @param @param bytes
	* @param @return    参数  
	* @return String    返回类型  
	* @throws  
	*/  
	private static String byte2Hex(byte[] bytes){
		 StringBuffer stringBuffer = new StringBuffer();
		 String temp = null;
		 for (int i=0;i<bytes.length;i++){
		  temp = Integer.toHexString(bytes[i] & 0xFF);
		  if (temp.length()==1){
		  //1得到一位的进行补0操作
		  stringBuffer.append("0");
		  }
		  stringBuffer.append(temp);
		 }
		 return stringBuffer.toString();
		}
	
	 /**  
	* @Title: getSHA256StrJava  
	* @Description: 对传入的字符串进行sha256运算，返回对应的哈希码 
	* @param @param str
	* @param @return    参数  
	* @return String    返回类型  
	* @throws  
	*/  
	public static String getSHA256StrJava(String str){
		 MessageDigest messageDigest;
		 String encodeStr = "";
		 try {
		  messageDigest = MessageDigest.getInstance("SHA-256");
		  messageDigest.update(str.getBytes("UTF-8"));
		  encodeStr = byte2Hex(messageDigest.digest());
		 } catch (NoSuchAlgorithmException e) {
		  e.printStackTrace();
		 } catch (UnsupportedEncodingException e) {
		  e.printStackTrace();
		 }
		 return encodeStr;
		}

}
