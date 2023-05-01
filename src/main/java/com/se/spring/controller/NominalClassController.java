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

import com.se.spring.entity.NominalClass;
import com.se.spring.service.NominalClassService;

@RestController
@RequestMapping("/api/v1/nominalclass")
public class NominalClassController{

	@Autowired
	private NominalClassService service;
	

	@GetMapping("/getall")
	public List<NominalClass> getNominalClassAll() {
		
		return service.getNominalClassAll();
	}
	@GetMapping("/getById/{id}")
	public NominalClass getById(@PathVariable String id) {
		
		return service.getNominalClassById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteNominalClass(@PathVariable String id) {
		
		return service.deleteNominalClass(id);
	}
	
	@PutMapping("/update/{id}")
	public NominalClass updateNominalClass(@PathVariable String id,@RequestBody NominalClass st) {
		
		return service.updateNominalClass(id,st);
	}
	@PostMapping("/add")
	public NominalClass addNominalClass(@RequestBody NominalClass st) {
		
		return service.addNominalClass(st);
	}
	
	@PostMapping("/addList")
	public List<NominalClass> addListNominalClass(@RequestBody List<NominalClass> st) {
		
		return service.addListNominalClass(st);
	}
	
	@GetMapping("/getByName/{name_dep}")
	public List<NominalClass> getNominalClassByName(@PathVariable String name_dep) {
		
		return service.getNominalClassByName(name_dep);
	}

}
