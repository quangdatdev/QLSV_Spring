package com.se.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Department")
public class Department {

	
	@Id
	private String id_dep;
	private String name_dep;
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
	
	
}
