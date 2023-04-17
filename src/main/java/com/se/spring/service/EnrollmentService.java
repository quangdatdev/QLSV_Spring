package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.Enrollment;

public interface EnrollmentService {
	public List<Enrollment> getEnrollmentAll();
	public List<Enrollment> getEnrollmentBySectionId(String class_id);
	public Enrollment getEnrollmentByStudentId(String id);
	public String deleteEnrollment(String id);
	public Enrollment updateEnrollment(String id,Enrollment st);
	public Enrollment addEnrollment(Enrollment st);
	
	public List<Enrollment> addListEnrollment(List<Enrollment> st);
}
