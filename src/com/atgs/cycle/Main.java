package com.atgs.cycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	/*
	 * spring IOC 容器对 Bean 的生命周期进行管理的过程
	 * 1> 通过构造器或工厂方法创建 Bean 实例
	 * 2>为Bean的属性设置值和对其他Bean的引用
	 * 3>将bean的实例传递给Bean后置处理器的 postProcessBeforeInitinitilization 方法
	 * 4>调用bean的初始化方法
	 * 5>将Bean实例传递给Bean后置处理器的postProcessAfteInittialization方法
	 * 6>bean可以使用
	 * 7>容器关闭时，调用bean的销毁方法
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");
		Car car= (Car) ctx.getBean("car");
		System.out.println(car);
		//MyBeanPostProcessor myBeanPostProcessor=(MyBeanPostProcessor) ctx.getBean("myBeanPostProcessor");
		
	}
}
