package practice.core.java.cloning;

public class Rectangle implements Cloneable{

	private int length;
	private int width;
	private int height;

	/*
	 * Getters and Setters
	 */
	protected Rectangle clone() throws CloneNotSupportedException{
		return (Rectangle)super.clone();
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
