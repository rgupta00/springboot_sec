package com.storeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
@EnableCaching
public class StoreappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
	}

	@Bean
	public CacheManager cacheManager() {
		
		ConcurrentMapCacheManager cacheManager=new ConcurrentMapCacheManager("products");
		return cacheManager;
	}
}
