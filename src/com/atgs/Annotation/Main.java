package com.atgs.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atgs.Annotation.Controller.UserController;
import com.atgs.Annotation.repository.UserRepository;
import com.atgs.Annotation.repository.UserRepositoryImpl;
import com.atgs.Annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-anntation.xml");
		TestObject to=(TestObject) ctx.getBean("testObject");
		System.out.println(to);
		
		UserController userController=(UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
		
		UserService userService=(UserService) ctx.getBean("userService");
		System.out.println(userService);
		UserRepository repository=(UserRepository) ctx.getBean("userRepository");
		System.out.println(repository);
	}
}
