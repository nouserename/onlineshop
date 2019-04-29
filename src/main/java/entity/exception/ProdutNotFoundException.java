/**  
* @Title: ProdutNotFoundException.java  
* @Package entity.exception  
* @Description: TODO(用一句话描述该文件做什么)  
* @author PC  
* @date 2019年4月26日  
* @version V1.0  
*/ 

package entity.exception;


/**  
* @ClassName: ProdutNotFoundException  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author PC  
* @date 2019年4月26日  
*    
*/
public class ProdutNotFoundException extends Exception {

	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	public ProdutNotFoundException(String mas)
	{
		super(mas);
	}

}
