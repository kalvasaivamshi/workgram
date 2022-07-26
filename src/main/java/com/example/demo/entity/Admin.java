package com.example.demo.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Table(name="admin")
public class Admin {
	private Long mobileNumber;
	private String password;
}
