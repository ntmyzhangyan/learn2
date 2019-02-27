package com.atgs.Annotation.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.atgs.Annotation.repository.UserRepository;
//Ä£ÄâÒµÎñ²ã
@Service
public class UserService {
	@Autowired
	@Qualifier("userRepositoryImpl")
	public UserRepository userRepository;
	
	public void setUserRepository( UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void add(){
		System.out.println("userService add...");
		userRepository.save();
	}
	
}
