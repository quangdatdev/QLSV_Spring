package com.se.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Department")
public class Department implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -187027009025687584L;
	@Id
	@Column(columnDefinition = "nvarchar(255)")
	private String id_dep;
	@Column(columnDefinition = "nvarchar(255)",nullable = true)
	private String name_dep;
	@Column(nullable = true)
	private int noOfSeat;
	
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(String id_dep, String name_dep, int noOfSeat) {
		super();
		this.id_dep = id_dep;
		this.name_dep = name_dep;
		this.noOfSeat = noOfSeat;
	}
	public String getId_dep() {
		return id_dep;
	}
	public void setId_dep(String id_dep) {
		this.id_dep = id_dep;
	}
	public String getName_dep() {
		return name_dep;
	}
	public void setName_dep(String name_dep) {
		this.name_dep = name_dep;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	@Override
	public String toString() {
		return "Department [id_dep=" + id_dep + ", name_dep=" + name_dep + ", noOfSeat=" + noOfSeat + "]";
	}
	
	
}
