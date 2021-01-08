package com.bookapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	@Override
	public Book addBook(Book book) {
		return bookDao.addBook(book);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return bookDao.getBookByTitle(title);
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		return bookDao.updateBook(bookId, book);
	}

	@Override
	public Book deleteBook(int bookId) {
		return bookDao.deleteBook(bookId);
	}

}
