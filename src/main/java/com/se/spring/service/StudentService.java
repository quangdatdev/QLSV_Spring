package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.Student;

public interface StudentService {
	public List<Student> getStudentAll();
	public Student getStudentById(String id);
	public String deleteStudent(String id);
	public Student updateStudent(String id,Student st);
	public Student addStudent(Student st);
	public List<Student> getStudentByClass(String class_id);
	public List<Student> addListStudent(List<Student> st);
}
