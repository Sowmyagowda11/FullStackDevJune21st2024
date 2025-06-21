package com.gentech.catering.mapper;

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;

public class cateringMapper {

	public static Catering maptoCatering(CateringDto caterdto)
	{
		Catering cater=new Catering(
				caterdto.getId(),
				caterdto.getCateringName(),
				caterdto.getCateringType(),
				caterdto.getCateringBudget(),
				caterdto.getCateringPhono(),
				caterdto.getCreatedAt(),
				caterdto.getUpdatedAt());
			return cater;	
	}
	
	public static CateringDto maptoCateringdto(Catering cater)
	{
		CateringDto cateringdto=new CateringDto(
				cater.getId(),
				cater.getCateringName(),
				cater.getCateringType(),
				cater.getCateringBudget(),
				cater.getCateringPhono(),
				cater.getCreatedAt(),
				cater.getUpdatedAt());
		return cateringdto;
				
	}
}
