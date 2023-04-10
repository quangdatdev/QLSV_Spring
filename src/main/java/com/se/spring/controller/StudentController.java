package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.spring.entity.SinhVien;
import com.se.spring.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/student")
	public List<SinhVien> getAll() {
		
		return service.getAll();
	}
	@GetMapping("/create")
	public void createDB() {
		service.createDB();
	}

}
