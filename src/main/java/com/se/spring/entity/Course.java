package com.se.spring.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;

@Entity(name = "Course")
public class Course {

	@Id
	private String course_id;
	private String course_name;
	private int credits;
	private String desrciption;
	
	@ElementCollection
	@CollectionTable(name = "Prerequisite_Subject",
	joinColumns = @JoinColumn(name="course_id"),
	uniqueConstraints = @UniqueConstraint(columnNames = {"course_id", "prerequisite"})
	)
	@Column(name = "prerequisite", nullable = false)
	private Set<String> prerequisites = new HashSet<String>();

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getDesrciption() {
		return desrciption;
	}

	public void setDesrciption(String desrciption) {
		this.desrciption = desrciption;
	}
	
	
}