package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bookapp.model.service.BookService;
//@ComponentScan({"com.bookapp"})
//@EntityScan("com.bookapp.model.dao")
//@EnableJpaRepositories("com.bookapp.model.dao")
@SpringBootApplication
@EnableCaching
@EnableScheduling 
public class Bookapp2Application{

	@Autowired
	private BookService bookService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Bookapp2Application.class, args);
	}


}
