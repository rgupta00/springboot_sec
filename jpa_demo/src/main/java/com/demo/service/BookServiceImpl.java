package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.Book;
import com.demo.repo.BookRepo;
@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public List<Book> getAllBooksPagable(Pageable pageable) {
		
		return bookRepo.findAll(pageable).getContent();// getContect() method convert page -> List
	}

}




