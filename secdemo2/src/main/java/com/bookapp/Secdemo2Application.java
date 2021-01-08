package com.bookapp;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.repo.AppUser;
import com.bookapp.service.AppUserService;

@SpringBootApplication
public class Secdemo2Application implements CommandLineRunner{

	@Autowired
	private AppUserService appUserService;
	
	public static void main(String[] args) {
		SpringApplication.run(Secdemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		AppUser appUser1=new AppUser("raj", "raj123", Arrays.asList("ROLE_ADMIN","ROLE_MGR","ROLE_EMP"));
//		AppUser appUser2=new AppUser("ekta", "ekta123", Arrays.asList("ROLE_MGR","ROLE_EMP"));
//		AppUser appUser3=new AppUser("gun", "gun123", Arrays.asList("ROLE_EMP"));
//		
//		appUserService.addUser(appUser1);
//		appUserService.addUser(appUser2);
//		appUserService.addUser(appUser3);
		
		
//		
		//List<AppUser> users=appUserService.getAllAppUsers();
		//users.forEach(user-> System.out.println(user));
	}

}










