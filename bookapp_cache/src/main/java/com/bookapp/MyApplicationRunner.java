package com.bookapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(value = 3)
@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String[] sourceArgs = args.getSourceArgs();
		//from application arguments we can also get command line arguments
		System.out.println("ApplicationRunner is running..");
	}
}
