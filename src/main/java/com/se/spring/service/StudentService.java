package com.se.spring.service;

import java.util.List;

import com.se.spring.entity.SinhVien;

public interface StudentService {
	public List<SinhVien> getAll();
	public void createDB();
}
