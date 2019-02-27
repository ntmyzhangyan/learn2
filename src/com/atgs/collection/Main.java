package com.atgs.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) ctx.getBean("person3");
		System.out.println(person);
		NewPerson newPerson=(NewPerson) ctx.getBean("person4");
		System.out.println(newPerson);
		DataSource dataSource=(DataSource) ctx.getBean("datasource");
		System.out.println(dataSource);
		person=(Person) ctx.getBean("person5");
		System.out.println(person);
		person=(Person) ctx.getBean("person6");
		System.out.println(person);
	}
}
