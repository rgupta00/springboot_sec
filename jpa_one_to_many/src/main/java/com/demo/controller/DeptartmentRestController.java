package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.demo.entities.Department;
import com.demo.excceptions.ResourceNotFoundException;
import com.demo.repo.DepartmentRepo;

@RestController
public class DeptartmentRestController {

	private DepartmentRepo deptRepo;

	@Autowired
	public DeptartmentRestController(DepartmentRepo deptRepo) {
		this.deptRepo = deptRepo;
	}
	
	@GetMapping(path = "department", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Department> getAllDepartments(){
		List<Department> departments=deptRepo.findAll();
		return departments;
	}
	
	
	@GetMapping(path = "department/{did}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Department getAnDepartment(@PathVariable(name="did") int did){
		 Department department=deptRepo.findById(did).orElseThrow(ResourceNotFoundException::new);
		return department;
	}
}
