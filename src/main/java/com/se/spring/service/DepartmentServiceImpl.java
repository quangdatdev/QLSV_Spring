package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.DepartmentDAO;
import com.se.spring.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentDAO dao;
	
	@Override
	@Transactional
	public List<Department> getDepartmentAll() {
		// TODO Auto-generated method stub
		return dao.getDepartmentAll();
	}


	@Override
	@Transactional
	public Department getDepartmentById(String id) {
		return dao.getDepartmentById(id);
	}


	@Override
	@Transactional
	public String deleteDepartment(String id) {
		// TODO Auto-generated method stub
		return dao.deleteDepartment(id);
	}


	@Override
	@Transactional
	public Department updateDepartment(String id, Department st) {
		return dao.updateDepartment(id,st);
	}


	@Override
	@Transactional
	public Department addDepartment(Department st) {
		// TODO Auto-generated method stub
		return dao.addDepartment(st);
	}


	@Override
	@Transactional
	public List<Department> getDepartmentByName(String day, String lau, String phong) {
		// TODO Auto-generated method stub
		return dao.getDepartmentByName( day,lau,  phong);
	}


	@Override
	public List<Department> addListDepartment(List<Department> st) {
		// TODO Auto-generated method stub
		return dao.addListDepartment(st);
	}
}
