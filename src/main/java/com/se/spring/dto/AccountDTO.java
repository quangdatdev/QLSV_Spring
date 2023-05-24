package com.se.spring.dto;

public class AccountDTO {

	private String uid;
	private String password;
	public AccountDTO(String uid, String password) {
		super();
		this.uid = uid;
		this.password = password;
	}
	public AccountDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccountDTO [uid=" + uid + ", password=" + password + "]";
	}
	
	
}
