package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.dao.Book;
import com.bookapp.dao.BookDao;
//me 
@Service
@Transactional
public class BookServiceImpl implements BookService {
	
	private BookDao dao;
	//hey spring pl find suitable imp of dao and inject here ... "push" model
	@Autowired
	public BookServiceImpl(BookDao dao) {
		this.dao=dao;
	}
	
	@Override
	public List<Book> getAllBooks() {
		//
		return dao.getAllBooks();
	}

	@Override
	public Book addBook(Book book) {
		//
		return dao.addBook(book);
	}

}
