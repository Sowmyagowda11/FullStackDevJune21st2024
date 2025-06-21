package com.gentech.catering.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.gentech.catering.entity.Catering;






public interface cateringRepository extends JpaRepository<Catering,Long>,PagingAndSortingRepository<Catering,Long>
{

	  List<Catering> findByCateringName(String cateringName);
	
	  List<Catering> findByCateringType(String cateringType);
	
	  List<Catering> findByCateringNameAndCateringType(String cateringName,String cateringType);
	  
	  List<Catering> findByCateringNameContaining(String partialName);
	  
	  
	  @Query("FROM Catering Where cateringType=:catertype OR cateringName=:catername")
	  List<Catering> getAllCateringByTypeAndCateringName(@Param("catertype")String catertype,String catername);
	   
	  @Transactional
	  @Modifying
	  @Query("DELETE FROM Catering WHERE cateringName=:catername")
	  Integer deleteCateringByCateringName(String catername);
	  
	  @Transactional
	  @Modifying
	  @Query("UPDATE Catering c SET c.cateringType=:catertype WHERE c.id=:id ")
	  Integer updateCateringTypeById(String catertype,Long id);
	  
	  
	  @Transactional
	  @Modifying
	  @Query("UPDATE Catering c SET c.CateringPhono=:phone,c.CateringBudget=:budget WHERE c.cateringType=:catertype")
	  Integer updateCateringPhoneAndBudgetByCaterType(Long phone,String budget,String catertype);
	  
	  
}
