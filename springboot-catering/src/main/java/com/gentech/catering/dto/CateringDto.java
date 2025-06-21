package com.gentech.catering.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CateringDto {

	private Long id;
	
	private String cateringName;
	
	private String cateringType;
	
	private String cateringBudget;
	
	private Long cateringPhono;
	
	private Date createdAt;
	
	private Date updatedAt;
	
}
