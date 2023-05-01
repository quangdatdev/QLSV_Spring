package com.se.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Lớp danh nghĩa
 * 
 * @author
 *
 */
@Entity(name = "NominalClass")
public class NominalClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8239756915494680103L;
	/**
	 * Mã lớp danh nghĩa
	 */
	@Id
	@Column(name = "id_class",columnDefinition = "nvarchar(255)", nullable = true)
	private String idClass;
	/**
	 * Tên lớp danh nghĩa
	 */
	@Column(name = "name_class",columnDefinition = "nvarchar(255)", nullable = true)
	private String nameClass;
	
	//Constrain
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "nominalClass",fetch = FetchType.EAGER)
//	private List<Student> student = new ArrayList<>();
	

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

	@Override
	public String toString() {
		return "NominalClass [idClass=" + idClass + ", nameClass=" + nameClass +  "]";
	}
	
}
