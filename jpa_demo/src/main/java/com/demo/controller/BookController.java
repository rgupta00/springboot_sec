package com.demo.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Book;
import com.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public List<Book> getAllBooks(Pageable pageable){
		return bookService.getAllBooksPagable(pageable);
	}
}









