package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/getById/{id}")
	public Student getById(@PathVariable String id) {
		
		
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable String id) {
		
		return service.deleteStudent(id);
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable String id,@RequestBody Student st) {
		
		return service.updateStudent(id,st);
	}
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student st) {
		
		System.out.println(st.getUid().toString());
		
		return service.addStudent(st);
	}
	
	@PostMapping("/addList")
	public List<Student> addListStudent(@RequestBody List<Student> st) {
		
		return service.addListStudent(st);
	}
	
	@GetMapping("/getByClass/{class_id}")
	public List<Student> getStudentByClass(@PathVariable String class_id) {
		
		return service.getStudentByClass(class_id);
	}
	@GetMapping("/getByFaculty/{class_id}")
	public List<Student> getStudentByFaculty(@PathVariable String class_id) {
		
		return service.getStudentByFaculty(class_id);
	}
	

}
