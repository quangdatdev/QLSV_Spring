package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.Section;

public interface SectionService {
	public List<Section> getSectionAll();
	public Section getSectionById(String id);
	public String deleteSection(String id);
	public Section updateSection(String id,Section st);
	public Section addSection(Section st);
	public List<Section> getSectionByCourse(String class_id);
	public List<Section> addListSection(List<Section> st);
	List<Section> getSectionByCourseName(String course_name);
	public List<Section> getSectionBySemeters(String semeters, String year);
}
