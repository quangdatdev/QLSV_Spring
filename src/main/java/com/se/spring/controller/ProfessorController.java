package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/update")
	public Professor updateProfessor(Professor st) {
		
		return service.updateProfessor(st);
	}
	@PostMapping("/add")
	public Professor addProfessor(Professor st) {
		
		return service.addProfessor(st);
	}
	
	@PostMapping("/addList")
	public List<Professor> addListProfessor(List<Professor> st) {
		
		return service.addListProfessor(st);
	}
	
	@GetMapping("/getByFaculty")
	public List<Professor> getProfessorByFaculty(String class_id) {
		
		return service.getProfessorByFaculty(class_id);
	}

}