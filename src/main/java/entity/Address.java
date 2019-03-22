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
public class Address {
	private String phoneNumber;
	private String consigneeName;
	private String province;
	private String city;
	private String district;
	private String other;
	
	
	/**  
	* 创建一个新的实例 Address.参数是从数据库里查出来的字符串，需要将里面的一个个地址解析出来  
	*    
	*/
	public Address(String addr) {
		// TODO 自动生成的构造函数存根
		//String[] ad = addr.split("&");
		
	}
	
	
	/**  
	* 创建一个新的实例 Address.  
	*    
	*/
	public Address() {
		// TODO 自动生成的构造函数存根
	}
	
	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber 要设置的 phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return consigneeName
	 */
	public String getConsigneeName() {
		return consigneeName;
	}
	/**
	 * @param consigneeName 要设置的 consigneeName
	 */
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	/**
	 * @return province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province 要设置的 province
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city 要设置的 city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district 要设置的 district
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return other
	 */
	public String getOther() {
		return other;
	}
	/**
	 * @param other 要设置的 other
	 */
	public void setOther(String other) {
		this.other = other;
	}

}
