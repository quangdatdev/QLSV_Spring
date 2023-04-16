package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.StudentDAO;
import com.se.spring.entity.Student;

@Service
public class StudentsServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;
	
	@Override
	@Transactional
	public List<Student> getStudentAll() {
		// TODO Auto-generated method stub
		return dao.getStudentAll();
	}


	@Override
	@Transactional
	public Student getStudentById(String id) {
		return dao.getStudentById(id);
	}


	@Override
	@Transactional
	public String deleteStudent(String id) {
		// TODO Auto-generated method stub
		return dao.deleteStudent(id);
	}


	@Override
	@Transactional
	public Student updateStudent(String id, Student st) {
		return dao.updateStudent(id,st);
	}


	@Override
	@Transactional
	public Student addStudent(Student st) {
		// TODO Auto-generated method stub
		return dao.addStudent(st);
	}


	@Override
	@Transactional
	public List<Student> getStudentByClass(String class_id) {
		// TODO Auto-generated method stub
		return dao.getStudentByClass(class_id);
	}


	@Override
	public List<Student> addListStudent(List<Student> st) {
		// TODO Auto-generated method stub
		return dao.addListStudent(st);
	}

}
