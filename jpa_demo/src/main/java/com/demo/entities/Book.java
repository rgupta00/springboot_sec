package com.demo.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "book_table2")
@NamedQueries(
		{
			@NamedQuery(name="Book.queryOne",query = "select b from Book b"),
			
		}
)
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	private String title;
	
	private LocalDate pubDate;
	private int pageCount;
	
	private double price;
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	public LocalDate getPubDate() {
		return pubDate;
	}
	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	public Book(String title, LocalDate pubDate, int pageCount, double price) {
		super();
		this.title = title;
		this.pubDate = pubDate;
		this.pageCount = pageCount;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", pubDate=" + pubDate + ", pageCount=" + pageCount
				+ ", price=" + price + "]";
	}
	
	
}
