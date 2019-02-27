package com.atgs.bean;

public class Car {
	private String brand;
	private String corp;//ฒ๚ตุ
	private double price;
	private int maxspreed;
	
	public Car(String brand, String corp, int maxspreed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxspreed = maxspreed;
	}

	public Car(String brand, String corp, double price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
		
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setMaxspreed(int maxspreed) {
		this.maxspreed = maxspreed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price
				+ ", maxspreed=" + maxspreed + "]";
	}
	
}
