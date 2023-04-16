package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.Department;



public interface DepartmentService {
	public List<Department> getDepartmentAll();
	public Department getDepartmentById(String id);
	public String deleteDepartment(String id);
	public Department updateDepartment(String id,Department st);
	public Department addDepartment(Department st);
	public List<Department> getDepartmentByName(String class_id);
	public List<Department> addListDepartment(List<Department> st);
}
