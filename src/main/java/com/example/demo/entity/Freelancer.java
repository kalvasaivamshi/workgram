package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name="freelancer")
public class Freelancer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "fr_id")
	private Long fr_id;
	
	@Column(name = "fr_name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "email", unique = true, nullable = false)
	private String emailId;
	
	@Column(name = "mobile_number", length = 13)
	private String mobileNumber;
	
	

  
}
