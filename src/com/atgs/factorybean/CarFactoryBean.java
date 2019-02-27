package com.atgs.factorybean;

import org.springframework.beans.factory.FactoryBean;
//自定义的factoryBean 需要实现 FactoryBean接口
public class CarFactoryBean implements FactoryBean<Car> {
	private String brand;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//返回bean对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand,500000);
	}

	//返回bean类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}
	//返回是否是单例
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
}
