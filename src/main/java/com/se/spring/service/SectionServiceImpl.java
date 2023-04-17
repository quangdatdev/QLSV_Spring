package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.SectionDAO;
import com.se.spring.entity.Section;

@Service
public class SectionServiceImpl implements SectionService{
	@Autowired
	private SectionDAO dao;
	
	@Override
	@Transactional
	public List<Section> getSectionAll() {
		// TODO Auto-generated method stub
		return dao.getSectionAll();
	}


	@Override
	@Transactional
	public Section getSectionById(String id) {
		return dao.getSectionById(id);
	}


	@Override
	@Transactional
	public String deleteSection(String id) {
		// TODO Auto-generated method stub
		return dao.deleteSection(id);
	}


	@Override
	@Transactional
	public Section updateSection(String id, Section st) {
		return dao.updateSection(id,st);
	}


	@Override
	@Transactional
	public Section addSection(Section st) {
		// TODO Auto-generated method stub
		return dao.addSection(st);
	}


	@Override
	@Transactional
	public List<Section> getSectionByCourse(String class_id) {
		// TODO Auto-generated method stub
		return dao.getSectionByCourse(class_id);
	}


	@Override
	public List<Section> addListSection(List<Section> st) {
		// TODO Auto-generated method stub
		return dao.addListSection(st);
	}


	@Override
	public List<Section> getSectionByCourseName(String course_name) {
		// TODO Auto-generated method stub
		return dao.getSectionByCourseName(course_name);
	}

}
