package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Employee;
import com.demo.entities.Parking;
@Repository
public interface ParkingRepo extends JpaRepository<Parking, Integer>{

}
