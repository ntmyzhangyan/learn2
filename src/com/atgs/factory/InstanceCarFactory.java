package com.atgs.factory;

import java.util.HashMap;
import java.util.Map;
/**
 * ʵ������������ʵ�������ķ�����������Ҫ�������������ٵ��ù�����ʵ��
 * @author lenovo
 *
 */
public class InstanceCarFactory {
	private Map<String, Car> cars = null;
	
	public InstanceCarFactory(){
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi",30000));
		cars.put("ford", new Car("ford", 400000));
	}
	public Car getCar(String brand){
		
		return cars.get(brand);
		
	}
}
