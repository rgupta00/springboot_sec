package com.demo;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Employee;
import com.demo.entities.Parking;
import com.demo.repo.EmployeeRepo;
import com.demo.repo.ParkingRepo;

@SpringBootApplication
public class JpaDemo2Application implements CommandLineRunner{

	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private ParkingRepo parkingRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * List<Employee>employees=empRepo.findAll();
		 * employees.forEach(e->System.out.println(e));
		 */
		
		Employee employee=empRepo.findById(2).orElseThrow(RuntimeException::new);
		
		empRepo.delete(employee);
		
		
//		Parking parking1=new Parking("A34");
//		Parking parking2=new Parking("Mw6");
//		Parking parking3=new Parking("F40");
//		
//		
//		Employee emp1=new Employee("ekta", 4000.00, parking1);
//		Employee emp2=new Employee("keshav", 7000.00, parking2);
//		Employee emp3=new Employee("gunika", 3400.00, parking3);
//		
//		parking1.setEmployee(emp1);
//		parking2.setEmployee(emp2);
//		parking3.setEmployee(emp3);
//		
//		empRepo.save(emp1);
//		empRepo.save(emp2);
//		empRepo.save(emp3);
//		
//		parkingRepo.save(parking1);
//		parkingRepo.save(parking2);
//		parkingRepo.save(parking3);
//		
		
		
		
		
		
	}

}






