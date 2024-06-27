package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.repo.EventReposotory;
import com.example.demo.entities.Event;

@Service
public class EventService {
	@Autowired
	private EventReposotory eventRepository;

	public Event createEvent(Event event) {
		return eventRepository.save(event);
	}

	public Event updateEvent(Event event) {
		return eventRepository.save(event);
	}

	public void deleteEvent(int eventId) {
		eventRepository.deleteById(eventId);
	}

	public Event getEventDetails(int eventId) {
		return eventRepository.findById(eventId).orElse(null);
	}

	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}

}
