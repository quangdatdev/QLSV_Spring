package com.se.spring.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "Professor")
@PrimaryKeyJoinColumn(name = "uid")
public class Professor extends Person {

	private String title;
	/**
	 * Thuộc tính bằng cấp
	 */
	private String degree;
	
	
	//Constrain
		@ManyToOne
		@JoinColumn(name = "id_faculty")
		private Faculty faculty;
		
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	public Professor(String id, String fullName, String lastName, String numCI, String dateOfBirth, String phone,
			String email, String address, String status, String title, String degree) {
		super(id, fullName, lastName, numCI, dateOfBirth, phone, email, address, status);
		this.title = title;
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Professor [title=" + title + ", degree=" + degree + ", faculty=" + faculty.getIdFaculty() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
