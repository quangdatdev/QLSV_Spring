package com.se.spring.dao;

import java.util.List;

import com.se.spring.entity.Professor;

public interface ProfessorDAO {
	public List<Professor> getProfessorAll();
	public Professor getProfessorById(String id);
	public String deleteProfessor(String id);
	public Professor updateProfessor(String id,Professor st);
	public Professor addProfessor(Professor st);
	public List<Professor> getProfessorByFaculty(String class_id);
	public List<Professor> addListProfessor(List<Professor> listST);
}

