package com.se.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "Professor")
@PrimaryKeyJoinColumn(name = "uid")
public class Professor extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8590285768096332368L;
	
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String title;
	/**
	 * Thuộc tính bằng cấp
	 */
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String degree;

	// Constrain
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_faculty",columnDefinition = "nvarchar(255)")
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

	public Professor(String title, String degree, Faculty faculty) {
		super();
		this.title = title;
		this.degree = degree;
		this.faculty = faculty;
	}

	
	
	public Professor(String uid, String fullName, String lastName, String numCI, String dateOfBirth, String phone,
			String email, String address, String status, String title, String degree, Faculty faculty) {
		super(uid, fullName, lastName, numCI, dateOfBirth, phone, email, address, status);
		this.title = title;
		this.degree = degree;
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Professor [title=" + title + ", degree=" + degree + ", faculty=" + faculty.getIdFaculty()
				+ ", toString()=" + super.toString() + "]";
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	
}
