package com.se.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

	@Id
	protected String uid;
	protected String fristName;
	protected String lastName;
	protected String numCI;
	protected String dateOfBirth;
	protected String phone;
	protected String email;
	protected String address;
	protected String status;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String id, String fullName, String lastName, String numCI, String dateOfBirth, String phone,
			String email, String address, String status) {
		this.uid = id;
		this.fristName = fullName;
		this.lastName = lastName;
		this.numCI = numCI;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.status = status;
	}
	public String getId() {
		return uid;
	}
	public void setId(String id) {
		this.uid = id;
	}
	public String getFullName() {
		return fristName;
	}
	public void setFullName(String fullName) {
		this.fristName = fullName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNumCI() {
		return numCI;
	}
	public void setNumCI(String numCI) {
		this.numCI = numCI;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Person [uid=" + uid + ", fullName=" + fristName + ", lastName=" + lastName + ", numCI=" + numCI
				+ ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", status=" + status + "]";
	}
	
	
}
