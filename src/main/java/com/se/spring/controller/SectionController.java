package com.se.spring.controller;

import java.util.ArrayList;
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

import com.se.spring.dto.SectionDTO;
import com.se.spring.entity.Section;
import com.se.spring.map.Mapper;
import com.se.spring.service.SectionService;

@RestController
@RequestMapping("/api/v1/section")
public class SectionController {
	@Autowired
	private SectionService service;
	
	private Mapper mapper = new Mapper();


	@GetMapping("/getall")
	public List<SectionDTO> getSectionAlldto() {
		List<Section> list = service.getSectionAll();
		List<SectionDTO> dsdto = new ArrayList<>();
		for (Section section : list) {
			dsdto.add(mapper.toSectionDto(section));
		}
		return dsdto;
	}
	@GetMapping("/getById/{id}")
	public SectionDTO getById(@PathVariable String id) {
		SectionDTO secdto = mapper.toSectionDto(service.getSectionById(id));
		
		return secdto;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSection(@PathVariable String id) {
		
		return service.deleteSection(id);
	}
	
	@PutMapping("/update/{id}")
	public Section updateSection(@PathVariable String id,@RequestBody SectionDTO stdto) {
		
		Section st = mapper.toSection(stdto);
		return service.updateSection(id,st);
	}
	@PostMapping("/add")
	public Section addSection(@RequestBody SectionDTO sdto) {
		
		Section st = mapper.toSection(sdto);
		
		return service.addSection(st);
	}
	
	@PostMapping("/addList")
	public List<Section> addListSection(@RequestBody List<SectionDTO> stdto) {
		
		List<Section> st = new ArrayList<Section>();
		for (SectionDTO sectionDTO : stdto) {
			st.add(mapper.toSection(sectionDTO));
		}
		return service.addListSection(st);
	}
	
	@GetMapping("/getByCourseId/{class_id}")
	public List<SectionDTO> getSectionByCourse(@PathVariable String class_id) {
		
		List<Section> list =service.getSectionByCourse(class_id);
		List<SectionDTO> dsdto = new ArrayList<>();
		for (Section section : list) {
			dsdto.add(mapper.toSectionDto(section));
		}
		return dsdto;
	}
//	@GetMapping("/getByCourseName/{class_id}")
//	public List<Section> getSectionByCourseName(@PathVariable String class_id) {
//		
//		return service.getSectionByCourseName(class_id);
//	}
	
	@GetMapping("/getBySememeters/{year}/{semeters}")
	public List<SectionDTO> getSectionBySemeters(@PathVariable String semeters,@PathVariable String year){
	
		List<Section> list =service.getSectionBySemeters(semeters,year);
		List<SectionDTO> dsdto = new ArrayList<>();
		for (Section section : list) {
			dsdto.add(mapper.toSectionDto(section));
		}
		return dsdto;
	}
	

}
