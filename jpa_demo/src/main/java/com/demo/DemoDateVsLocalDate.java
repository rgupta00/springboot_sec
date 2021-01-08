package com.demo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DemoDateVsLocalDate {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date=LocalDate.parse("12/12/2011", formatter);
		System.out.println(date);
	}
}
