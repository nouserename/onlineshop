/**
 * vendredi 08 03 2019
 *@AUTHOR YWB<1931976993@QQ.COM>
 *TODO
 */
package entity;

import java.awt.Color;
import java.awt.Image;

/**
 * @author YWB
 *
 */
public class Product {
	private int id;
	private double price;
	private String name;
	private Image[] images;
	private Color color;
	private String group;
	private int memory;
	private int pixel;
	private int battery;
	private String processor;
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
	 * @return color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color 要设置的 color
	 */
	public void setColor(Color color) {
		this.color = color;
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

}
