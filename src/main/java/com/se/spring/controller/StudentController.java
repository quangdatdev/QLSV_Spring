package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.spring.entity.Student;
import com.se.spring.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/getall")
	public List<Student> getStudentAll() {
		
		return service.getStudentAll();
	}
	@GetMapping("/getById")
	public Student getById(String id) {
		
		
		return service.getStudentById(id);
	}
	
	@PostMapping("/delete")
	public String deleteStudent(String id) {
		
		return service.deleteStudent(id);
	}
	
	@GetMapping("/update")
	public Student updateStudent(String id,Student st) {
		
		return service.updateStudent(id,st);
	}
	@PostMapping("/add")
	public Student addStudent(Student st) {
		
		return service.addStudent(st);
	}
	
	@PostMapping("/addList")
	public List<Student> addListStudent(List<Student> st) {
		
		return service.addListStudent(st);
	}
	
	@GetMapping("/getByClass")
	public List<Student> getStudentByClass(String class_id) {
		
		return service.getStudentByClass(class_id);
	}

}
