package com.se.spring.dao;

import java.util.List;

import com.se.spring.entity.Faculty;

public interface FacultyDAO {
	public List<Faculty> getFacultyAll();
	public Faculty getFacultyById(String id);
	public String deleteFaculty(String id);
	public Faculty updateFaculty(String id,Faculty st);
	public Faculty addFaculty(Faculty st);
	public List<Faculty> getFacultyByName(String name);
	public List<Faculty> addListFaculty(List<Faculty> st);
}
