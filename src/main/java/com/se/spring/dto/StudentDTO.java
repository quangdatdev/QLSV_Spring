package com.se.spring.dto;

import java.util.List;

import com.se.spring.entity.Faculty;
import com.se.spring.entity.NominalClass;

public class StudentDTO extends PersonDTO{

	/**
	 * Chuyên ngành
	 */
	private String major;
	/**
	 * Ngày nhập học
	 */
	private String dateStart;
	
	
	//Constrain
	private Faculty faculty;
	
	private NominalClass nominalClass;
	
	
	public StudentDTO() {
	}

	public StudentDTO(String id, String fullName, String lastName, String numCI, String dateOfBirth, String phone,
			String email, String address, String status, String major, String dateStart) {
		super(id, fullName, lastName, numCI, dateOfBirth, phone, email, address, status);
		this.major = major;
		this.dateStart = dateStart;
	}
	
	
	public StudentDTO(String major, String dateStart, Faculty faculty, NominalClass nominalClass) {
		super();
		this.major = major;
		this.dateStart = dateStart;
		this.faculty = faculty;
		this.nominalClass = nominalClass;
	}
	
//	public StudentDTO(String id, String fullName,String lastName,String major) {
//		id = super.getUid();
//		fullName = super.getFristName();
//		lastName = super.getLastName();
//		this.major = major;
//	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	

	@Override
	public String toString() {
		return "Student [major=" + major + ", dateStart=" + dateStart + ", faculty=" + faculty.getIdFaculty() + ", nominalClass="
				+ nominalClass.getIdClass() + ", toString()=" + super.toString() + "]";
	}


	public Faculty getFaculty() {
		return faculty;
	}

	public NominalClass getNominalClass() {
		return nominalClass;
	}

	public void setNominalClass(NominalClass nominalClass) {
		this.nominalClass = nominalClass;
	}


	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	

	
	
	
}
