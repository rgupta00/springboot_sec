package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.repo.DepartmentRepo;
import com.demo.repo.EmployeeRepo;
@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo empRepo;

	@Autowired
	private DepartmentRepo deptRepo;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("-------------------------------");
		// TODO Auto-generated method stub

//		Department d1=new Department("fin");
//		Department d2=new Department("IT");
//		Department d3=new Department("sales");
//		
//		Employee emp1=new Employee("ravi", 6000.00, d1);
//		Employee emp2=new Employee("ekta", 4000.00, d1);
//		
//		Employee emp3=new Employee("keshav", 7000.00, d2);
//		Employee emp4=new Employee("gunika", 3400.00, d2);
//		
//		Employee emp5=new Employee("raj", 7800.00, d3);
//		
//		//dept 1 have 1,2 emps
//		d1.getEmployees().add(emp1);
//		d1.getEmployees().add(emp2);
//		
//		
//		d2.getEmployees().add(emp3);
//		d2.getEmployees().add(emp4);
//		
//		d3.getEmployees().add(emp5);
//		
//		deptRepo.save(d1);
//		deptRepo.save(d2);
//		deptRepo.save(d3);
//		
//		empRepo.save(emp1);
//		empRepo.save(emp2);
//		empRepo.save(emp3);
//		empRepo.save(emp4);
//		empRepo.save(emp5);

	}

}
