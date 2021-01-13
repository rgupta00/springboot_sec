package com.eventapp.service;
import java.time.LocalDate;
import java.util.*;

import com.eventapp.dto.TicketBookingRequest;
import com.eventapp.dto.TicketBookingResponse;
import com.eventapp.dto.TicketCancelRequest;
import com.eventapp.dto.TicketCancelResponse;
import com.eventapp.entities.Event;

public interface EventService {
	public List<Event> getAllEvents();
	public Event findByEventId(int eventId);
	public Event addEvent(Event event);
	public Event updateEvent(int eventId, Event event);
	public Event deleateEvent(int eventId);
	public List<Event> findByEventName(String eventName);
	
	public TicketBookingResponse bookTickets(TicketBookingRequest request);
	public TicketCancelResponse cancelTickets(TicketCancelRequest request);
	
	public List<Event> findByEventDateBetween(LocalDate date1, LocalDate date2);
}
