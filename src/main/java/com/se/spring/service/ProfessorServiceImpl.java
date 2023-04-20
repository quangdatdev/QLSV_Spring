package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.ProfessorDAO;
import com.se.spring.entity.Professor;

@Service
public class ProfessorServiceImpl implements ProfessorService{
	@Autowired
	private ProfessorDAO dao;
	
	@Override
	@Transactional
	public List<Professor> getProfessorAll() {
		// TODO Auto-generated method stub
		return dao.getProfessorAll();
	}


	@Override
	@Transactional
	public Professor getProfessorById(String id) {
		return dao.getProfessorById(id);
	}


	@Override
	@Transactional
	public String deleteProfessor(String id) {
		// TODO Auto-generated method stub
		return dao.deleteProfessor(id);
	}


	@Override
	@Transactional
	public Professor updateProfessor(Professor st) {
		return dao.updateProfessor(st);
	}


	@Override
	@Transactional
	public Professor addProfessor(Professor st) {
		// TODO Auto-generated method stub
		return dao.addProfessor(st);
	}


	@Override
	@Transactional
	public List<Professor> getProfessorByFaculty(String class_id) {
		// TODO Auto-generated method stub
		return dao.getProfessorByFaculty(class_id);
	}


	@Override
	public List<Professor> addListProfessor(List<Professor> st) {
		// TODO Auto-generated method stub
		return dao.addListProfessor(st);
	}

}