package com.bookapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("home")
	public String home() {
		return "hello world spring sec--home";
	}
	
	@GetMapping("admin")
	public String admin() {
		return "hello world spring admin";
	}
	
	
	@GetMapping("mgr")
	public String mgr() {
		return "hello world spring sec--mgr";
	}
	
	
	@GetMapping("emp")
	public String emp() {
		return "hello world spring sec--emp";
	}
}
