package com.atgs.cycle;

public class Car {
	
	private String brand;
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("setBrand");
	}
	public Car(){
		System.out.println("������");
	}
	public void init2(){
		System.out.println("init����");
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	public void destory(){
		System.out.println("���ٷ���");
	}

}
