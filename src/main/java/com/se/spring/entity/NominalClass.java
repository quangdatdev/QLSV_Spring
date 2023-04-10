package com.se.spring.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Lớp danh nghĩa
 * 
 * @author
 *
 */
@Entity(name = "NominalClass")
public class NominalClass {

	/**
	 * Mã lớp danh nghĩa
	 */
	@Id
	@Column(name = "id_class")
	private String idClass;
	/**
	 * Tên lớp danh nghĩa
	 */
	@Column(name = "name_class")
	private String nameClass;
	
	//Constrain
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "nominalClass")
	private List<Student> student = new ArrayList<>();
	

	public String getIdClass() {
		return idClass;
	}

	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public NominalClass(String idClass, String nameClass) {
		super();
		this.idClass = idClass;
		this.nameClass = nameClass;
	}

	public NominalClass() {
		super();
	}

}
