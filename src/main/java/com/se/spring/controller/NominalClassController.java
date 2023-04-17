package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	@GetMapping("/getById")
	public NominalClass getById(String id) {
		
		return service.getNominalClassById(id);
	}
	
	@PostMapping("/delete")
	public String deleteNominalClass(String id) {
		
		return service.deleteNominalClass(id);
	}
	
	@GetMapping("/update")
	public NominalClass updateNominalClass(String id,NominalClass st) {
		
		return service.updateNominalClass(id,st);
	}
	@PostMapping("/add")
	public NominalClass addNominalClass(NominalClass st) {
		
		return service.addNominalClass(st);
	}
	
	@PostMapping("/addList")
	public List<NominalClass> addListNominalClass(List<NominalClass> st) {
		
		return service.addListNominalClass(st);
	}
	
	@GetMapping("/getByName")
	public List<NominalClass> getNominalClassByName(String name_dep) {
		
		return service.getNominalClassByName(name_dep);
	}

}
