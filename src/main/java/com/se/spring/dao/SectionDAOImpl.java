package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Person;
import com.se.spring.entity.Section;

@Repository
public class SectionDAOImpl implements SectionDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Section> getSectionAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Section> query = currentSession.createNativeQuery("select * from Section",Section.class);
		List<Section> lstSection = query.getResultList();
		System.out.println(lstSection.get(0));
		return lstSection;
	}

	@Override
	@Transactional
	public Section getSectionById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Section> query = currentSession.createNativeQuery("select * from Section "
				+ "where section_id = '"+ id +"'",Section.class);
		Section lstSection = query.uniqueResult();
		return lstSection;
	}

	@Override
	@Transactional
	public String deleteSection(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Section st = new Section();
		st.setId_section(id);
		currentSession.delete(st);
		return id;
	}

	@Override
	@Transactional
	public Section updateSection(String id, Section st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(id, st);
		return st;	}

	@Override
	@Transactional
	public Section addSection(Section st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}
	
	
	@Override
	@Transactional
	public List<Section> addListSection(List<Section> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (Section Section : listST) {
			currentSession.save(Section);
		}
		return listST;
	}
	

	@Override
	@Transactional
	public List<Section> getSectionByCourse(String class_id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Section> query = currentSession.createNativeQuery("select * from Section "
				+ "where course_id = '"+ class_id +"'",Section.class);
		List<Section> lstSection = query.getResultList();
		return lstSection;
	}
	@Override
	@Transactional
	public List<Section> getSectionByCourseName(String name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Section> query = currentSession.createNativeQuery("SELECT Section.*, Course.*\r\n"
				+ "FROM   Course INNER JOIN\r\n"
				+ "             Section ON Course.course_id = Section.course_id "
				+ "where course_name = '"+ name +"'",Section.class);
		List<Section> lstSection = query.getResultList();
		return lstSection;
	}
	
	
	

}
