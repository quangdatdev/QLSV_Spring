package com.se.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Enrollment")
@IdClass(EnrollmentPK.class)
public class Enrollment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3436382010113528000L;

	@Id
	@ManyToOne
	@JoinColumn(name = "uid")
	private Student student;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_section")
	private Section section;
	@Column(nullable = false)	
	private float gradle;
	private String dateEnrollment;
	public Enrollment() {
		// TODO Auto-generated constructor stub
	}
	
	public Enrollment(Student student, Section section, float gradle, String dateEnrollment) {
		super();
		this.student = student;
		this.section = section;
		this.gradle = gradle;
		this.dateEnrollment = dateEnrollment;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public float getGradle() {
		return gradle;
	}
	public void setGradle(float gradle) {
		this.gradle = gradle;
	}
	
	public String getDateEnrollment() {
		return dateEnrollment;
	}

	public void setDateEnrollment(String dateEnrollment) {
		this.dateEnrollment = dateEnrollment;
	}

	@Override
	public String toString() {
		return "Enrollment [student=" + student + ", section=" + section + ", gradle=" + gradle + ", dateEnrollment="
				+ dateEnrollment + "]";
	}

	
	
}
