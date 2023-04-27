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
	@GetMapping("/getById/{id}")
	public Department getById(@PathVariable String id) {
		
		return service.getDepartmentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable String id) {
		
		return service.deleteDepartment(id);
	}
	
	@PutMapping("/update/{id}")
	public Department updateDepartment(@PathVariable String id,@RequestBody Department st) {
		System.out.println(st.toString());
		return service.updateDepartment(id,st);
	}
	@PostMapping("/add")
	public Department addDepartment(@RequestBody Department st) {
		
		return service.addDepartment(st);
	}
	
	@PostMapping("/addList")
	public List<Department> addListDepartment( @RequestBody List<Department> st) {
		
		return service.addListDepartment(st);
	}
	
	@GetMapping("/getByName/{day}/{lau}/{phong}")
	public List<Department> getDepartmentByName(@PathVariable String day,@PathVariable String lau,@PathVariable String phong) {
		
		return service.getDepartmentByName(day,lau,phong);
	}

}
