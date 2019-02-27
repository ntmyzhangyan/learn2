package com.atgs.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
//后置处理器
	//bean 原生bean beanName 修改后的bean
	@Override 
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization"+beanName +"," +beanName);
		Car car =new Car();
		car.setBrand("ford");
		
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if("car".equals("beanName")){
			
		}
		System.out.println("postProcessBeforeInitialization"+beanName +","+beanName);
		return bean;
	}

}
