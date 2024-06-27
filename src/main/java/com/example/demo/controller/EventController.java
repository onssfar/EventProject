package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Event;
import com.example.demo.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	  @Autowired
	    private EventService eventService;

	    @PostMapping
	    public Event createEvent(@RequestBody Event event) {
	        return eventService.createEvent(event);
	    }

	    @PutMapping("/{id}")
	    public Event updateEvent(@PathVariable int id, @RequestBody Event event) {
	        event.setEventId(id);
	        return eventService.updateEvent(event);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteEvent(@PathVariable int id) {
	        eventService.deleteEvent(id);
	    }

	    @GetMapping("/{id}")
	    public Event getEventDetails(@PathVariable int id) {
	        return eventService.getEventDetails(id);
	    }

	    @GetMapping
	    public List<Event> getAllEvents() {
	        return eventService.getAllEvents();
	    }

}
