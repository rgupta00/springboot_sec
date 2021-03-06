package com.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"rank","location"})
public class DeptEmpResponse {
	private String dname;
	private String name;
	private double salary;
	//@JsonIgnore
	private int rank;
	//@JsonIgnore
	private String location;
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public DeptEmpResponse(String dname, String name, double salary) {
		this.dname = dname;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public DeptEmpResponse() {}
	
}
