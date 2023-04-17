package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	@GetMapping("/getById")
	public Section getById(String id) {
		
		
		return service.getSectionById(id);
	}
	
	@PostMapping("/delete")
	public String deleteSection(String id) {
		
		return service.deleteSection(id);
	}
	
	@GetMapping("/update")
	public Section updateSection(String id,Section st) {
		
		return service.updateSection(id,st);
	}
	@PostMapping("/add")
	public Section addSection(Section st) {
		
		return service.addSection(st);
	}
	
	@PostMapping("/addList")
	public List<Section> addListSection(List<Section> st) {
		
		return service.addListSection(st);
	}
	
	@GetMapping("/getByCourseId")
	public List<Section> getSectionByCourse(String class_id) {
		
		return service.getSectionByCourse(class_id);
	}
	@GetMapping("/getByCourseName")
	public List<Section> getSectionByCourseName(String class_id) {
		
		return service.getSectionByCourseName(class_id);
	}

}
