package com.bookapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(value = 2)
@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		for(String arg: args) {
			System.out.println(arg);
		}
		//System.out.println("MyCommandLineRunner is runnning");
		/*
		 * Book book1=new Book("java basics", "raj", 500.00, "bpb", new Date()); Book
		 * book3=new Book("java basics", "amit", 400.00, "wrox", new Date()); Book
		 * book2=new Book("pysics basics", "gunika", 560.00, "abc", new Date());
		 * 
		 * bookService.addBook(book1); bookService.addBook(book2);
		 * bookService.addBook(book3);
		 */
	}

}
