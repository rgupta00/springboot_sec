package com.storeapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledJob {
	private Logger logger =LoggerFactory.getLogger(ScheduledJob.class);
	
	@Autowired
	private ProductService productService;
	
	//whenever u are defining a method for scheduling i must not return anything . not take any parmaeter
	@Scheduled(cron = "0,20 * * * * *")
	public void doSchdulingAfterEach30Sec() {
		logger.info("doSchdulingAfterEach30Sec is called");
		logger.info("no of products in db:"+productService.getAllProduct().size());
		productService.evictCache();
	}

}
