package com.bookapp.model.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
	private static Logger logger = LoggerFactory.getLogger(CacheService.class);

	@Autowired
	private BookService bookService;

	@Scheduled(cron = "0,30 * * * * *")
	public void cronJob() {
		logger.info("---------------started cronJob-------------");
		logger.info("no of books" + bookService.getAllBooks().size());
	}

	// after application startup delay of 5 sec, schedule to run each after 15
	// sec.
	@Scheduled(initialDelay = 5000, fixedRate = 20000)
	public void fixedRateJob() {
		logger.info("--------clean the cache---------");
		bookService.cleanCache();
	}
}
