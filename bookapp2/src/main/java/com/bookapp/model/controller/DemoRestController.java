package com.bookapp.model.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.dao.DemoBean;

@RestController
public class DemoRestController {

	@GetMapping("/hello")
	public DemoBean hello() {
		return new DemoBean("data1", "data2", "data3");
	}
}
