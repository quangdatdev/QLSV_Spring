package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.EnrollmentDAO;
import com.se.spring.entity.Enrollment;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{
	@Autowired
	private EnrollmentDAO dao;
	
	@Override
	@Transactional
	public List<Enrollment> getEnrollmentAll() {
		// TODO Auto-generated method stub
		return dao.getEnrollmentAll();
	}


	@Override
	@Transactional
	public List<Enrollment> getEnrollmentByStudentId(String id) {
		return dao.getEnrollmentByStudentId(id);
	}


	@Override
	@Transactional
	public String deleteEnrollment(String uid,String id_section) {
		// TODO Auto-generated method stub
		return dao.deleteEnrollment(uid,id_section);
	}


	@Override
	@Transactional
	public Enrollment updateGradeEnrollment(String id_section,Enrollment st) {
		return dao.updateGradeEnrollment(id_section,st);
	}


	@Override
	@Transactional
	public Enrollment addEnrollment(Enrollment st) {
		// TODO Auto-generated method stub
		return dao.addEnrollment(st);
	}


	@Override
	@Transactional
	public List<Enrollment> getEnrollmentBySectionId(String class_id) {
		// TODO Auto-generated method stub
		return dao.getEnrollmentBySectionId(class_id);
	}


	@Override
	@Transactional
	public List<Enrollment> addListEnrollment(List<Enrollment> st) {
		// TODO Auto-generated method stub
		return dao.addListEnrollment(st);
	}


	@Override
	public Enrollment getEnrollmentById(String uid, String id_section) {
		// TODO Auto-generated method stub
		return dao.getEnrollmentById(uid,id_section);
	}


	

}
