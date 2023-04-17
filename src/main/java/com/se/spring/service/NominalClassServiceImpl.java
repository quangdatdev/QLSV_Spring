package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.NominalClassDAO;
import com.se.spring.entity.NominalClass;

@Service
public class NominalClassServiceImpl implements NominalClassService{
	@Autowired
	private NominalClassDAO dao;
	
	@Override
	@Transactional
	public List<NominalClass> getNominalClassAll() {
		// TODO Auto-generated method stub
		return dao.getNominalClassAll();
	}


	@Override
	@Transactional
	public NominalClass getNominalClassById(String id) {
		return dao.getNominalClassById(id);
	}


	@Override
	@Transactional
	public String deleteNominalClass(String id) {
		// TODO Auto-generated method stub
		return dao.deleteNominalClass(id);
	}


	@Override
	@Transactional
	public NominalClass updateNominalClass(String id, NominalClass st) {
		return dao.updateNominalClass(id,st);
	}


	@Override
	@Transactional
	public NominalClass addNominalClass(NominalClass st) {
		// TODO Auto-generated method stub
		return dao.addNominalClass(st);
	}


	@Override
	@Transactional
	public List<NominalClass> getNominalClassByName(String class_id) {
		// TODO Auto-generated method stub
		return dao.getNominalClassByName(class_id);
	}


	@Override
	public List<NominalClass> addListNominalClass(List<NominalClass> st) {
		// TODO Auto-generated method stub
		return dao.addListNominalClass(st);
	}
}
