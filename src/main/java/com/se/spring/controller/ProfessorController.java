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

import com.se.spring.entity.Professor;
import com.se.spring.service.ProfessorService;

@RestController
@RequestMapping("/api/v1/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService service;

	@GetMapping("/getall")
	public List<Professor> getProfessorAll() {
		
		return service.getProfessorAll();
	}
	@GetMapping("/getById/{id}")
	public Professor getById(@PathVariable String id) {
		
		return service.getProfessorById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProfessor(@PathVariable String id) {
		
		return service.deleteProfessor(id);
	}
	
	@PutMapping("/update/{id}")
	public Professor updateProfessor(@PathVariable String id,@RequestBody Professor st) {
		
		return service.updateProfessor(id,st);
	}
	@PostMapping("/add")
	public Professor addProfessor(@RequestBody Professor st) {
		
		return service.addProfessor(st);
	}
	
	@PostMapping("/addList")
	public List<Professor> addListProfessor(@RequestBody List<Professor> st) {
		
		return service.addListProfessor(st);
	}
	
	@GetMapping("/getByFaculty/{class_id}")
	public List<Professor> getProfessorByFaculty(@PathVariable String class_id) {
		
		return service.getProfessorByFaculty(class_id);
	}

}