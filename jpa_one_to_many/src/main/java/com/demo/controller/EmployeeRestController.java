package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.DeptEmpResponse;
import com.demo.dto.EmployeeRequest;
import com.demo.entities.Employee;
import com.demo.repo.DepartmentRepo;
import com.demo.repo.EmployeeRepo;

@RestController
public class EmployeeRestController {

	@Autowired
	private DepartmentRepo deptRepo;

	@Autowired
	private EmployeeRepo empRepo;

	@GetMapping(path = "employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmp() {
		List<Employee>employees=empRepo.findAll();
		return employees;
	}

	@GetMapping(path = "selectedemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getSelectedEmp(@RequestBody EmployeeRequest employeeRequest) {
		List<Employee>employees=empRepo.findEmployeessByIds(employeeRequest.getIds());
		return employees;
	}
	
	@GetMapping(path = "empinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DeptEmpResponse> getAllEmployeesWithDeptName() {
		List<DeptEmpResponse> empsWithDeptNames = deptRepo.deptEmployeeInformation();
		return empsWithDeptNames;
	}

}
