package com.se.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Schedule")
public class Schedule implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -59729752722037356L;
	@Id
	@Column(columnDefinition = "nvarchar(255)")
	private String id;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String semester;
	@Column(columnDefinition = "nvarchar(255)", nullable = true)
	private String years;
	
	/**
	 * Ca hoc
	 */
	private String shift;
	
	/**
	 * thứ trong tuần
	 */
	private String onDay;
	
	@OneToMany(mappedBy = "schedule",fetch = FetchType.EAGER)
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
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getOnDay() {
		return onDay;
	}
	public void setOnDay(String onDay) {
		this.onDay = onDay;
	}
	
	
}
