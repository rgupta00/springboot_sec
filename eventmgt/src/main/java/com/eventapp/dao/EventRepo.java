package com.eventapp.dao;
import java.time.LocalDate;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventapp.entities.Event;
@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {
	public List<Event> findByEventName(String eventName);
	public List<Event> findByEventDateBetween(LocalDate date1, LocalDate date2);
	
}
