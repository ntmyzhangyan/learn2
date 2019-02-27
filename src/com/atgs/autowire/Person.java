package com.atgs.autowire;

public class Person {
	private String name;
	private Car cars;
	private Address address;
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
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", cars=" + cars + ", address=" + address
				+ "]";
	}
	
}
