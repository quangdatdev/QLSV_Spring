package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.FacultyDAO;
import com.se.spring.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	private FacultyDAO dao;

	@Override
	@Transactional
	public List<Faculty> getFacultyAll() {
		// TODO Auto-generated method stub
		return dao.getFacultyAll();
	}

	@Override
	@Transactional
	public Faculty getFacultyById(String id) {
		return dao.getFacultyById(id);
	}

	@Override
	@Transactional
	public String deleteFaculty(String id) {
		// TODO Auto-generated method stub
		return dao.deleteFaculty(id);
	}

	@Override
	@Transactional
	public Faculty updateFaculty(String id, Faculty st) {
		return dao.updateFaculty(id, st);
	}

	@Override
	@Transactional
	public Faculty addFaculty(Faculty st) {
		// TODO Auto-generated method stub
		return dao.addFaculty(st);
	}

	@Override
	@Transactional
	public List<Faculty> getFacultyByName(String class_id) {
		// TODO Auto-generated method stub
		return dao.getFacultyByName(class_id);
	}

	@Override
	public List<Faculty> addListFaculty(List<Faculty> st) {
		// TODO Auto-generated method stub
		return dao.addListFaculty(st);
	}

}
