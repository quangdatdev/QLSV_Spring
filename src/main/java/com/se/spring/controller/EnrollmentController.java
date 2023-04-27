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

import com.se.spring.entity.Enrollment;
import com.se.spring.service.EnrollmentService;

@RestController
@RequestMapping("/api/v1/enrollment")
public class EnrollmentController {

	@Autowired
	private EnrollmentService service;

	@GetMapping("/getall")
	public List<Enrollment> getEnrollmentAll() {
		
		return service.getEnrollmentAll();
	}
	@GetMapping("/getByStudentId/{id}")
	public Enrollment getByStudentId(@PathVariable String id) {
		
		
		return service.getEnrollmentByStudentId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEnrollment(@PathVariable String id) {
		
		return service.deleteEnrollment(id);
	}
	
	@PutMapping("/updateGrade")
	public Enrollment updateGradeEnrollment(@RequestBody Enrollment st) {
		
		return service.updateGradeEnrollment(st);
	}
	@PostMapping("/add")
	public Enrollment addEnrollment(@RequestBody Enrollment st) {
		
		return service.addEnrollment(st);
	}
	
	@PostMapping("/addList")
	public List<Enrollment> addListEnrollment(@RequestBody List<Enrollment> st) {
		
		return service.addListEnrollment(st);
	}
	
	@GetMapping("/getBySectionId/{id}")
	public List<Enrollment> getEnrollmentBySectionId(@PathVariable String class_id) {
		
		return service.getEnrollmentBySectionId(class_id);
	}

}
