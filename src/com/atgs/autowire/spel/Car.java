package com.atgs.autowire.spel;

public class Car {
	private String brand;
	private double price;
	private double tyrepremeater;
	
	
	public double getTyrepremeater() {
		return tyrepremeater;
	}
	public void setTyrepremeater(double tyrepremeater) {
		this.tyrepremeater = tyrepremeater;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrepremeater="
				+ tyrepremeater + "]";
	}
	
}
