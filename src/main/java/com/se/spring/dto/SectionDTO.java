package com.se.spring.dto;

import java.util.List;

import com.se.spring.entity.Course;
import com.se.spring.entity.Department;
import com.se.spring.entity.Enrollment;
import com.se.spring.entity.Professor;
import com.se.spring.entity.Schedule;

public class SectionDTO {
	private String id_section;
	private String dayStart;
	private String dayEnd;
	private String status;
	private Department room;
	private Course course;
	private Professor professor;
	private Schedule schedule;
	public String getId_section() {
		return id_section;
	}
	public void setId_section(String id_section) {
		this.id_section = id_section;
	}
	public String getDayStart() {
		return dayStart;
	}
	public void setDayStart(String dayStart) {
		this.dayStart = dayStart;
	}
	public String getDayEnd() {
		return dayEnd;
	}
	public void setDayEnd(String dayEnd) {
		this.dayEnd = dayEnd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Department getRoom() {
		return room;
	}
	public void setRoom(Department room) {
		this.room = room;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public SectionDTO(String id_section, String dayStart, String dayEnd, String status, Department room,
			 Course course, Professor professor, Schedule schedule) {
		this.id_section = id_section;
		this.dayStart = dayStart;
		this.dayEnd = dayEnd;
		this.status = status;
		this.room = room;
		this.course = course;
		this.professor = professor;
		this.schedule = schedule;
	}
	public SectionDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
