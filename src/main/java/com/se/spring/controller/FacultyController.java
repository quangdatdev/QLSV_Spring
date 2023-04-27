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

import com.se.spring.entity.Faculty;
import com.se.spring.service.FacultyService;

@RestController
@RequestMapping("/api/v1/faculty")
public class FacultyController {

	@Autowired
	private FacultyService service;

	@GetMapping("/getall")
	public List<Faculty> getFacultyAll() {
		
		return service.getFacultyAll();
	}
	@GetMapping("/getById/{id}")
	public Faculty getById(@PathVariable String id) {
		
		
		return service.getFacultyById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteFaculty(@PathVariable String id) {
		
		return service.deleteFaculty(id);
	}
	
	@PutMapping("/update/{id}")
	public Faculty updateFaculty(@PathVariable String id,@RequestBody Faculty st) {
		
		return service.updateFaculty(st.getIdFaculty(),st);
	}
	@PostMapping("/add")
	public Faculty addFaculty(@RequestBody Faculty st) {
		
		return service.addFaculty(st);
	}
	
	@PostMapping("/addList")
	public List<Faculty> addListFaculty(@RequestBody List<Faculty> st) {
		
		return service.addListFaculty(st);
	}
	
//	@GetMapping("/getByClass/{class_id}")
//	public List<Faculty> getFacultyByClass(@PathVariable String class_id) {
//		
//		return service.getFacultyByName(class_id);
//	}

}