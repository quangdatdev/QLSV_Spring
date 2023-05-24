package com.se.spring.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
<<<<<<< HEAD

import org.hibernate.annotations.CascadeType;
=======
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1034325141152345754L;

	@Id
	@Column(columnDefinition = "nvarchar(255)")
	protected String uid;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	protected String fristName;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	protected String lastName;
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	protected String numCI;
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	protected String dateOfBirth;
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	protected String phone;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	protected String email;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	protected String address;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	protected String status;
<<<<<<< HEAD
	@OneToOne(mappedBy = "person")
    @PrimaryKeyJoinColumn
	protected Account account;

=======

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	protected Account account;
	
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String uid, String fullName, String lastName, String numCI, String dateOfBirth, String phone,
			String email, String address, String status) {
		this.uid = uid;
		this.fristName = fullName;
		this.lastName = lastName;
		this.numCI = numCI;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.status = status;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
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
<<<<<<< HEAD

=======
	
	
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
	@Override
	public String toString() {
		return "Person [uid=" + uid + ", fristName=" + fristName + ", lastName=" + lastName + ", numCI=" + numCI
				+ ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", status=" + status + "]";
	}
<<<<<<< HEAD

=======
	
	
	
>>>>>>> e82547db487d45b84e4d9beae3786af8bbc4a262
}
