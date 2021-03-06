package com.bookapp.model.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookRepo;
import com.bookapp.model.service.exceptions.BookNotFoundException;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private BookRepo bookRepo;

	@Autowired
	public BookServiceImpl(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepo.findAll();
	}

	@Cacheable(value = "books", key = "#id")
	@Override
	public Book getBookById(int id) {
		System.out.println("------public Book getBookById(int id) is called------");
		Optional<Book> optBook = bookRepo.findById(id);
		return optBook.orElseThrow(() -> new BookNotFoundException("book with id:" + id + " is not found"));
	}

	@CachePut(value = "books", key="#result.id")
	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return bookRepo.findByTitle(title);
	}

	@CachePut(value = "books", key="#result.id")
	@Override
	public Book updateBook(int bookId, Book book) {
		Book bookToBeUpdated = getBookById(bookId);
		bookToBeUpdated.setPrice(book.getPrice());
		bookRepo.save(bookToBeUpdated);
		return bookToBeUpdated;
	}

	@CacheEvict(value ="books", key = "#id")
	@Override
	public Book deleteBook(int bookId) {
		Book bookToBeDelted = getBookById(bookId);
		bookRepo.delete(bookToBeDelted);
		return bookToBeDelted;
	}

	@Override
	public List<Book> getAllBooksByExample(Book book) {
		// {"title":"java basics"}
		// pass prob to example
		ExampleMatcher exampleMatcher=ExampleMatcher.matchingAny().withIgnoreCase()
				.withMatcher("title",GenericPropertyMatcher.of(StringMatcher.CONTAINING));
		Example<Book> e = Example.of(book, exampleMatcher);

		return bookRepo.findAll(e);
	}

	@CacheEvict(value = "books", allEntries = true)
	@Override
	public void cleanCache() {
		//somehow u need to call this method periodically... 
		System.out.println("cache is cleaned....");
	}

}







