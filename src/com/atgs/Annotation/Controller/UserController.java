package com.atgs.Annotation.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.atgs.Annotation.service.UserService;

@Controller
public class UserController {
	@Autowired
	//@Autowired �Զ�װ�俴IOC�������Ƿ�����UserService��ƥ�����
	private UserService userService;
	public void execute(){
		System.out.println("userController execute...");
		userService.add();
	}
}
