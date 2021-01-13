package com.eventapp.service;

import java.time.LocalDate;
import java.util.EventObject;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventapp.dao.EventRepo;
import com.eventapp.dto.TicketBookingRequest;
import com.eventapp.dto.TicketBookingResponse;
import com.eventapp.dto.TicketCancelRequest;
import com.eventapp.dto.TicketCancelResponse;
import com.eventapp.entities.Event;
import com.eventapp.service.exceptions.ResourceNotFoundException;

@Service
@Transactional
public class EventServiceImpl implements EventService {

	private EventRepo eventRepo;

	@Autowired
	public EventServiceImpl(EventRepo eventRepo) {
		this.eventRepo = eventRepo;
	}

	@Override
	public List<Event> getAllEvents() {
		return eventRepo.findAll();
	}

	@Override
	public Event findByEventId(int eventId) {
		return eventRepo.findById(eventId)
				.orElseThrow(() -> new ResourceNotFoundException("event info with id " + eventId + " is not found"));
	}

	@Override
	public Event addEvent(Event event) {
		eventRepo.save(event);
		return event;
	}

	@Override
	public Event updateEvent(int eventId, Event event) {
		Event eventToUpdate = findByEventId(eventId);
		eventToUpdate.setEventTicketPrice(event.getEventTicketPrice());
		eventToUpdate.setDiscount(event.getDiscount());
		eventToUpdate.setNoOfTicket(event.getNoOfTicket());

		eventRepo.save(eventToUpdate);
		return eventToUpdate;
	}

	@Override
	public Event deleateEvent(int eventId) {
		Event eventToDelete = findByEventId(eventId);
		eventRepo.delete(eventToDelete);
		return eventToDelete;
	}

	@Override
	public List<Event> findByEventName(String eventName) {
		return eventRepo.findByEventName(eventName);
	}

	@Override
	public List<Event> findByEventDateBetween(LocalDate date1, LocalDate date2) {
		return eventRepo.findByEventDateBetween(date1, date2);
	}

	@Override
	public TicketBookingResponse bookTickets(TicketBookingRequest request) {
		TicketBookingResponse response = new TicketBookingResponse();
		Event eventToBook = findByEventId(request.getEventid());

		if (eventToBook == null) {
			throw new ResourceNotFoundException("event with id : " + request.getEventid() + " is not found");
		}

		if (request.getNoOfTicket() > eventToBook.getNoOfTicket()) {
			response.setMessage("no of ticket requested is more then what we can book");
			response.setAmountPayable(0.0);
		} else {
			eventToBook.setNoOfTicket(eventToBook.getNoOfTicket() - request.getNoOfTicket());
			this.updateEvent(eventToBook.getId(), eventToBook);
			
			response.setMessage("ticket book successfully");
			// 500*10*(100-10)/100
			double pricePayable = (eventToBook.getEventTicketPrice() * request.getNoOfTicket())
					* (100 - eventToBook.getDiscount()) / 100;

			response.setAmountPayable(pricePayable);
		}

		return response;
	}

	@Override
	public TicketCancelResponse cancelTickets(TicketCancelRequest request) {

		TicketCancelRequest response = new TicketCancelRequest();

		TicketCancelResponse cancelResponse = new TicketCancelResponse();

		Event eventTicketToCancel = findByEventId(request.getEventid());

		if (eventTicketToCancel == null) {
			throw new ResourceNotFoundException("event with id : " + request.getEventid() + " is not found");
		}

		LocalDate eventDate = eventTicketToCancel.getEventDate();
		// ie he is returning tickets of expired events

		if (eventDate.isBefore(LocalDate.now())) {
			cancelResponse.setMessage("event is alreay expired, we can not refund");
			cancelResponse.setAmountReturned(0.0);
		} else {
			eventTicketToCancel.setNoOfTicket(eventTicketToCancel.getNoOfTicket() + request.getNoOfTicket());

			updateEvent(eventTicketToCancel.getId(), eventTicketToCancel);
			// we are going to return 50% of booking amount
			
			double totalTicketAmount = (eventTicketToCancel.getEventTicketPrice() *
					eventTicketToCancel.getNoOfTicket())
					* (100 - eventTicketToCancel.getDiscount()) / 100;
			
			
			double amountReturned = 100;

			cancelResponse.setAmountReturned(amountReturned);
			cancelResponse.setMessage("tickets are cancelled");
		}
		return cancelResponse;

	}

}
