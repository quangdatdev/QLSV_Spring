package com.se.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "Student")
@PrimaryKeyJoinColumn(name = "uid")
public class Student extends Person {

	/**
	 * Chuyên ngành
	 */
	private String major;
	/**
	 * Ngày nhập học
	 */
	private String dateStart;
	
	
	//Constrain
	@ManyToOne
	@JoinColumn(name = "id_faculty")
	private Faculty faculty;
	
	@ManyToOne
	@JoinColumn(name = "id_class")
	private NominalClass nominalClass;
	
	@OneToMany(mappedBy = "student")
	private List<Enrollment> enrollments;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String fullName, String lastName, String numCI, String dateOfBirth, String phone,
			String email, String address, String status, String major, String dateStart) {
		super(id, fullName, lastName, numCI, dateOfBirth, phone, email, address, status);
		this.major = major;
		this.dateStart = dateStart;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", dateStart=" + dateStart + ", faculty=" + faculty + ", nominalClass="
				+ nominalClass + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
}
