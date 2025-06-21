package com.gentech.events.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gentech.events.dto.Eventsdto;
import com.gentech.events.entity.Events;
import com.gentech.events.mapper.EventsMapper;
import com.gentech.events.repository.eventrepository;
import com.gentech.events.service.EventsService;

@Service
public class serviceImpl  implements EventsService{
	@Autowired
	private eventrepository eventrep;
	@Override
	public Eventsdto createEvent(Eventsdto eventdto) {
	Events eves =EventsMapper.maptoEvents(eventdto);
	Events saveEvents=eventrep.save(eves);
	return  EventsMapper.maptoEventsdto(saveEvents);
	}

	@Override
	public Eventsdto getEvent(Long id) {
	Events eves=eventrep.findById(id).orElseThrow(()->
	new RuntimeException("The Events id"+id+"is not found in the database"));
			
		return EventsMapper.maptoEventsdto(eves);
	}

	@Override
	public List<Eventsdto> getAllEvents() {
		
		return eventrep.findAll()
				.stream().map((eves) -> EventsMapper.maptoEventsdto(eves))
				.collect(Collectors.toList());
	}

	@Override
	public Eventsdto updateEvents(Long id, Eventsdto event) {
		 Events existingEvent=eventrep.findById(id).orElseThrow(()->
		 new RuntimeException("The Events id"+id+"is not found in the database"));
		
		 existingEvent.setId(id);
		 existingEvent.setEventName(event.getEventName());
		 existingEvent.setEventDesc(event.getEventDesc());
		 existingEvent.setEventPhono(event.getEventPhono());
		 existingEvent.setEventType(event.getEventType());
		 
		 Events saveEvents=eventrep.save( existingEvent);
		 return EventsMapper.maptoEventsdto(saveEvents);
	}

	@Override
	public void deleteById(Long id) {
		eventrep.findById(id).orElseThrow(() ->
		 new RuntimeException("The Event Id "+id+" has not found in the database"));
		
		
	}

	@Override
	public List<Events> getAllEventsByEventName(String eventName) {

		return eventrep.findByEventName(eventName);
	}

	@Override
	public List<Events> getAllByEventType(String eventType) {
		
		return eventrep.findByEventType(eventType);
	}

	@Override
	public List<Events>getAllEventByNameAndType(String eventName, String eventType) {
		
		return eventrep.findByEventNameAndEventType(eventName, eventType);
	}

	@Override
	public List<Events> getAllPartialEventName(String eventName) {
		
		return eventrep.findByEventNameContaining(eventName);
	}

	@Override
	public List<Events> getEvents(int pageNumber, int pageSize) {
		Pageable page=PageRequest.of(pageNumber, pageSize);
		return eventrep.findAll(page).getContent();
	}

	@Override
	public List<Events> getEvents(int pageNumber, int pageSize, String columnName) {
		Sort sort=Sort.by(Direction.ASC, columnName);
	Pageable pages=PageRequest.of(pageNumber, pageSize, sort);
	
	
		return eventrep.findAll(pages).getContent();
	}

	@Override
	public List<Events> getAllEventsByNameOrType(String eventype, String eventName) {
		
		return eventrep.getAllEventsByTypeAndName(eventype, eventName);
	}

	@Override
	public Integer deleteAllEventsByEventType(String eventtype) 
	{
		
		return eventrep.DeleteEventsByEventType(eventtype);
	}

	@Override
	public Integer updateEventPhoneByEventName(Long phone, String eventName) {
	
		return eventrep.UpdateEventPhoneNumByEventName(phone, eventName);
	}

	@Override
	public Integer updateEventphoneAndDescByEventName(Long phone, String eventdesc, String eventname)
	{
	
		return eventrep.updateEventsPhoneNumAndEventDescByEventName(phone, eventdesc, eventname);
	}
	
	
}
