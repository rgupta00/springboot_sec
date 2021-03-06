package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.entities.Department;
import com.demo.entities.Employee;
import com.demo.repo.DepartmentRepo;
import com.demo.repo.EmployeeRepo;

@SpringBootApplication
public class JpaDemo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JpaDemo2Application.class, args);
		/*
		 * String beansNames[] = ctx.getBeanDefinitionNames(); for (String beanName :
		 * beansNames) { System.out.println(beanName); }
		 */
	}

}
