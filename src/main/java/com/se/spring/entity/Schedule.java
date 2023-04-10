package com.se.spring.entity;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Schedule {
	
	@Id
	private String id;
	private String semester;
	private String years;
	
	@ManyToOne
	@JoinColumn(name = "list_section")
	private List<Section> list_section;
	public Schedule() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public List<Section> getList_section() {
		return list_section;
	}
	public void setList_section(List<Section> list_section) {
		this.list_section = list_section;
	}
	
}
