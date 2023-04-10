package com.se.spring.entity;

import java.io.Serializable;

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
	
	private float gradle;
	public Enrollment() {
		// TODO Auto-generated constructor stub
	}
	public Enrollment(Student student, Section section, float gradle) {
		super();
		this.student = student;
		this.section = section;
		this.gradle = gradle;
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
	@Override
	public String toString() {
		return "Enrollment [student=" + student.getId() + ", section=" + section.getId_section() + ", gradle=" + gradle + "]";
	}
	
}
