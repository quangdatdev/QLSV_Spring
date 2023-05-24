package com.se.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity(name = "Account")
public class Account {

	@Id
    @Column(name = "uid")
    private Long uid;

	@OneToOne
	@MapsId
	@JoinColumn(name = "uid")
	private Person person;
	private String password;
	private int status;

	public Long getId() {
		return uid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

}
