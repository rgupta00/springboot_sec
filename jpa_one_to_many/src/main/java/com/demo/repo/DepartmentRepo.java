package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.dto.DeptEmpResponse;
import com.demo.entities.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{
	@Query("SELECT new com.demo.dto.DeptEmpResponse(d.dname, e.name, e.salary) FROM Department d INNER JOIN d.employees e")
	List<DeptEmpResponse> deptEmployeeInformation();
}
