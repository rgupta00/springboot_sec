package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.dao.Book;
import com.bookapp.service.BookService;

@SpringBootApplication
public class BookApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Book book1=new Book("think and grow rich", 300);
//		Book book2=new Book("rich dad poor dad", 200);
//		bookService.addBook(book1);
//		bookService.addBook(book2);
	}

}
