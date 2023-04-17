package com.se.spring.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "Section")
public class Section {

	@Id
	private String section_id;
	private String dayStart;
	private String dayEnd;
	private String status;
	
	@ManyToOne
	@JoinColumn(name ="room")
	private Department room;
	
	@OneToMany(mappedBy = "section")
	private List<Enrollment> enrollments;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	
	@ManyToOne
	@JoinColumn(name = "uid_professor")
	private Professor professor;

	@ManyToOne
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

	public Section(String id_section, String dayStart, String dayEnd, String status) {
		super();
		this.section_id = id_section;
		this.dayStart = dayStart;
		this.dayEnd = dayEnd;
		this.status = status;
	}

	public Section() {
	}

	@Override
	public String toString() {
		return "Section [section_id=" + section_id + ", dayStart=" + dayStart + ", dayEnd=" + dayEnd + ", status="
				+ status + ", room=" + room.getId_dep() + ", enrollments=" + enrollments + ", course=" + course.getCourse_id() + ", professor="
				+ professor.getId() + "]";
	}
	
}
