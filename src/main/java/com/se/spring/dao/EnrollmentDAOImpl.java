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
		System.out.println("HEllo");
		return lstEnrollment;
	}

	@Override
	@Transactional
	public Enrollment getEnrollmentByStudentId(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Enrollment> query = currentSession
				.createNativeQuery("select *  FROM   Enrollment" + " where uid = '" + id + "'", Enrollment.class);
		Enrollment lstEnrollment = query.uniqueResult();
		return lstEnrollment;
	}

	@Override
	@Transactional
	public String deleteEnrollment(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(id, Enrollment.class);
		return id;
	}

	@Override
	@Transactional
	public Enrollment updateGradeEnrollment(Enrollment st) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Enrollment> query = currentSession.createNativeQuery(
				"UPDATE [dbo].[Enrollment] " + "   SET [gradle] = " + st.getGradle() + " where uid = '"
						+ st.getStudent().getId() + "' and id_section= '" + st.getSection().getId_section() + "'",
				Enrollment.class);
		int rs = 0;
		rs = query.executeUpdate();
		if (rs == 0) {
			return null;
		}
		return st;

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

}
