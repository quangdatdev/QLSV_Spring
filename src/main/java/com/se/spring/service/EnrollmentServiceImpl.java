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
	public Enrollment getEnrollmentByStudentId(String id) {
		return dao.getEnrollmentByStudentId(id);
	}


	@Override
	@Transactional
	public String deleteEnrollment(String id) {
		// TODO Auto-generated method stub
		return dao.deleteEnrollment(id);
	}


	@Override
	@Transactional
	public Enrollment updateEnrollment(String id, Enrollment st) {
		return dao.updateEnrollment(id,st);
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
	public List<Enrollment> addListEnrollment(List<Enrollment> st) {
		// TODO Auto-generated method stub
		return dao.addListEnrollment(st);
	}


	

}
