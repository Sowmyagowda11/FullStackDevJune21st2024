package com.gentech.events.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.events.dto.Eventsdto;
import com.gentech.events.entity.Events;
import com.gentech.events.service.EventsService;

@RestController
@RequestMapping("/v1/api")
public class EventController {
	
	@Autowired
	private EventsService eventservice;
	
	@PostMapping("/event")
	public ResponseEntity<Eventsdto> CreateEvents(@RequestBody Eventsdto eventdto)
	{
		return new ResponseEntity<Eventsdto>(eventservice.createEvent(eventdto), HttpStatusCode.valueOf(201));	
	}
	

	@GetMapping("/event/{id}")
	public ResponseEntity<Eventsdto> getSpecificevents(@PathVariable Long id)
	{
		return new ResponseEntity<Eventsdto>(eventservice.getEvent(id), HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/event")
	public ResponseEntity<List<Eventsdto>> getevents()
	{
		return new ResponseEntity<List<Eventsdto>>(eventservice.getAllEvents(), HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/event/{id}")
	public ResponseEntity<Eventsdto> modifySpecificEvent(@PathVariable Long id,
			@RequestBody Eventsdto eventdto)
	{
		return new ResponseEntity<Eventsdto>(eventservice.updateEvents(id, eventdto), HttpStatusCode.valueOf(200));
	}

	@DeleteMapping("/event/{id}")
	public ResponseEntity<String> deleteSpecificEvent(@PathVariable Long id)
	{
		eventservice.deleteById(id);
		return new ResponseEntity<String>("The event id "+id+" has deleted from the database table successfully",HttpStatusCode.valueOf(200));
	}
	

	// http://localhost:9092/v1/api/event/filterbyname?name=Marriage
	@GetMapping("/event/filterbyeventName")
	public ResponseEntity<List<Events>> getAllEventsByName(@RequestParam String eventName)
	{
		return new ResponseEntity<List<Events>>(eventservice.getAllEventsByEventName(eventName), HttpStatusCode.valueOf(200));
	}

	// http://localhost:9092/v1/api/events/filterbytype?type=Grand
	@GetMapping("/event/filterbyeventtype")
	public ResponseEntity<List<Events>> getAllEventsByType(@RequestParam String eventType)
	{
		return new ResponseEntity<List<Events>>(eventservice.getAllByEventType(eventType), HttpStatusCode.valueOf(200));
	}
	
	// http://localhost:9092/v1/api/event/filterbynameandloc?name=Marriage&loc=Grand
	@GetMapping("/event/filterbynameandtype")
	public ResponseEntity<List<Events>> getAllEventsByNameAndType(String eventName,String eventType)
	{
		return new ResponseEntity<List<Events>>(eventservice.getAllEventByNameAndType(eventName, eventType), HttpStatus.OK);
	}
	
	@GetMapping("/event/filterbypartial")
	public ResponseEntity<List<Events>> getAllPartialEvents(String eventName)
	{
		return new ResponseEntity<List<Events>>(eventservice.getAllPartialEventName(eventName),HttpStatus.OK);
		
	}
	
	@GetMapping("/event/filterbypagination")
	public ResponseEntity<List<Events>> getAllEventsByPagination(@RequestParam int pageNumber, 
			@RequestParam int pageSize)
	{
		return new ResponseEntity<List<Events>>(eventservice.getEvents(pageNumber, pageSize),HttpStatus.OK);
	}
	
	@GetMapping("/event/filterbypagingandsorting")
	public ResponseEntity<List<Events>> getAllEventsByPagingAndSorting(@RequestParam int pageNumber, 
			@RequestParam int pageSize,@RequestParam String columnName)
	{
		return new ResponseEntity<List<Events>>(eventservice.getEvents(pageNumber, pageSize,columnName),HttpStatus.OK);
	}
	@GetMapping("/event/filterbytypeorname")
	public ResponseEntity<List<Events>> getAllEventsByNameOrType(@RequestParam String eventype,@RequestParam String eventName)
	{
		return new ResponseEntity<List<Events>>(eventservice.getAllEventsByNameOrType(eventype, eventName),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/event/filterbytype")
	public ResponseEntity<String> deleteAllEventsByType(@RequestParam String eventtype)
	{
		Integer count=eventservice.deleteAllEventsByEventType(eventtype);
		return new ResponseEntity<String>(count+" Event records have deleted successfully", HttpStatus.OK);
	}
	
	@PutMapping("/event/updatebyname")
	public ResponseEntity<String> updateEventPhoneByName(@RequestParam Long phone,@RequestParam String eventname)
	{
		Integer count=eventservice.updateEventPhoneByEventName(phone,eventname);
		return new ResponseEntity<String>(count+" events record has updated successfully", HttpStatus.OK);
	}
	
	@PutMapping("/event/updatemultiple")
	public ResponseEntity<String> updateEventsPhoneAndDescByName(@RequestParam Long phone,@RequestParam String eventdesc,@RequestParam String eventname)
	{
		Integer count=eventservice.updateEventphoneAndDescByEventName(phone, eventdesc, eventname);
		return new ResponseEntity<String>(count+"events record has update successfully",HttpStatus.OK);
	}
	
}
