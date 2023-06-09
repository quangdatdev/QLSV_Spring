package com.se.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable String id) {
		
		return service.deleteCourse(id);
	}
	
	@PutMapping("/update/{id}")
	public Course updateCourse(@PathVariable String id, @RequestBody Course st) {
		
		return service.updateCourse(id,st);
	}
	@PostMapping("/add")
	public Course addCourse(@RequestBody Course st) {
		
		return service.addCourse(st);
	}
	
	@PostMapping("/addList")
	public List<Course> addListCourse(@RequestBody List<Course> st) {
		
		return service.addListCourse(st);
	}
	
	@GetMapping("/getByPrerequisite/{class_id}")
	public List<Course> getCourseByClass(@PathVariable String class_id) {
		
		return service.getCourseByPrerequisite(class_id);
	}
}
