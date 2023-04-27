package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Professor;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Professor> getProfessorAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Professor> query = currentSession.createNativeQuery("SELECT Person.*, Professor.*\r\n"
				+ "FROM   Professor INNER JOIN\r\n" + "             Person ON Professor.uid = Person.uid",
				Professor.class);
		List<Professor> lstProfessor = query.getResultList();
		System.out.println(lstProfessor.get(0));
		return lstProfessor;
	}

	@Override
	@Transactional
	public Professor getProfessorById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Professor> query = currentSession.createNativeQuery(
				"SELECT *\r\n" + "FROM   Professor INNER JOIN\r\n"
						+ "             Person ON Professor.uid = Person.uid " + "where Professor.uid = '" + id + "'",
				Professor.class);
		Professor lstProfessor = query.uniqueResult();
		return lstProfessor;
	}

	@Override
	@Transactional
	public String deleteProfessor(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Professor temp = currentSession.get(Professor.class, id);
		currentSession.delete(temp);
		return id;
	}

	@Override
	@Transactional
	public Professor updateProfessor(String id, Professor st) {
		Session currentSession = sessionFactory.getCurrentSession();
		Professor temp = getProfessorById(id);
		if (temp == null) {
			return null;
		}
		temp.setFristName(st.getFristName());
		temp.setLastName(st.getLastName());
		temp.setNumCI(st.getNumCI());
		temp.setDateOfBirth(st.getDateOfBirth());
		temp.setPhone(st.getPhone());
		temp.setEmail(st.getEmail());
		temp.setAddress(st.getAddress());
		temp.setStatus(st.getStatus());
		temp.setTitle(st.getTitle());
		temp.setDegree(st.getDegree());

		currentSession.saveOrUpdate(temp);
		return temp;
	}

	@Override
	@Transactional
	public Professor addProfessor(Professor st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}

	@Override
	@Transactional
	public List<Professor> addListProfessor(List<Professor> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (Professor Professor : listST) {
			currentSession.save(Professor);
		}
		return listST;
	}

	@Override
	@Transactional
	public List<Professor> getProfessorByFaculty(String class_id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Professor> query = currentSession.createNativeQuery("select * \r\n" + "FROM   Person INNER JOIN\r\n"
				+ "             Professor ON Person.uid = Professor.uid\r\n" + "where id_faculty = '" + class_id + "'",
				Professor.class);
		List<Professor> lstProfessor = query.getResultList();
		return lstProfessor;
	}

}
