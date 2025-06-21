package com.gentech.events.mapper;

import com.gentech.events.dto.Eventsdto;
import com.gentech.events.entity.Events;

public class EventsMapper {
	
	public static Events maptoEvents(Eventsdto eventdto)
	{
		Events events=new Events(
			eventdto.getId(),
			eventdto.getEventName(),
			eventdto.getEventType(),
			eventdto.getEventPhono(),
			eventdto.getEventDesc(),
			eventdto.getCreatedAt(),
			eventdto.getUpdatedAt());
			return events;
	}
	public static Eventsdto maptoEventsdto(Events events)
	
	{
		Eventsdto event=new Eventsdto(
				events.getId(),
				events.getEventName(),
				events.getEventType(),
				events.getEventPhono(),
				events.getEventDesc(),
				events.getCreatedAt(),
				events.getUpdatedAt());
		return event;
		
	}
	

}
