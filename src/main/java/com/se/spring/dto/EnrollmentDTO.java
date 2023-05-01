package com.se.spring.dto;

import com.se.spring.entity.Student;

public class EnrollmentDTO {

	private Student student;

	private SectionDTO section;
	
	
	private float gradle1;
	private float gradle2;
	private float gradle3;
	private String dateEnrollment;
	private String status;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public SectionDTO getSection() {
		return section;
	}
	public void setSection(SectionDTO section) {
		this.section = section;
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
	public String getDateEnrollment() {
		return dateEnrollment;
	}
	public void setDateEnrollment(String dateEnrollment) {
		this.dateEnrollment = dateEnrollment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public EnrollmentDTO() {
		// TODO Auto-generated constructor stub
	}
	public EnrollmentDTO(Student student, SectionDTO section, float gradle1, float gradle2, float gradle3,
			String dateEnrollment, String status) {
		super();
		this.student = student;
		this.section = section;
		this.gradle1 = gradle1;
		this.gradle2 = gradle2;
		this.gradle3 = gradle3;
		this.dateEnrollment = dateEnrollment;
		this.status = status;
	}
	
}
