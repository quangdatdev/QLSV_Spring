package com.se.spring.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Faculty")
public class Faculty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4219533597652461881L;

	@Id
	@Column(name = "id_faculty",columnDefinition = "nvarchar(255)")
	private String idFaculty;

	@Column(name = "name_faculty",columnDefinition = "nvarchar(255)", nullable = true)
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
