package com.bookapp.model.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.dao.Name;

@RestController
public class HelloVersioning {
	

	 @GetMapping(value = "/person/produces", headers = "X-API-VERSION=1")
	  public String headerV1() {
	    return  "raj gupta";
	  }

	 @GetMapping(value = "/person/produces", headers = "X-API-VERSION=2")
	  public Name headerV2() {
	    return new Name("raj", "gupta") ;
	  }

	 
	 
//	
//	 @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
//	  public String headerV1() {
//	    return  "raj gupta";
//	  }
//
//	 @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
//	  public Name headerV2() {
//	    return new Name("raj", "gupta") ;
//	  }

//	 @GetMapping(path = "/person/param", params = "version=1")
//	public String getName() {
//		return "rajeev gupta";
//	}
//	
//	 @GetMapping(path = "/person/param", params = "version=2")
//	public Name getNameByObject() {
//		return new Name("rajeev", "gupta");
//	}
}
