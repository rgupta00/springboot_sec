package com.bookapp.model.controller;

import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

@RestController
@RequestMapping("api")
public class BookRestController {

	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}

	// get all the books
	@GetMapping(path = "book", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = bookService.getAllBooks();
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}

	
	@GetMapping(path = "byexample", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooksByExample(@RequestBody Book book) {
		List<Book> books = bookService.getAllBooksByExample(book);
		return books;
	}
	// find a book by id
	@GetMapping(path = "book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getBookById(@PathVariable(name ="id") int id) {
		Book book=bookService.getBookById(id);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	// find book by title
	@GetMapping(path = "book/title/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getBookByTitle(@PathVariable(name ="title") String title) {
		List<Book> books=bookService.getBookByTitle(title);
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}
	
	// add
	@PostMapping(path = "book", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> addAnBook(@Valid @RequestBody Book book) {
		Book bookAdded=bookService.addBook(book);
		return new ResponseEntity<Book>(bookAdded, HttpStatus.CREATED);
	}
	
	// update
	@PutMapping(path = "book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> updateAnBook(@PathVariable(name ="id") int id, @RequestBody Book book) {
		Book bookUpdated=bookService.updateBook(id, book);
		return new ResponseEntity<Book>(bookUpdated, HttpStatus.OK);
	}
	// delete

	@DeleteMapping(path = "book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteBook(@PathVariable(name ="id") int id) {
		Book deletedBook=bookService.deleteBook(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}





