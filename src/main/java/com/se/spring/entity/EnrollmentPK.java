package com.se.spring.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class EnrollmentPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1994683049589222256L;
	
	private String section;
	private String student;
	public EnrollmentPK() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(section, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrollmentPK other = (EnrollmentPK) obj;
		return Objects.equals(section, other.section) && Objects.equals(student, other.student);
	}
	
}
