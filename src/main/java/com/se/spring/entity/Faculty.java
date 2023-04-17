package com.se.spring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Faculty")
public class Faculty {

	@Id
	@Column(name = "id_faculty")
	private String idFaculty;

	@Column(name = "name_faculty")
	private String nameFaculty;

	

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

	

	public Faculty(String idFaculty, String nameFaculty) {
		this.idFaculty = idFaculty;
		this.nameFaculty = nameFaculty;
	}
	public Faculty() {
	}
	
}
