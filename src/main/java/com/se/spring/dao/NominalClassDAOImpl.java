package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.NominalClass;

@Repository
public class NominalClassDAOImpl implements NominalClassDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<NominalClass> getNominalClassAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<NominalClass> query = currentSession.createNativeQuery("select *  from NominalClass", NominalClass.class);
		List<NominalClass> lstNominalClass = query.getResultList();
		System.out.println(lstNominalClass.get(0));
		return lstNominalClass;
	}

	@Override
	@Transactional
	public NominalClass getNominalClassById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<NominalClass> query = currentSession.createNativeQuery(
				"select *  from NominalClass " + "where id_class = '" + id + "'",
				NominalClass.class);
		NominalClass lstNominalClass = query.uniqueResult();
		return lstNominalClass;
	}

	@Override
	@Transactional
	public String deleteNominalClass(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(id, NominalClass.class);
		return id;
	}

	@Override
	@Transactional
	public NominalClass updateNominalClass(String id, NominalClass st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(id, st);
		return st;
	}

	@Override
	@Transactional
	public NominalClass addNominalClass(NominalClass st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}

	@Override
	@Transactional
	public List<NominalClass> addListNominalClass(List<NominalClass> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (NominalClass NominalClass : listST) {
			currentSession.save(NominalClass);
		}
		return listST;
	}

	@Override
	@Transactional
	public List<NominalClass> getNominalClassByName(String class_name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<NominalClass> query = currentSession.createNativeQuery(
				"select *  from NominalClass " + "where name_class = '" + class_name + "'", NominalClass.class);
		List<NominalClass> lstNominalClass = query.getResultList();
		return lstNominalClass;
	}

}