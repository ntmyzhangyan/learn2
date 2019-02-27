package com.atgs.Annotation.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.atgs.Annotation.service.UserService;

@Controller
public class UserController {
	@Autowired
	//@Autowired 自动装配看IOC容器中是否有与UserService相匹配的类
	private UserService userService;
	public void execute(){
		System.out.println("userController execute...");
		userService.add();
	}
}
