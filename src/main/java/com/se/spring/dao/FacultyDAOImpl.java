package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Faculty;

@Repository
public class FacultyDAOImpl implements FacultyDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Faculty> getFacultyAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Faculty> query = currentSession.createNativeQuery("select *  FROM   Faculty",Faculty.class);
		List<Faculty> lstFaculty = query.getResultList();
		System.out.println(lstFaculty.get(0));
		return lstFaculty;
	}

	@Override
	@Transactional
	public Faculty getFacultyById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Faculty> query = currentSession.createNativeQuery("SELECT Faculty.*\r\n"
				+ "FROM   Faculty"
				+ "where id_faculty = '"+ id +"'",Faculty.class);
		Faculty lstFaculty = query.uniqueResult();
		return lstFaculty;
	}

	@Override
	@Transactional
	public String deleteFaculty(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(id,Faculty.class);
		return id;
	}

	@Override
	@Transactional
	public Faculty updateFaculty(String id, Faculty st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(id, st);
		return st;	}

	@Override
	@Transactional
	public Faculty addFaculty(Faculty st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}
	
	
	@Override
	@Transactional
	public List<Faculty> addListFaculty(List<Faculty> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (Faculty Faculty : listST) {
			currentSession.save(Faculty);
		}
		return listST;
	}
	

	@Override
	@Transactional
	public List<Faculty> getFacultyByName(String name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Faculty> query = currentSession.createNativeQuery("SELECT Faculty.*\r\n"
				+ "FROM   Faculty"
				+ "where name_faculty = '"+ name +"'",Faculty.class);
		List<Faculty> lstFaculty = query.getResultList();
		return lstFaculty;
	}
	
	

}