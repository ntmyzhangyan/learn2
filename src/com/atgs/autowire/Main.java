package com.atgs.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	//�Զ�����
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire.xml");
		Person person =(Person) ctx.getBean("person");
		System.out.println(person);
		person =(Person) ctx.getBean("person2");
		System.out.println(person);
	}
}
