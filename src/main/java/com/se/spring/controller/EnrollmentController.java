package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	@GetMapping("/getByStudentId")
	public Enrollment getByStudentId(String id) {
		
		
		return service.getEnrollmentByStudentId(id);
	}
	
	@PostMapping("/delete")
	public String deleteEnrollment(String id) {
		
		return service.deleteEnrollment(id);
	}
	
	@GetMapping("/update")
	public Enrollment updateEnrollment(String id,Enrollment st) {
		
		return service.updateEnrollment(id,st);
	}
	@PostMapping("/add")
	public Enrollment addEnrollment(Enrollment st) {
		
		return service.addEnrollment(st);
	}
	
	@PostMapping("/addList")
	public List<Enrollment> addListEnrollment(List<Enrollment> st) {
		
		return service.addListEnrollment(st);
	}
	
	@GetMapping("/getBySectionId")
	public List<Enrollment> getEnrollmentBySectionId(String class_id) {
		
		return service.getEnrollmentBySectionId(class_id);
	}

}
