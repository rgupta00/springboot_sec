package com.empapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.empapp.entities.Employee;

@RequestMapping
@Controller
public class LoginController {

	@RequestMapping(value = "login")
	public String login() {
		return "loginpage";
	}
}
