package com.gentech.catering.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name="tbl_catering")
public class Catering {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="cat_id")
	private Long id;
	
	@Column(name="cat_name")
	private String cateringName;
	
	@Column(name="cat_type")
	private String cateringType;
	
	@Column(name="cat_Budget")
	private String CateringBudget;
	
	@Column(name="cat_phone")
	private Long CateringPhono;
	
	@CreationTimestamp
	@Column(name="createdAt",nullable=false,updatable=true)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updtedAt",nullable=false)
	private Date updatedAt;
	

}
