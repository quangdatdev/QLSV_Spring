package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.CourseDAO;
import com.se.spring.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseDAO dao;
	
	@Override
	@Transactional
	public List<Course> getCourseAll() {
		// TODO Auto-generated method stub
		return dao.getCourseAll();
	}


	@Override
	@Transactional
	public Course getCourseById(String id) {
		return dao.getCourseById(id);
	}


	@Override
	@Transactional
	public String deleteCourse(String id) {
		// TODO Auto-generated method stub
		return dao.deleteCourse(id);
	}


	@Override
	@Transactional
	public Course updateCourse( Course st) {
		return dao.updateCourse(st);
	}


	@Override
	@Transactional
	public Course addCourse(Course st) {
		// TODO Auto-generated method stub
		return dao.addCourse(st);
	}


	@Override
	@Transactional
	public List<Course> getCourseByPrerequisite(String class_id) {
		// TODO Auto-generated method stub
		return dao.getCourseByPrerequisite(class_id);
	}


	@Override
	public List<Course> addListCourse(List<Course> st) {
		// TODO Auto-generated method stub
		return dao.addListCourse(st);
	}

}
