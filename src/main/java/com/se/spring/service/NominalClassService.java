package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.NominalClass;

public interface NominalClassService {
	public List<NominalClass> getNominalClassAll();
	public NominalClass getNominalClassById(String id);
	public String deleteNominalClass(String id);
	public NominalClass updateNominalClass(String id,NominalClass st);
	public NominalClass addNominalClass(NominalClass st);
	public List<NominalClass> getNominalClassByName(String class_id);
	public List<NominalClass> addListNominalClass(List<NominalClass> st);
}