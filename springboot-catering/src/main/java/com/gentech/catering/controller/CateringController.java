package com.gentech.catering.controller;

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

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;
import com.gentech.catering.service.cateringService;


@RestController
@RequestMapping("/v1/api")
public class CateringController {
	@Autowired
	private cateringService caterservice;
	
	@PostMapping("/catering")
	public ResponseEntity<CateringDto> createCatering(@RequestBody CateringDto caterdto)
	{
		return new ResponseEntity<CateringDto>(caterservice.createCatering(caterdto), HttpStatusCode.valueOf(201));
	}
	
	@GetMapping("/catering")
	public ResponseEntity<List<CateringDto>> getAllCatering()
	{
		return new ResponseEntity<List<CateringDto>>(caterservice.getAllaterigs(), HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/catering/{id}")
	public ResponseEntity<CateringDto> getSpricificCatering(@PathVariable Long id)
	{
		return new ResponseEntity<CateringDto>(caterservice.getCatering(id),HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/catering/{id}")
	public ResponseEntity<CateringDto> updateSpecificCatering(@PathVariable Long id,@RequestBody CateringDto caterdto)
	{
		return new ResponseEntity<CateringDto>(caterservice.updateCaterings(id, caterdto),HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/catering/{id}")
	public ResponseEntity<String> deleteCatering(@PathVariable Long id)
	{
		caterservice.deleteById(id);
		return new ResponseEntity<String>("The event id "+id+" has deleted from the database table successfully",HttpStatusCode.valueOf(200));
	}
	
	// http://localhost:9092/v1/api/catering/filterbyname?name=Marriage
		@GetMapping("/catering/filterbycateringName")
		public ResponseEntity<List<Catering>> getAllCateringByName(@RequestParam String cateringName)
		{
			return new ResponseEntity<List<Catering>>(caterservice.getAllCateringByCateringName(cateringName), HttpStatusCode.valueOf(200));
		}

		// http://localhost:9092/v1/api/catering/filterbytype?type=Grand
		@GetMapping("/catering/filterbycateringtype")
		public ResponseEntity<List<Catering>> getAllEventsByType(@RequestParam String cateringType)
		{
			return new ResponseEntity<List<Catering>>(caterservice.getAllCateringByCateringType(cateringType), HttpStatusCode.valueOf(200));
		}
		
		// http://localhost:9092/v1/api/catering/filterbynameandloc?name=Marriage&loc=Grand
		@GetMapping("/catering/filterbynameandtype")
		public ResponseEntity<List<Catering>> getAllEventsByNameAndType(@RequestParam String cateringName,@RequestParam String cateringType)
		{
			return new ResponseEntity<List<Catering>>(caterservice.getAllCateringByCateringNameAndType(cateringName, cateringType), HttpStatus.OK);
		}
		
		@GetMapping("/catering/filterbypartialname")
		public ResponseEntity<List<Catering>> getAllPartialCateringName(String cateringName)
		{
			return new ResponseEntity<List<Catering>>(caterservice.getAllCateringByPartialName(cateringName),HttpStatus.OK);
		}
		
		@GetMapping("/catering/filterbypaging")
		public ResponseEntity<List<Catering>> getAllCatering(@RequestParam int pageNumber,@RequestParam int pageSize)
		{
			return new ResponseEntity<List<Catering>>(caterservice.getAllCateringByPaging(pageNumber, pageSize),HttpStatus.OK);
		}
		
		@GetMapping("/catering/filterbypagingandsorting")
		public ResponseEntity<List<Catering>> getAllCatering(@RequestParam int pageNumber,@RequestParam int pageSize,@RequestParam String columnName)
		{
			return new ResponseEntity<List<Catering>>(caterservice.getAllCateringByPagingAndSorting(pageNumber, pageNumber, columnName),HttpStatus.OK);
		}
		
		@GetMapping("/catering/query")
		public ResponseEntity<List<Catering>> getEventTypeAndName(String catertype,String catername)
		{
			return new ResponseEntity<List<Catering>>(caterservice.getAllCateringByCateringNameAndType(catertype, catername),HttpStatus.OK);
		}

		@DeleteMapping("/catering/deletecateringbyname")
		public ResponseEntity<String> deleteCatering(@RequestParam String catername)
		{
			Integer count=caterservice.deleteCateringByCateringName(catername);
			return new ResponseEntity<String>((count+"of catering will b deleted succefully"),HttpStatus.OK);
		}
		
		@PutMapping("/catering/updatecatertypebyid")
		public ResponseEntity<String> updateCaterTypeById(@RequestParam String catertype,Long id)
		{
			Integer count=caterservice.getCateringTypeById(catertype, id);
			return new ResponseEntity<String>((count+"update the records update successfully"),HttpStatus.OK);
		}
		
		@PutMapping(".catering/updatemul")
		public ResponseEntity<String> updateMultiplerecords(@RequestParam Long phone,String budget,String catertype)
		{
			Integer count=caterservice.getCateringPhoneAndBudgetByType(phone, budget, catertype);
			return new ResponseEntity<String>((count+"update the records update successfully"),HttpStatus.OK);
		}
	
}
