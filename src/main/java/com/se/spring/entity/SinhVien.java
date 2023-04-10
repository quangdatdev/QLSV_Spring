package com.se.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SinhVien")
public class SinhVien {

	@Id
	@Column(name = "masv")
	private int masv;
	@Column(name = "tensv")
	private String tensv;
	@Column(name = "email")
	private String email;
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getTensv() {
		return tensv;
	}
	public void setTensv(String tensv) {
		this.tensv = tensv;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public SinhVien(int masv, String tensv, String email) {
		super();
		this.masv = masv;
		this.tensv = tensv;
		this.email = email;
	}
	public SinhVien() {
		super();
	}
	
	
	
	
	
}
