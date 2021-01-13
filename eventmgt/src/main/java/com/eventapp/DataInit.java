package com.eventapp;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.eventapp.dao.UserRepo;
import com.eventapp.entities.Event;
import com.eventapp.entities.User;
import com.eventapp.service.EventService;
import com.eventapp.service.UserService;

import ch.qos.logback.core.pattern.color.BoldCyanCompositeConverter;
@Component
public class DataInit implements CommandLineRunner{

	@Autowired
	private EventService eventService;
	
	@Autowired
	private UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
		User user=new User("raj", encoder.encode("raj123"), "ROLE_ADMIN");
		User user2=new User("ekta", encoder.encode("ekta123"), "ROLE_CLERK");
		
		userService.addUser(user);
		userService.addUser(user2);
		
//		Event e1=new Event("bharatnatyam dance dhamaka", 
//				"chennai", 500.00, 10, 50, LocalDate.of(2020, Month.DECEMBER, 31));
		//eventService.addEvent(e1);
//		
//		Event e2=new Event("khachapuri dance", 
//				"banglore", 600.00, 5, 60, LocalDate.of(2021, Month.FEBRUARY, 11));
//		
//		Event e3=new Event("bhangra dance", 
//				"punjab", 400.00, 10, 100, LocalDate.of(2021, Month.FEBRUARY, 23));
//		
//		Event e4=new Event("java basics", 
//				"delhi", 100.00, 5, 500, LocalDate.of(2021, Month.FEBRUARY, 19));
//		
//		Event e5=new Event("corporate 101", 
//				"delhi", 200.00, 10, 100, LocalDate.of(2021, Month.FEBRUARY, 1));
//		
//		Event e6=new Event("south indian food cooking", 
//				"delhi", 500.00, 10, 500, LocalDate.of(2021, Month.FEBRUARY, 15));
//		
//		Event e7=new Event("north food cooking", 
//				"chennai", 500.00, 10, 500, LocalDate.of(2021, Month.FEBRUARY, 14));
//		
//		Event e8=new Event("classical singing event", 
//				"chennai", 300.00, 10, 100, LocalDate.of(2021, Month.FEBRUARY, 9));
//		
//		Event e9=new Event("western dance", 
//				"banglore", 500.00, 10, 100, LocalDate.of(2021, Month.FEBRUARY, 13));
//		
//		Event e10=new Event("pet training", 
//				"chennai", 500.00, 10, 100, LocalDate.of(2021, Month.FEBRUARY, 21));
//		
//		eventService.addEvent(e1);
//		eventService.addEvent(e2);
//		eventService.addEvent(e3);
//		eventService.addEvent(e4);
//		eventService.addEvent(e5);
//		eventService.addEvent(e6);
//		eventService.addEvent(e7);
//		eventService.addEvent(e8);
//		eventService.addEvent(e9);
//		eventService.addEvent(e10);
//	
		
	}
}








