package com.gentech.events.entity;



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
@Table(name="tbl_events")
public class Events {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	
	@Column(name="Id")
	private Long id;
	
	@Column(name="eventName")
	private String eventName;
	
	@Column(name="eventType")
	private String eventType;
	
	@Column(name="eventPhono")
	private Long eventPhono;
	
	@Column(name="eventDesc")
	private String eventDesc;
	
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name = "updated_at",nullable = false)
	private Date updatedAt;
	
	
	

}
