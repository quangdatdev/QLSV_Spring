package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.spring.entity.Course;
import com.se.spring.service.CourseService;


@RestController
@RequestMapping("api/v1/course")
public class CourseController {

	@Autowired
	private CourseService service;

	@GetMapping("/getall")
	public List<Course> getCourseAll() {
		
		return service.getCourseAll();
	}
	@GetMapping("/getById/{id}")
	public Course getById(@PathVariable String id) {
		
		
		return service.getCourseById(id);
	}
	
	@PostMapping("/delete/{id}")
	public String deleteCourse(@PathVariable String id) {
		
		return service.deleteCourse(id);
	}
	
	@PutMapping("/update")
	public Course updateCourse(@PathVariable Course st) {
		
		return service.updateCourse(st);
	}
	@PostMapping("/add")
	public Course addCourse(Course st) {
		
		return service.addCourse(st);
	}
	
	@PostMapping("/addList")
	public List<Course> addListCourse(List<Course> st) {
		
		return service.addListCourse(st);
	}
	
	@GetMapping("/getByPrerequisite/{class_id}")
	public List<Course> getCourseByClass(@PathVariable String class_id) {
		
		return service.getCourseByPrerequisite(class_id);
	}
}
