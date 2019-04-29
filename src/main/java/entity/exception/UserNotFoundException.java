/**  
* @Title: UserNotFoundException.java  
* @Package entity  
* @Description: TODO(用一句话描述该文件做什么)  
* @author PC  
* @date 2019年4月26日  
* @version V1.0  
*/ 

package entity.exception;


/**  
* @ClassName: UserNotFoundException  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author PC  
* @date 2019年4月26日  
*    
*/
public class UserNotFoundException extends Exception{

	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	
	
	
	/**  
	* 创建一个新的实例 UserNotFoundException.  
	*    
	*/
	public UserNotFoundException(String mas) {
		// TODO Auto-generated constructor stub
		super(mas);
	}
	
	/**
	* <p>Title: getMessage</p>  
	* <p>Description: </p>  
	* @return  
	* @see java.lang.Throwable#getMessage()  
	*/ 
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	/**
	* <p>Title: getCause</p>  
	* <p>Description: </p>  
	* @return  
	* @see java.lang.Throwable#getCause()  
	*/ 
	@Override
	public synchronized Throwable getCause() {
		// TODO Auto-generated method stub
		return super.getCause();
	}

	/**
	* <p>Title: toString</p>  
	* <p>Description: </p>  
	* @return  
	* @see java.lang.Throwable#toString()  
	*/ 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/**
	* <p>Title: printStackTrace</p>  
	* <p>Description: </p>    
	* @see java.lang.Throwable#printStackTrace()  
	*/ 
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}

}
