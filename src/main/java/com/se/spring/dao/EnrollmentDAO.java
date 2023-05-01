package com.se.spring.dao;

import java.util.List;

import com.se.spring.entity.Enrollment;

public interface EnrollmentDAO {
	public List<Enrollment> getEnrollmentAll();
	public List<Enrollment> getEnrollmentBySectionId(String class_id);
	public List<Enrollment> getEnrollmentByStudentId(String id);
	public String deleteEnrollment(String uid,String id_section);
	public Enrollment updateGradeEnrollment(String id_section,Enrollment st);
	public Enrollment addEnrollment(Enrollment st);
	
	public List<Enrollment> addListEnrollment(List<Enrollment> st);
	public Enrollment getEnrollmentById(String uid, String id_section);
}