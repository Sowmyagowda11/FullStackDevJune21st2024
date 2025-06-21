package com.gentech.events.dto;

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

public class Eventsdto {

	private Long id;
	private String eventName;
	private String eventType;
	private Long eventPhono;
	private String eventDesc;
	private Date createdAt;
	private Date updatedAt;
}
