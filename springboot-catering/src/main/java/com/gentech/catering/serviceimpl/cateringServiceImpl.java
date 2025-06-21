package com.gentech.catering.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.gentech.catering.dto.CateringDto;
import com.gentech.catering.entity.Catering;
import com.gentech.catering.mapper.cateringMapper;
import com.gentech.catering.repository.cateringRepository;
import com.gentech.catering.service.cateringService;


@Service
public class cateringServiceImpl implements cateringService {

	@Autowired
	private cateringRepository caterRep;
	
	@Override
	public CateringDto createCatering(CateringDto catering) {
		Catering caters=cateringMapper.maptoCatering(catering);
		Catering saveCatering=caterRep.save(caters);	
				
		return cateringMapper.maptoCateringdto(saveCatering);
	}

	@Override
	public CateringDto getCatering(Long id) {
		Catering cater=caterRep.findById(id).orElseThrow(()->
		new RuntimeException("The catering id"+id+"is not found in the database"));
		return cateringMapper.maptoCateringdto(cater);
	}

	@Override
	public List<CateringDto> getAllaterigs() {
	
		return caterRep.findAll()
				.stream().map((cater) -> cateringMapper.maptoCateringdto(cater))
				.collect(Collectors.toList());
	}

	@Override
	public CateringDto updateCaterings(Long id, CateringDto catering) {
	
		Catering existingcatering=caterRep.findById(id).orElseThrow(()->
		 new RuntimeException("The Catering id"+id+"is not found in the database"));
		
		existingcatering.setId(id);
		existingcatering.setCateringName(catering.getCateringName());
		existingcatering.setCateringType(catering.getCateringType());
		existingcatering.setCateringBudget(catering.getCateringBudget());
		existingcatering.setCateringPhono(catering.getCateringPhono());
		 
		Catering saveCatering=caterRep.save(existingcatering);
		 return cateringMapper.maptoCateringdto(saveCatering);
	}

	@Override
	public void deleteById(Long id) {
		caterRep.findById(id).orElseThrow(() ->
		 new RuntimeException("The catering Id "+id+" has not found in the database"));
		
	}

	@Override
	public List<Catering> getAllCateringByCateringName(String cateringName) {
		
		return caterRep.findByCateringName(cateringName);
	}

	@Override
	public List<Catering> getAllCateringByCateringType(String cateringType) {
		
		return caterRep.findByCateringType(cateringType);
	}

	@Override
	public List<Catering> getAllCateringByCateringNameAndType(String cateringName, String cateringType) {
		
		return caterRep.findByCateringNameAndCateringType(cateringName, cateringType);
	}

	@Override
	public List<Catering> getAllCateringByPartialName(String cateringName)
	{
		
		return caterRep.findByCateringNameContaining(cateringName);
	}

	@Override
	public List<Catering> getAllCateringByPaging(int pageNumber, int pageSize) {
		Pageable page=PageRequest.of(pageNumber, pageSize);
		return caterRep.findAll(page).getContent();
	}

	@Override
	public List<Catering> getAllCateringByPagingAndSorting(int pageNumber, int pageSize, String columnName) {
		Sort sort=Sort.by(Direction.ASC, columnName);
		Pageable page=PageRequest.of(pageNumber, pageSize, sort);
		return caterRep.findAll(page).getContent();
	}

	@Override
	public List<Catering> getAlCateringByTypeOrName(String catertype,String catername) {
	
		return caterRep.getAllCateringByTypeAndCateringName(catertype, catername);
	}
	

	@Override
	public Integer deleteCateringByCateringName(String catername) {
		
		return caterRep.deleteCateringByCateringName(catername);
	}

	@Override
	public Integer getCateringTypeById(String catertype, Long id) {
		
		return caterRep.updateCateringTypeById(catertype, id);
	}

	@Override
	public Integer getCateringPhoneAndBudgetByType(Long phone, String budget, String catertype) {
		
		return caterRep.updateCateringPhoneAndBudgetByCaterType(phone, budget, catertype);
	}




}
