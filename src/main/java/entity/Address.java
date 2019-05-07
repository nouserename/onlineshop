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
	* ����һ���µ�ʵ�� Address.�����Ǵ����ݿ����������ַ�������Ҫ�������һ������ַ��������  
	*    
	*/
	public Address(String addr) {
		String[] address = addr.split("/");
		this.province = address[0];
		this.city = address[1];
		this.district = address[2];
		this.other = address[3];
		this.phoneNumber = address[4];
		this.consigneeName = address[5];
	}
	
	
	/**  
	* ����һ���µ�ʵ�� Address.  
	*    
	*/
	public Address() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber Ҫ���õ� phoneNumber
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
	 * @param consigneeName Ҫ���õ� consigneeName
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
	 * @param province Ҫ���õ� province
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
	 * @param city Ҫ���õ� city
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
	 * @param district Ҫ���õ� district
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
	 * @param other Ҫ���õ� other
	 */
	public void setOther(String other) {
		this.other = other;
	}
	
	public String getAddress() {
		String addressString =  this.province + this.city + this.district + this.other + ";" + this.phoneNumber + ";" + this.consigneeName;
		return addressString;
	}
	
	public String justAddress() {
		return this.consigneeName + "/" + this.phoneNumber+ "/" + this.province + "/" + this.getCity() + "/" + this.getDistrict() + "/" + this.getOther();
	}

}
