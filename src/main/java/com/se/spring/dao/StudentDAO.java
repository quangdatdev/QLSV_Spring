package com.se.spring.dao;

import java.util.List;

import com.se.spring.entity.SinhVien;

public interface StudentDAO {

	public List<SinhVien> getAll();
	public void createDB();
}
