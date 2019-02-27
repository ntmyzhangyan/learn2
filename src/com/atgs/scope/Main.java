package com.atgs.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atgs.autowire.Car;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car1=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		//���Ϊtrue������ͬһ������
		System.out.println(car1==car2);
		
	}
}
