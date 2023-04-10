package com.se.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.spring.dao.StudentDAO;
import com.se.spring.entity.SinhVien;

@Service
public class StudentsServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;
	
	@Override
	@Transactional
	public List<SinhVien> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public void createDB() {
		dao.createDB();
		System.out.println("goi serive thanh cong!");
	}

}
