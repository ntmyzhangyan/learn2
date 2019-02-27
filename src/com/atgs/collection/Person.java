package com.atgs.collection;

import java.util.List;

import com.atgs.bean.Car;

public class Person {
	/*��spring����ͨ��һ�����õ�xml��ǩ����ϼ�������
	 * ����<list>  <set> <map>
	 * ����Ķ�����listһ����ʹ��list
	 * java.util.Set��Ҫʹ��<set>��ǩ ����Ԫ�صķ�����listһ��
	 * Java.util.map ͨ��<map>��ǩ���壬<map>��ǩ����ʹ�ö��<entity>��Ϊ�ӱ�ǩ��ÿ����Ŀ����һ������һ��ֵ
	 * */
	private String name;
	private int age;
	private List<Car> cars;
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
	
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public Person(){}
	public Person(String name, int age, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
}
