package com.bookapp.dao;
import java.util.*;
//crud
public interface BookDao {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
}
