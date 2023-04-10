package com.se.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Faculty")
public class Faculty {

	@Id
	@Column(name = "id_faculty")
	private String idFaculty;

	@Column(name = "name_faculty")
	private String nameFaculty;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
	private List<Student> student = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
	private List<Professor> professor = new ArrayList<>();
	

	public String getIdFaculty() {
		return idFaculty;
	}

	public void setIdFaculty(String idFaculty) {
		this.idFaculty = idFaculty;
	}

	public String getNameFaculty() {
		return nameFaculty;
	}

	public void setNameFaculty(String nameFaculty) {
		this.nameFaculty = nameFaculty;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Faculty(String idFaculty, String nameFaculty) {
		this.idFaculty = idFaculty;
		this.nameFaculty = nameFaculty;
	}
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	
}
