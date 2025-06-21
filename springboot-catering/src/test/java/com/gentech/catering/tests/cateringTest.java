package com.gentech.catering.tests;

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

import com.gentech.catering.entity.Catering;
import com.gentech.catering.repository.cateringRepository;


@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class cateringTest {

	@LocalServerPort
	private int port;
	
	private String baseURL="http://localhost";
	
	private static RestTemplate restTemplate;
	
	@Autowired
	private cateringRepository caterRepository;
	
	@BeforeAll
	public static void intialization()
	{
		restTemplate=new RestTemplate();
	}
	
	@BeforeEach
	public void setUp()
	{
		baseURL=baseURL+":"+port+"/v1/api/catering";
	}
	
	@AfterEach
	public void tearDown()
	{
		caterRepository.deleteAll();
	}
	
	@Test
	public void shouldcreatecatering()
	{
		Catering cater1=new Catering();
		cater1.setCateringName("Corporate catering");
		cater1.setCateringType("off-premise");
		cater1.setCateringBudget("5000$");
		cater1.setCateringPhono(Long.valueOf(99018266));

		Catering newcatering=restTemplate.postForObject(baseURL, cater1, Catering.class);
		
		//validation
		assertNotNull(newcatering);
		assertThat(newcatering.getId()).isNotNull();
		assertEquals("Corporate catering",newcatering.getCateringName());
		
		//teardown
		// caterRepository.deleteById(newcatering.getId());
		
	}
	
	@Test
	public void shoulddisplayallcateringstest()
	{
		Catering cater1=new Catering();
		cater1.setCateringName("Corporate");
		cater1.setCateringType("off-premise");
		cater1.setCateringBudget("5000$");
		cater1.setCateringPhono(Long.valueOf(99018266));
		
		Catering cater2=new Catering();
		cater2.setCateringName("Wedding");
		cater2.setCateringType("nutriotion meals");
		cater2.setCateringBudget("1000$");
		cater2.setCateringPhono(Long.valueOf(99018267));
		
		Catering Corporate=restTemplate.postForObject(baseURL, cater1, Catering.class);
		Catering Wedding=restTemplate.postForObject(baseURL, cater2, Catering.class);
		
		List<Catering> list=restTemplate.getForObject(baseURL, List.class);
		
		//validation
		assertNotNull(list);
		assertThat(list.size()).isEqualTo(2);
		
	}
	@Test
	public void shoulddisplayonecatering()
	{
		Catering cater1=new Catering();
		cater1.setCateringName("Corporate catering");
		cater1.setCateringType("off-premise");
		cater1.setCateringBudget("5000$");
		cater1.setCateringPhono(Long.valueOf(99018266));
		
		Catering Corporate=restTemplate.postForObject(baseURL, cater1, Catering.class);
		Catering existingcatering=restTemplate.getForObject(baseURL+"/"+Corporate.getId(), Catering.class);
		
		
		//validation
		assertNotNull(existingcatering);
		assertEquals("Corporate catering",existingcatering.getCateringName());
	}
	
	@Test
	public void shouldupdateexistingcatering()
	{
		Catering cater1=new Catering();
		cater1.setCateringName("Corporate catering");
		cater1.setCateringType("off-premise");
		cater1.setCateringBudget("5000$");
		cater1.setCateringPhono(Long.valueOf(99018266));
		
		Catering Corporate=restTemplate.postForObject(baseURL, cater1, Catering.class);
		Corporate.setCateringName("Wedding catering");
		
		restTemplate.put(baseURL+"/"+Corporate.getId(), Corporate, Catering.class);
		//
		assertEquals("Wedding catering", Corporate.getCateringName());
		
	}
	
	@Test
	public void shoulddeletecatering()
	{
		Catering cater1=new Catering();
		cater1.setCateringName("Corporate");
		cater1.setCateringType("off-premise");
		cater1.setCateringBudget("5000$");
		cater1.setCateringPhono(Long.valueOf(99018266));
		
		Catering cater2=new Catering();
		cater2.setCateringName("Wedding");
		cater2.setCateringType("nutriotion meals");
		cater2.setCateringBudget("1000$");
		cater2.setCateringPhono(Long.valueOf(99018267));
		
		Catering Corporate=restTemplate.postForObject(baseURL, cater1, Catering.class);
		Catering Wedding=restTemplate.postForObject(baseURL, cater2, Catering.class);
		
		restTemplate.delete(baseURL+"/"+Corporate.getId());
		
		//validation
		assertThat(caterRepository.findAll().size()).isEqualTo(2);
	}	
	
}
