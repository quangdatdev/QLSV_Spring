package com.se.spring.dao;

import java.util.List;

import com.se.spring.entity.Course;

public interface CourseDAO {
	Course getCourseById(String id);

	List<Course> getCourseAll();

	String deleteCourse(String id);

	Course updateCourse( Course st);

	Course addCourse(Course st);

	List<Course> addListCourse(List<Course> st);

	List<Course> getCourseByPrerequisite(String class_id);

}
