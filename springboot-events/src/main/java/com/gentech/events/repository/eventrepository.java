package com.gentech.events.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.gentech.events.entity.Events;

import jakarta.transaction.Transactional;

public interface eventrepository  extends JpaRepository<Events,Long>,PagingAndSortingRepository<Events,Long>
{
	List<Events> findByEventName(String eventName);

	List<Events> findByEventType(String eventType);

	List<Events> findByEventNameAndEventType(String eventName, String eventType);
	
	List<Events> findByEventNameContaining(String partialEventName);
	
	@Query("FROM Events where eventType=:eventype OR eventName=:eventName")
	List<Events> getAllEventsByTypeAndName(@Param("eventype")String eventtype,String eventName);
	
	@Transactional
	@Modifying
	@Query("DELETE From Events WHERE eventType=:eventtype ")
	Integer DeleteEventsByEventType(String eventtype);
	
	@Transactional
	@Modifying
	@Query("UPDATE Events e set e.eventPhono=:phone WHERE eventName=:eventname ")
	Integer UpdateEventPhoneNumByEventName(Long phone,String eventname);
 
	@Transactional
	@Modifying
	@Query("UPDATE Events e set e.eventPhono=:phone,e.eventDesc=:eventdesc WHERE e.eventName=:eventname")
	Integer updateEventsPhoneNumAndEventDescByEventName(Long phone,String eventdesc,String eventname);

}
