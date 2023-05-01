package com.se.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Enrollment")
@IdClass(EnrollmentPK.class)
public class Enrollment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3436382010113528000L;

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "uid", columnDefinition = "nvarchar(255)")
	private Student student;

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_section",columnDefinition = "nvarchar(100)")
	private Section section;
	
	
	@Column(nullable = true)
	private float gradle1;
	@Column(nullable = true)
	private float gradle2;
	@Column(nullable = true)
	private float gradle3;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String dateEnrollment;
	
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String status;
	

	public Enrollment() {
		// TODO Auto-generated constructor stub
	}

	

	public Enrollment(Student student, Section section, float gradle1, float gradle2, float gradle3,
			String dateEnrollment) {
		super();
		this.student = student;
		this.section = section;
		this.gradle1 = gradle1;
		this.gradle2 = gradle2;
		this.gradle3 = gradle3;
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

	

	public String getDateEnrollment() {
		return dateEnrollment;
	}

	public void setDateEnrollment(String dateEnrollment) {
		this.dateEnrollment = dateEnrollment;
	}



	public float getGradle1() {
		return gradle1;
	}



	public void setGradle1(float gradle1) {
		this.gradle1 = gradle1;
	}



	public float getGradle2() {
		return gradle2;
	}



	public void setGradle2(float gradle2) {
		this.gradle2 = gradle2;
	}



	public float getGradle3() {
		return gradle3;
	}



	public void setGradle3(float gradle3) {
		this.gradle3 = gradle3;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Enrollment [student=" + student.getUid() + ", section=" + section.getId_section() + ", gradle1=" + gradle1 + ", gradle2="
				+ gradle2 + ", gradle3=" + gradle3 + ", dateEnrollment=" + dateEnrollment + "]";
	}



}
