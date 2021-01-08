package com.storeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.storeapp.service.ProductService;

@Controller
public class ProductController {

	private ProductService productService;
	
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("products")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("allproducts");
		mv.addObject("products",productService.getAllProduct());
		return mv;
	}
}
