package com.se.spring.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "Section")
public class Section implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -140470656491426513L;
	@Id
	@Column(columnDefinition = "nvarchar(255)")
	private String section_id;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String dayStart;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String dayEnd;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="room")
	@JsonBackReference
	private Department room;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Enrollment> enrollments;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id")
	@JsonBackReference
	private Course course;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "uid_professor")
	@JsonBackReference
	private Professor professor;

	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	private Schedule schedule;

	public String getSection_id() {
		return section_id;
	}

	public void setSection_id(String section_id) {
		this.section_id = section_id;
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

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
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

	public Section(String section_id, String dayStart, String dayEnd, String status, Department room,
			List<Enrollment> enrollments, Course course, Professor professor, Schedule schedule) {
		super();
		this.section_id = section_id;
		this.dayStart = dayStart;
		this.dayEnd = dayEnd;
		this.status = status;
		this.room = room;
		this.enrollments = enrollments;
		this.course = course;
		this.professor = professor;
		this.schedule = schedule;
	}

	public Section() {
		super();
	}

	@Override
	public String toString() {
		return "Section [section_id=" + section_id + ", dayStart=" + dayStart + ", dayEnd=" + dayEnd + ", status="
				+ status + ", room=" + room.getId_dep() + ", enrollments=" + enrollments + ", course=" + course.getCourse_id() + ", professor="
				+ professor.getUid() + ", schedule=" + schedule.getId() + "]";
	}
	
	
	
}
