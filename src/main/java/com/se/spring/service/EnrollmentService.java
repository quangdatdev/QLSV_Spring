package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.Enrollment;

public interface EnrollmentService {
	public List<Enrollment> getEnrollmentAll();
	public List<Enrollment> getEnrollmentBySectionId(String class_id);
	public List<Enrollment> getEnrollmentByStudentId(String id);
	public String deleteEnrollment(String uid,String id_section);
	public Enrollment updateGradeEnrollment(String id_section,Enrollment st);
	public Enrollment addEnrollment(Enrollment st);
	
	public List<Enrollment> addListEnrollment(List<Enrollment> st);
	
	Enrollment getEnrollmentById(String uid,String id_section);
}
