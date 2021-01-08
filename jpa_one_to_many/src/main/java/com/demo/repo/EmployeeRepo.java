package com.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	@Query("SELECT e FROM Employee e WHERE e.eid IN (:eid)")
	public List<Employee> findEmployeessByIds(@Param("eid") List<Integer> eid);
}
