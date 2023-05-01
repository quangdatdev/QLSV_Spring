package com.se.spring.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "Section")
public class Section {

	@Id
	@Column(columnDefinition = "nvarchar(100)")
	private String section_id;
	@Column(columnDefinition = "nvarchar(255)")
	private String dayStart;
	@Column(columnDefinition = "nvarchar(255)")
	private String dayEnd;
	@Column(columnDefinition = "nvarchar(255)",nullable = true)
	private String status;
	
	@ManyToOne
	@JoinColumn(name ="room")
	@JsonIgnore
	private Department room;
	
	@OneToMany(mappedBy = "section")
	@JsonIgnore
	private List<Enrollment> enrollments;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	@JsonIgnore
	private Course course;
	
	
	@ManyToOne
	@JoinColumn(name = "uid_professor")
	@JsonIgnore
	private Professor professor;

	@ManyToOne
	@JsonIgnore
	private Schedule schedule;
	
	public String getId_section() {
		return section_id;
	}

	public void setId_section(String id_section) {
		this.section_id = id_section;
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

	public Section(String id_section, String dayStart, String dayEnd, String status) {
		super();
		this.section_id = id_section;
		this.dayStart = dayStart;
		this.dayEnd = dayEnd;
		this.status = status;
	}
	

	public Section(String section_id, String dayStart, String dayEnd, String status, Department room,
			 Course course, Professor professor, Schedule schedule) {
		super();
		this.section_id = section_id;
		this.dayStart = dayStart;
		this.dayEnd = dayEnd;
		this.status = status;
		this.room = room;
		this.course = course;
		this.professor = professor;
		this.schedule = schedule;
	}

	public Section() {
	}

	@Override
	public String toString() {
		return "Section [section_id=" + section_id + ", dayStart=" + dayStart + ", dayEnd=" + dayEnd + ", status="
				+ status + ", room=" + room.getId_dep() + ", enrollments=" + enrollments + ", course=" + course.getCourse_id() + ", professor="
				+ professor.getUid() + "]";
	}
	
}
