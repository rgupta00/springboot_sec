package com.bookapp;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

	@Bean
	public CacheManager getCacheManager() {
		ConcurrentMapCacheManager cacheManager=new ConcurrentMapCacheManager("books");
		return cacheManager;
	}
}
