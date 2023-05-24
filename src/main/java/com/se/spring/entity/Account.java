package com.se.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

<<<<<<< HEAD
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

=======
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "Account")
public class Account {

	
	@Id
	@Column(columnDefinition = "nvarchar(255)")
	private String account_id;
	@JsonIgnore
	private String password;
	private String duty;
	@JsonIgnore
	@OneToOne
	@MapsId
	@JoinColumn(name = "uid", columnDefinition = "nvarchar(255)")
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
	
	
	
	
	
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
}
