package com.eventapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventapp.dto.TicketBookingRequest;
import com.eventapp.dto.TicketBookingResponse;
import com.eventapp.dto.TicketCancelRequest;
import com.eventapp.dto.TicketCancelResponse;
import com.eventapp.service.EventService;

@RestController
@RequestMapping("operation")
public class EventBookingController {

	private EventService eventService;

	@Autowired
	public EventBookingController(EventService eventService) {
		this.eventService = eventService;
	}

	@PostMapping(path = "booking", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TicketBookingResponse bookingEventTicketBooking(@RequestBody TicketBookingRequest eventRequest) {
		return eventService.bookTickets(eventRequest);
	}

	@PostMapping(path = "cancel", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TicketCancelResponse cancelEventTicketBooking(@RequestBody TicketCancelRequest cancelRequest) {
		return eventService.cancelTickets(cancelRequest);
	}
}
