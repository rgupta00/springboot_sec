package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.dao.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public Book addBook(Book book);
	public List<Book> getBookByTitle(String title);
	public Book updateBook(int bookId, Book book);
	public Book deleteBook(int bookId);
	public List<Book> getAllBooksByExample(Book book);
}
