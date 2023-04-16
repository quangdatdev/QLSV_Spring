package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.spring.entity.Faculty;
import com.se.spring.service.FacultyService;

@RestController
@RequestMapping("/api/v1/Faculty")
public class FacultyController {

	@Autowired
	private FacultyService service;

	@GetMapping("/getall")
	public List<Faculty> getFacultyAll() {
		
		return service.getFacultyAll();
	}
	@GetMapping("/getById")
	public Faculty getById(String id) {
		
		
		return service.getFacultyById(id);
	}
	
	@PostMapping("/delete")
	public String deleteFaculty(String id) {
		
		return service.deleteFaculty(id);
	}
	
	@GetMapping("/update")
	public Faculty updateFaculty(String id,Faculty st) {
		
		return service.updateFaculty(id,st);
	}
	@PostMapping("/add")
	public Faculty addFaculty(Faculty st) {
		
		return service.addFaculty(st);
	}
	
	@PostMapping("/addList")
	public List<Faculty> addListFaculty(List<Faculty> st) {
		
		return service.addListFaculty(st);
	}
	
	@GetMapping("/getByClass")
	public List<Faculty> getFacultyByClass(String class_id) {
		
		return service.getFacultyByName(class_id);
	}

}