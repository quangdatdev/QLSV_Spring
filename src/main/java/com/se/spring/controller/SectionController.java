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

import com.se.spring.entity.Section;
import com.se.spring.service.SectionService;

@RestController
@RequestMapping("/api/v1/section")
public class SectionController {
	@Autowired
	private SectionService service;

	@GetMapping("/getall")
	public List<Section> getSectionAll() {
		
		return service.getSectionAll();
	}
	@GetMapping("/getById/{id}")
	public Section getById(@PathVariable String id) {
		
		
		return service.getSectionById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSection(@PathVariable String id) {
		
		return service.deleteSection(id);
	}
	
	@PutMapping("/update/{id}")
	public Section updateSection(@PathVariable String id,@RequestBody Section st) {
		
		return service.updateSection(id,st);
	}
	@PostMapping("/add")
	public Section addSection(@RequestBody Section st) {
		
		return service.addSection(st);
	}
	
	@PostMapping("/addList")
	public List<Section> addListSection(@RequestBody List<Section> st) {
		
		return service.addListSection(st);
	}
	
	@GetMapping("/getByCourseId/{class_id}")
	public List<Section> getSectionByCourse(@PathVariable String class_id) {
		
		return service.getSectionByCourse(class_id);
	}
//	@GetMapping("/getByCourseName/{class_id}")
//	public List<Section> getSectionByCourseName(@PathVariable String class_id) {
//		
//		return service.getSectionByCourseName(class_id);
//	}
	
	@GetMapping("/getBySememeters/{year}/{semeters}")
	public List<Section> getSectionBySemeters(@PathVariable String semeters,@PathVariable String year){
	
		return service.getSectionBySemeters(semeters,year);
	}

}
