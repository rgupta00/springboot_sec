package com.bookapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.service.UserService;

@SpringBootApplication
public class SecdemoApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(SecdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		User user1=new User("raj", "raj123", new String[] {"ROLE_ADMIN","ROLE_MGR","ROLE_EMP"});
//		User user2=new User("ekta", "ekta123", new String[] {"ROLE_MGR","ROLE_EMP"});
//		User user3=new User("gun", "gun123", new String[] {"ROLE_EMP"});
//		
//		userService.addUser(user1);
//		userService.addUser(user2);
//		userService.addUser(user3);
		
	
		
		
	}

}









