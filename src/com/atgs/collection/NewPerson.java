package com.atgs.collection;

import java.util.Map;
import com.atgs.bean.Car;

public class NewPerson {
	/*在spring可以通过一组内置的xml标签来配合集合属性
	 * 例如<list>  <set> <map>
	 * 数组的定义与list一样都使用list
	 * java.util.Set需要使用<set>标签 定义元素的方法与list一样
	 * Java.util.map 通过<map>标签定义，<map>标签可以使用多个<entity>作为子标签，每个条目包含一个键和一个值
	 * */
	private String name;
	private int age;
	private Map<String, Car> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	public NewPerson(){}
	
	public NewPerson(String name, int age, Map<String, Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars
				+ "]";
	}
	
	
	
}
