package com.bookapp.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class BookDaoHibernate implements BookDao{

	private EntityManager em;
	
	@Autowired
	public BookDaoHibernate(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Book> getAllBooks() {
		return em.createQuery("select b from Book b").getResultList();
	}

	@Override
	public Book addBook(Book book) {
		 em.persist(book);
		 return book;
	}

}
