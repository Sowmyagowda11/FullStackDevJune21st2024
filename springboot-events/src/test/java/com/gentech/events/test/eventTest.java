package com.gentech.events.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;


import com.gentech.events.entity.Events;
import com.gentech.events.repository.eventrepository;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class eventTest {
	
	@LocalServerPort
	private int port;

	private String baseURL="http://localhost";
	
	private static RestTemplate restTemplate;
	
	@Autowired
	private  eventrepository eventrep;
	
	@BeforeAll
	public static void initialization()
	{
		restTemplate=new RestTemplate();
	}
	
	@BeforeEach
	public void setUp()
	{
		baseURL=baseURL+":"+port+"/v1/api/event";
	}
	
	@AfterEach
	public void tearDown()
	{
		eventrep.deleteAll();
	}
	
	@Test
	public void shouldcreatecatering()
	{
		Events event1=new Events();
		event1.setEventName("Marriage");
		event1.setEventType("Grand");
		event1.setEventPhono(Long.valueOf(82826));
		event1.setEventDesc("Nice");
		

		Events newevents=restTemplate.postForObject(baseURL, event1, Events.class);
		
		//validation
		assertNotNull(newevents);
		assertThat(newevents.getId()).isNotNull();
		assertEquals("Marriage",newevents.getEventName());
		
		//teardown
		 eventrep.deleteById(newevents.getId());
		
	}
	
	@Test
	public void shoulddisplayalleventstest()
	{
		Events event1=new Events();
		event1.setEventName("Marriage");
		event1.setEventType("Grand");
		event1.setEventDesc("Nice");
		event1.setEventPhono(Long.valueOf(82826));
		
		Events event2=new Events();
		event2.setEventName("Birthday");
		event2.setEventType("Simple");
		event2.setEventDesc("Nice");
		event2.setEventPhono(Long.valueOf(82626));
		
		Events Marriage=restTemplate.postForObject(baseURL, event1, Events.class);
		Events Birthday=restTemplate.postForObject(baseURL, event2, Events.class);
		 
		List<Events> list=restTemplate.getForObject(baseURL, List.class);
		
		//validation
		assertNotNull(list);
		assertThat(list.size()).isEqualTo(2);
		
	}
	@Test
	public void shoulddisplayoneevents()
	{

		Events event1=new Events();
		event1.setEventName("Marriage");
		event1.setEventType("Grand");
		event1.setEventDesc("Nice");
		event1.setEventPhono(Long.valueOf(82826));
	
	Events Marriage=restTemplate.postForObject(baseURL, event1, Events.class);
	
	Events existingevent=restTemplate.getForObject(baseURL+"/"+Marriage.getId(), Events.class);
	
	//Validation
	assertNotNull(existingevent);
	assertEquals("Marriage", existingevent.getEventName());
	}
	

	@Test
	public void shouldupdateexistingeventstest()
	{
		Events event=new Events();
		event.setEventName("Mom to be");
		event.setEventType("Grand");
		event.setEventDesc("it will be good");
		event.setEventPhono(Long.valueOf(9393983));
		
		Events events=restTemplate.postForObject(baseURL, event, Events.class);
		events.setEventName("Birthday");
		restTemplate.put(baseURL+"/"+events.getId(), events,Events.class);
		//validation
		assertEquals("Birthday",events.getEventName());
	}
	
	@Test
	public void shoulddeleteeventtest()
	{
		Events event1=new Events();
		event1.setEventName("Marriage");
		event1.setEventType("Grand");
		event1.setEventDesc("Nice");
		event1.setEventPhono(Long.valueOf(82826));
		
		Events event2=new Events();
		event2.setEventName("Marriage");
		event2.setEventType("Grand");
		event2.setEventDesc("Nice");
		event2.setEventPhono(Long.valueOf(82826));
		
		Events Marriage=restTemplate.postForObject(baseURL, event1, Events.class);
		Events Wedding=restTemplate.postForObject(baseURL, event2, Events.class);
		
		restTemplate.delete(baseURL+"/"+Wedding.getId());
		
		//validation
		assertThat(eventrep.findAll().size()).isEqualTo(2);
		
	}
	
	
}
