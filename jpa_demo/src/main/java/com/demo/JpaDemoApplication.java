package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.demo.entities.Book;
import com.demo.repo.BookRepo;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	private BookRepo bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//get all rec
		
//		List<Book> books=bookRepo.findAll();
//		books.forEach(book-> System.out.println(book));
		
		
		//get a specific book
//		long id=20;
//		Book book=bookRepo.findById(id).orElseThrow(()-> new DataNotFoundException("book with id="+id+" not found"));
//		System.out.println(book);
//		
		
	//find the book by title
		
//		Book book=bookRepo.findByTitle("java spring basics");
//		System.out.println(book);
		
		
	//findByTitleContaining
		
//		List<Book>books=bookRepo.findByTitleContaining("basics");
//		books.forEach(book-> System.out.println(book));
		
		
		//findByPageCountGreaterThen
		
//		List<Book> books=bookRepo.findByPageCountGreaterThan(409);
//		books.forEach(book-> System.out.println(book));
//		
//		
		//printing all books after a particaular date
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate d1=LocalDate.parse("12/12/2019", formatter);
//		
//		List<Book> books=bookRepo.findByPubDateAfter(d1);
//		books.forEach(book-> System.out.println(book));
		
			
		// find all book by JPQL	
//		List<Book>books=bookRepo.allBooks();
//		books.forEach(b-> System.out.println(b));
		
		
		//public List<Book> q2(int pageCount);
		
//		List<Book> books=bookRepo.queryOne();
//		
//		books.forEach(b-> System.out.println(b));
//		
		
		//Demo on pagination and sorting
		
//		Sort sort=Sort.by(Sort.Direction.DESC,"pageCount") ;
//		
//		List<Book> books=bookRepo.findAll(sort);
//		
//		books.forEach(b-> System.out.println(b));
//		
		
	
		
//		Pageable pageable=PageRequest.of(0, 2);
//
//		Page<Book> books=bookRepo.findAll(pageable);
//		
//		books.forEach(b-> System.out.println(b));
//		
		
		
		//allBooksByNative : calling native quaries
		
		List<Book> books=bookRepo.allBooksByNative();
		books.forEach(b-> System.out.println(b));
		
		
//		SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");
//		Date d1=fmt.parse("11/11/2011");
//		Date d2=fmt.parse("1/11/2019");
//		Date d3=fmt.parse("21/9/2014");
//		
//		Book book1=new Book("java basics", d1, 500, 400.50);
//		Book book2=new Book("spring basics", d2, 410, 590.50);
//		Book book3=new Book("servlet adv", d3, 589, 400.50);
//		
//		List<Book> books=Arrays.asList(book1, book2, book3);
//		bookRepo.saveAll(books);
		
	}

}
