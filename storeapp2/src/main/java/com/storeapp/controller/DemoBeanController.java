package com.storeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storeapp.entities.DemoBean;

@RestController
public class DemoBeanController {

	@GetMapping("hello")
	public DemoBean getDemoBean() {
		return new DemoBean("raj", "gupta", "pass1234");
	}
}
