package com.storeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storeapp.entities.Name1;
import com.storeapp.entities.Name2;

@RestController
@RequestMapping("api")
public class NameRestController {

	//simplest way to manage diff version of rest api
	@GetMapping("v1/name")
	public Name1 getNameV1() {
		return new Name1("rajeev gupta");
	}
	
	@GetMapping("v2/name")
	public Name2 getNameV2() {
		return new Name2("rajeev", "gupta");
	}
	
	//parameter versioning
	@GetMapping(value = "name/param",params = "version-1")
	public Name1 getNameParam1() {
		return new Name1("rajeev gupta");
	}
	
	@GetMapping(value="name/param",params = "version-2")
	public Name2 getNameParam2() {
		return new Name2("rajeev", "gupta");
	}
	
	//HEADER versioning
	@GetMapping(value = "name/header", headers = "X-API-VERSION=1")
	public Name1 getNameHeaderVersioning1() {
		return new Name1("rajeev gupta");
	}
	
	@GetMapping(value="name/header",headers = "X-API-VERSION=2")
	public Name2 getNameHeaderVersioning2() {
		return new Name2("rajeev", "gupta");
	}
	
	//PRODUCE versioning
	@GetMapping(value = "name/produce", produces  = "application/vnd.api-v1+json")
	public Name1 getNameProducedVersioning1() {
		return new Name1("rajeev gupta");
	}
	
	@GetMapping(value="name/produce", produces  = "application/vnd.api-v2+json")
	public Name2 getNameProducedVersioning2() {
		return new Name2("rajeev", "gupta");
	}
	
	
}








