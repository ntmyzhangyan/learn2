package com.atgs.collection;

import java.util.Map;
import com.atgs.bean.Car;

public class NewPerson {
	/*��spring����ͨ��һ�����õ�xml��ǩ����ϼ�������
	 * ����<list>  <set> <map>
	 * ����Ķ�����listһ����ʹ��list
	 * java.util.Set��Ҫʹ��<set>��ǩ ����Ԫ�صķ�����listһ��
	 * Java.util.map ͨ��<map>��ǩ���壬<map>��ǩ����ʹ�ö��<entity>��Ϊ�ӱ�ǩ��ÿ����Ŀ����һ������һ��ֵ
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
