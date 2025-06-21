package com.gentech.catering.service;

import java.util.List;
import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;



public interface cateringService {


	CateringDto createCatering(CateringDto catering);
	
	CateringDto getCatering(Long id);
	
	List<CateringDto> getAllaterigs();
	
	CateringDto updateCaterings(Long id,CateringDto catering);
	
	void deleteById(Long id);
	
	List<Catering> getAllCateringByCateringName(String cateringName);
	 
	List<Catering> getAllCateringByCateringType(String cateringType);
	 
	List<Catering> getAllCateringByCateringNameAndType(String cateringName,String cateringType);
	
	List<Catering> getAllCateringByPartialName(String cateringName);
	
	List<Catering> getAllCateringByPaging(int pageNumber,int pageSize);
	
	List<Catering> getAllCateringByPagingAndSorting(int pageNumber,int pageSize,String columnName);
	
	List<Catering> getAlCateringByTypeOrName(String catertype,String catername);
	
	Integer deleteCateringByCateringName(String catername);
	
	Integer getCateringTypeById(String catertype,Long id);
	
	Integer getCateringPhoneAndBudgetByType(Long phone,String budget,String catertype);

	
	
	
}
