package com.gentech.events.service;

import java.util.List;



import com.gentech.events.dto.Eventsdto;
import com.gentech.events.entity.Events;


public interface EventsService  {
	
	Eventsdto createEvent(Eventsdto event);
	
	Eventsdto getEvent(Long id);
	
	List<Eventsdto> getAllEvents();
	
	Eventsdto updateEvents(Long id,Eventsdto event);
	
	void deleteById(Long id);
	
	List<Events> getAllEventsByEventName(String eventName);
	
	List<Events> getAllByEventType(String eventType);
	
	List<Events> getAllEventByNameAndType(String eventName, String eventType);
	
	List<Events> getAllPartialEventName(String eventName);
	
	List<Events> getEvents(int pageNumber,int pageSize);
	
	List<Events> getEvents(int pageNumber,int pageSize,String columnName);
	
	List<Events> getAllEventsByNameOrType(String eventype,String eventName);
	
	Integer deleteAllEventsByEventType(String eventtype);

	Integer updateEventPhoneByEventName(Long phone,String eventName);
	
	Integer updateEventphoneAndDescByEventName(Long phone,String eventdesc,String eventname);
}
