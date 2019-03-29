/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author YWB
 *
 */
public class Product {
	private int id;
	private double price;
	private String name;
	
	/**  
	* @Fields field:field:第一项缩略图，第二项用户首页展示图，后续是商品详情图  
	*/ 
	private Image[] images = new Image[7];
	/**  
	* @Fields field:field:第一项是用户首页配套文字，其余是商品详情配套文字
	*/ 
	private String[] description = new String[6];
	private String group;
	private int memory;
	private int pixel;
	private int battery;
	private String processor;
	
	
	public Product(int id,double price,String name,
			String image,String image2,String image3,
			String image4,String image5,String image6,
			String image7,String description1,
			String description2,String description3,
			String description4,String description5,
			String description6,String group,int memory,
			int pixel,int battery,String processor) throws IOException {
		this.id = id;
		this.price = price;
		this.name = name;
		this.images[0] = ImageIO.read(new File(image));
		this.images[1] = ImageIO.read(new File(image2));
		this.images[2] = ImageIO.read(new File(image3));
		this.images[3] = ImageIO.read(new File(image4));
		this.images[4] = ImageIO.read(new File(image5));
		this.images[5] = ImageIO.read(new File(image6));
		this.images[6] = ImageIO.read(new File(image7));
		this.description[0] = description1;
		this.description[2] = description2;
		this.description[3] = description3;
		this.description[4] = description4;
		this.description[5] = description5;
		this.group = group;
		this.memory = memory;
		this.pixel = pixel;
		this.battery = battery;
		this.processor = processor;
		
		
		// TODO 自动生成的构造函数存根
	}
	
	/**  
	* 创建一个新的实例 Product.  
	*    
	*/
	public Product() {
		// TODO 自动生成的构造函数存根
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price 要设置的 price
	 */
	public void setPrice(double price) {
		this.price = price;
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
	 * @return images
	 */
	public Image[] getImages() {
		return images;
	}
	/**
	 * @param images 要设置的 images
	 */
	public void setImages(Image[] images) {
		this.images = images;
	}
	/**
	 * @return group
	 */
	public String getGroup() {
		return group;
	}
	/**
	 * @param group 要设置的 group
	 */
	public void setGroup(String group) {
		this.group = group;
	}
	/**
	 * @return memory
	 */
	public int getMemory() {
		return memory;
	}
	/**
	 * @param memory 要设置的 memory
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	/**
	 * @return pixel
	 */
	public int getPixel() {
		return pixel;
	}
	/**
	 * @param pixel 要设置的 pixel
	 */
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	/**
	 * @return battery
	 */
	public int getBattery() {
		return battery;
	}
	/**
	 * @param battery 要设置的 battery
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}
	/**
	 * @return processor
	 */
	public String getProcessor() {
		return processor;
	}
	/**
	 * @param processor 要设置的 processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	/**
	 * @return description
	 */
	public String[] getDescription() {
		return description;
	}
	/**
	 * @param description 要设置的 description
	 */
	public void setDescription(String[] description) {
		this.description = description;
	}

}
