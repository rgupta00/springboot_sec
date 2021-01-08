package com.storeapp;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.storeapp.entities.Product;
import com.storeapp.service.ProductService;
@Component
public class DBInitilizer implements CommandLineRunner {

	@Autowired
	private ProductService productService;
	
	@Override
	public void run(String... args) throws Exception {
	
//		LocalDate date1=LocalDate.of(2023, Month.APRIL, 20);
//		LocalDate date2=LocalDate.of(2022, Month.NOVEMBER, 20);
//		LocalDate date3=LocalDate.of(2025, Month.DECEMBER, 12);
//		
//		LocalDate date4=LocalDate.of(2021, Month.NOVEMBER, 14);
//		LocalDate date5=LocalDate.of(2024, Month.JULY, 20);
//		
//		
//
//		Product product1=new Product("laptop", 50000, 10, "electronics", date1,44);
//		Product product2=new Product("projector", 80000, 12, "electronics", date2,8);
//		Product product3=new Product("usb", 500, 20, "electronics", date3,5000);
//		Product product4=new Product("note books", 500, 30, "books", date4,780);
//		Product product5=new Product("school bag", 900, 25, "stationay", date5,500);
//		Product product6=new Product("pen", 5, 5, "stationay", date1,9000);
//		
//		productService.addProduct(product1);
//		productService.addProduct(product2);
//		
//		productService.addProduct(product3);
//		productService.addProduct(product4);
//		productService.addProduct(product5);
//		productService.addProduct(product6);
//		
		System.out.println("--------saved------");
		
		
		
		
	}

}










