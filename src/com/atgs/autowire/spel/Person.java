package com.atgs.autowire.spel;

public class Person {
	private String name;
	private Car cars;
	private String city;
	private String info;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCars() {
		return cars;
	}
	public void setCars(Car cars) {
		this.cars = cars;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", cars=" + cars + ", city=" + city
				+ ", info=" + info + "]";
	}
	
	
}
