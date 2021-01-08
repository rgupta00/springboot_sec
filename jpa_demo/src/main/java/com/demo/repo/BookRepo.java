package com.demo.repo;
import java.time.LocalDate;
import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
	//quary buidler will create a quary ...
	
	
	@Query(value="select * from book_table2", nativeQuery = true)
	public List<Book> allBooksByNative();
	
	public List<Book> queryOne();
	
	@Query("select b from Book b")
	public List<Book> allBooks();
	
	@Query("select b from Book b where b.pageCount > ?1")
	public List<Book> q2(int pageCount);
	
	
	//@Query("Select c from Registration c where c.place like %:place%").
	@Query("select b from Book b where b.title like %:title%")
	public List<Book> q3(@Param(value = "title")String title);
	
	
	public Book findByTitle(String title);
	public List<Book> findByTitleContaining(String title);
	
	public List<Book> findByPageCountGreaterThan(int count);
	
	//pubDate
	
	public List<Book> findByPubDateAfter(LocalDate date);

}
