package com.se.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity(name = "Account")
public class Account {

	
	@Id
	private String account_id;
	private String password;
	private String duty;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "uid")
	private Person person;

	public Account(String account_id,String duty) {
		super();
		this.password = "123";
		this.duty = duty;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
}
