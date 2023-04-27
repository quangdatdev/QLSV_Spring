package com.se.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "Student")
@PrimaryKeyJoinColumn(name = "uid")
public class Student extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2796582220328133800L;
	/**
	 * Chuyên ngành
	 */
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String major;
	/**
	 * Ngày nhập học
	 */
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String dateStart;
	
	
	//Constrain
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_faculty",columnDefinition = "nvarchar(255)")
	private Faculty faculty;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_class",columnDefinition = "nvarchar(255)")
	private NominalClass nominalClass;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
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
	
	
	public Student(String major, String dateStart, Faculty faculty, NominalClass nominalClass) {
		super();
		this.major = major;
		this.dateStart = dateStart;
		this.faculty = faculty;
		this.nominalClass = nominalClass;
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
		return "Student [major=" + major + ", dateStart=" + dateStart + ", faculty=" + faculty.getIdFaculty() + ", nominalClass="
				+ nominalClass.getIdClass() + ", toString()=" + super.toString() + "]";
	}


	public Faculty getFaculty() {
		return faculty;
	}

	public NominalClass getNominalClass() {
		return nominalClass;
	}

	public void setNominalClass(NominalClass nominalClass) {
		this.nominalClass = nominalClass;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	

	
	
	
}
