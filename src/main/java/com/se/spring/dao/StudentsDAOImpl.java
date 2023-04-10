package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.SinhVien;

@Repository
public class StudentsDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<SinhVien> getAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SinhVien> query = currentSession.createNativeQuery("select *  from SinhVien",SinhVien.class);
		List<SinhVien> lstSanPham = query.getResultList();
		return lstSanPham;
	}

	@Override
	@Transactional
	public void createDB() {
		Session currentSession = sessionFactory.getCurrentSession();
		
	}

}
