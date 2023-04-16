package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.spring.entity.Department;
import com.se.spring.entity.Department;
import com.se.spring.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController{

	@Autowired
	private DepartmentService service;
	

	@GetMapping("/getall")
	public List<Department> getDepartmentAll() {
		
		return service.getDepartmentAll();
	}
	@GetMapping("/getById")
	public Department getById(String id) {
		
		return service.getDepartmentById(id);
	}
	
	@PostMapping("/delete")
	public String deleteDepartment(String id) {
		
		return service.deleteDepartment(id);
	}
	
	@GetMapping("/update")
	public Department updateDepartment(String id,Department st) {
		
		return service.updateDepartment(id,st);
	}
	@PostMapping("/add")
	public Department addDepartment(Department st) {
		
		return service.addDepartment(st);
	}
	
	@PostMapping("/addList")
	public List<Department> addListDepartment(List<Department> st) {
		
		return service.addListDepartment(st);
	}
	
	@GetMapping("/getByName")
	public List<Department> getDepartmentByName(String name_dep) {
		
		return service.getDepartmentByName(name_dep);
	}

}
