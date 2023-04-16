package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Person;
import com.se.spring.entity.Faculty;

@Repository
public class FacultyDAOImpl implements FacultyDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Faculty> getFacultyAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Faculty> query = currentSession.createNativeQuery("select *  FROM   dbo.Person INNER JOIN\r\n"
				+ "             dbo.Faculty ON dbo.Person.uid = dbo.Faculty.uid",Faculty.class);
		List<Faculty> lstFaculty = query.getResultList();
		System.out.println(lstFaculty.get(0));
		return lstFaculty;
	}

	@Override
	@Transactional
	public Faculty getFacultyById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Faculty> query = currentSession.createNativeQuery("\r\n"
				+ "select *\r\n"
				+ "FROM   dbo.Person INNER JOIN\r\n"
				+ "             dbo.Faculty ON dbo.Person.uid = dbo.Faculty.uid "
				+ "where uid = '"+ id +"'",Faculty.class);
		Faculty lstFaculty = query.uniqueResult();
		return lstFaculty;
	}

	@Override
	@Transactional
	public String deleteFaculty(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Faculty st = new Faculty();
		st.setIdFaculty(id);
		currentSession.delete(st);
		Person p = new Person();
		p.setId(id);
//		currentSession.delete(id, Faculty.class);
//		currentSession.delete(id, Person.class);
//		Query q = currentSession.createQuery("delete Entity where uid ='"+id+"'");
//		Query q1 = currentSession.createQuery("delete Faculty where uid ='"+id+"'");
//		Query q2 = currentSession.createQuery("delete Person where uid ='"+id+"'");
//		q1.executeUpdate();
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
	public List<Faculty> getFacultyByName(String class_id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Faculty> query = currentSession.createNativeQuery("select * \r\n"
				+ "FROM   dbo.Person INNER JOIN\r\n"
				+ "             dbo.Faculty ON dbo.Person.uid = dbo.Faculty.uid\r\n"
				+ "where id_class = '"+ class_id +"'",Faculty.class);
		List<Faculty> lstFaculty = query.getResultList();
		return lstFaculty;
	}
	
	

}