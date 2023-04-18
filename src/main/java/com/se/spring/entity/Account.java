package com.se.spring.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Account {

	
	private String password;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
}
