package com.atgs.Annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atgs.Annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@Autowired(required=false)//没有装配上也可以
	private TestObject testObject;
	
	public void save(){
		System.out.println("UserRepository Save");
		System.out.println(testObject);
	}
}
