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

import com.se.spring.dto.EnrollmentDTO;
import com.se.spring.entity.Enrollment;
import com.se.spring.map.Mapper;
import com.se.spring.service.EnrollmentService;

@RestController
@RequestMapping("/api/v1/enrollment")
public class EnrollmentController {

	@Autowired
	private EnrollmentService service;
	
	private Mapper mapper = new Mapper();
	

	@GetMapping("/getall")
	public List<EnrollmentDTO> getEnrollmentAll() {
		
		List<Enrollment> list = service.getEnrollmentAll();
		List<EnrollmentDTO> edto = new ArrayList<>();
		for (Enrollment enrollmentDTO : list) {
			edto.add(mapper.toEnrollmentDTO(enrollmentDTO));
		}
		
		
		return edto;
	}
	@GetMapping("/getByStudentId/{uid}")
	public List<EnrollmentDTO> getByStudentId(@PathVariable String uid) {
		
		List<Enrollment> en = service.getEnrollmentByStudentId(uid);
		List<EnrollmentDTO> list = new ArrayList<>();
		for (Enrollment enrol : en) {
			list.add(mapper.toEnrollmentDTO(enrol));
		}
		
		return list;
	}
	
	@DeleteMapping("/delete/{uid}/{id_section}")
	public String deleteEnrollment(@PathVariable String uid,@PathVariable String id_section) {
		
		return service.deleteEnrollment(uid,id_section);
	}
	
	@PutMapping("/update/{id_section}")
	public Enrollment updateGradeEnrollment(@PathVariable String id_section,@RequestBody EnrollmentDTO edto) {
		
		Enrollment st = mapper.toEnrollment(edto);
		
		return service.updateGradeEnrollment(id_section,st);
	}
	@PostMapping("/add")
	public Enrollment addEnrollment(@RequestBody EnrollmentDTO enrolldto) {
		
		Enrollment st = mapper.toEnrollment(enrolldto);
		return service.addEnrollment(st);
	}
	
	@PostMapping("/addList")
	public List<Enrollment> addListEnrollment(@RequestBody List<EnrollmentDTO> edto) {
		
		List<Enrollment> st = new ArrayList<>();
		for (EnrollmentDTO enrollment : edto) {
			st.add(mapper.toEnrollment(enrollment));
		}
		
		return service.addListEnrollment(st);
	}
	
	@GetMapping("/getBySectionId/{class_id}")
	public List<EnrollmentDTO> getEnrollmentBySectionId(@PathVariable String class_id) {
		List<EnrollmentDTO> edto = new ArrayList<>();
		List<Enrollment> e = service.getEnrollmentBySectionId(class_id);
		for (Enrollment enrollment : e) {
			edto.add(mapper.toEnrollmentDTO(enrollment));
		}
		
		return edto;
	}
	@GetMapping("/getById/{uid}/{id_section}")
	public EnrollmentDTO getEnrollmentById(@PathVariable String uid,@PathVariable String id_section) {
		
		Enrollment en = service.getEnrollmentById(uid, id_section);
		return mapper.toEnrollmentDTO(en);
	}
}
