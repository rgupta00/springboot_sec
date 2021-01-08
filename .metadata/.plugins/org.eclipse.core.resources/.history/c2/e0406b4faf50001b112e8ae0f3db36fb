package com.bookapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
//@ComponentScan({"com.bookapp"})
//@EntityScan("com.bookapp.model.dao")
//@EnableJpaRepositories("com.bookapp.model.dao")
@SpringBootApplication
public class Bookapp2Application{

	@Autowired
	private BookService bookService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Bookapp2Application.class, args);
	}


}
