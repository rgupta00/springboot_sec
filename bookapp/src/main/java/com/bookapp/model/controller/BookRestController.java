package com.bookapp.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

//ResponseEntity is a wrapper that can hold data (processing result ) + status code

@RestController 
public class BookRestController {

	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping(path="book" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getBook() {
		List<Book> books=bookService.getAllBooks();
		//return new ResponseEntity<>(books, HttpStatus.OK);
		return ResponseEntity.ok(books);
	}
	
	
	@GetMapping(path="book/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getAnBook(@PathVariable(name = "id") int bookId) {
		Book book=bookService.getBookById(bookId);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	
	//add
	
	@PostMapping(path="book" , 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> addAnBook(@RequestBody Book book) {
		Book addedBook=bookService.addBook(book);
		return new ResponseEntity<Book>(addedBook, HttpStatus.CREATED);
	}
	
	//update
	
	@PutMapping(path="book/{id}" , 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> updateAnBook(@PathVariable(name = "id") int bookId,  @RequestBody Book book) {
		Book updatedBook=bookService.updateBook(bookId, book);
		return new ResponseEntity<Book>(updatedBook, HttpStatus.CREATED);//?
	}
	
	
	//delete
	@DeleteMapping(path="book/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteAnBook(@PathVariable(name = "id") int bookId) {
		Book deletedBook=bookService.deleteBook(bookId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}












