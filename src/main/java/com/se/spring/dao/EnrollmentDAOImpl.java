package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Enrollment;

@Repository
public class EnrollmentDAOImpl implements EnrollmentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Enrollment> getEnrollmentAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Enrollment> query = currentSession.createNativeQuery("select *  FROM   Enrollment", Enrollment.class);
		List<Enrollment> lstEnrollment = query.getResultList();
		return lstEnrollment;
	}

	@Override
	@Transactional
	public List<Enrollment> getEnrollmentByStudentId(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Enrollment> query = currentSession
				.createNativeQuery("select *  FROM   Enrollment" + " where uid = '" + id + "'", Enrollment.class);
		 List<Enrollment> lstEnrollment = query.getResultList();
		return lstEnrollment;
	}

	@Override
	@Transactional
	public String deleteEnrollment(String uid,String id_section) {

		Session currentSession = sessionFactory.getCurrentSession();
		Enrollment temp = getEnrollmentById(uid, id_section);
		currentSession.delete(temp);
		return id_section;
	}

	@Override
	@Transactional
	public Enrollment updateGradeEnrollment(String id_section,Enrollment st) {
		Session currentSession = sessionFactory.getCurrentSession();
		Enrollment temp = getEnrollmentBySectionId(id_section).get(0);
		if (temp ==null) {
			return null;
		}
		temp.setDateEnrollment(st.getDateEnrollment());
		temp.setGradle1(st.getGradle1());
		temp.setGradle2(st.getGradle2());
		temp.setGradle3(st.getGradle3());
		temp.setStatus(st.getStatus());
		currentSession.saveOrUpdate(temp);
		
		return temp;

	}

	@Override
	@Transactional
	public Enrollment addEnrollment(Enrollment st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}

	@Override
	@Transactional
	public List<Enrollment> addListEnrollment(List<Enrollment> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (Enrollment Enrollment : listST) {
			currentSession.save(Enrollment);
		}
		return listST;
	}

	@Override
	@Transactional
	public List<Enrollment> getEnrollmentBySectionId(String name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Enrollment> query = currentSession.createNativeQuery(
				"select *  FROM   Enrollment " + "where id_section = '" + name + "'", Enrollment.class);
		List<Enrollment> lstEnrollment = query.getResultList();
		return lstEnrollment;
	}

	@Override
	@Transactional
	public Enrollment getEnrollmentById(String uid, String id_section) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Enrollment> query = currentSession.createNativeQuery(
				"select * from Enrollment\r\n"
				+ "where uid = '"+uid+"'\r\n"
				+ "and id_section = '"+id_section+"'", Enrollment.class);
		Enrollment lstEnrollment = query.uniqueResult();
		return lstEnrollment;
	}

}
