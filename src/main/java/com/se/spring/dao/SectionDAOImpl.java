package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Section;

@Repository
public class SectionDAOImpl implements SectionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Section> getSectionAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Section> query = currentSession.createNativeQuery("select * from Section", Section.class);
		List<Section> lstSection = query.getResultList();
		System.out.println(lstSection.get(0));
		return lstSection;
	}

	@Override
	@Transactional
	public Section getSectionById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
//		Query<Section> query = currentSession.createNativeQuery("select * from Section "
//				+ "where section_id = '"+ id +"'",Section.class);
//		Section lstSection = query.uniqueResult();
		Section rs = currentSession.get(Section.class, id);
		Hibernate.initialize(rs);

		return rs;
	}

	@Override
	@Transactional
	public String deleteSection(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Section temp = currentSession.get(Section.class, id);
		System.out.println("\n\n\n"+temp.toString() + "\n\n\n");
		currentSession.delete(temp);
		return id;
	}

	@Override
	@Transactional
	public Section updateSection(String id, Section st) {
		Session currentSession = sessionFactory.getCurrentSession();
		Section temp = getSectionById(id);
		if (temp == null) {
			return null;
		}
		temp.setCourse(st.getCourse());
		temp.setDayEnd(st.getDayEnd());
		temp.setDayStart(st.getDayStart());
		temp.setProfessor(st.getProfessor());
		temp.setRoom(st.getRoom());
		temp.setSchedule(st.getSchedule());
		temp.setStatus(st.getStatus());
		currentSession.saveOrUpdate(temp);
		return temp;
	}

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
		Query<Section> query = currentSession
				.createNativeQuery("select * from Section " + "where course_id = '" + class_id + "'", Section.class);
		List<Section> lstSection = query.getResultList();
		return lstSection;
	}

	@Override
	@Transactional
	public List<Section> getSectionByCourseName(String name) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Section> query = currentSession.createNativeQuery("SELECT Section.*, Course.*\r\n"
				+ "FROM   Course INNER JOIN\r\n" + "             Section ON Course.course_id = Section.course_id "
				+ "where course_name = '" + name + "'", Section.class);
		List<Section> lstSection = query.getResultList();
		return lstSection;
	}

	@Override
	@Transactional
	public List<Section> getSectionBySemeters(String semeters, String year) {
		Session currentSession = sessionFactory.getCurrentSession();
		String q = " and Schedule.semester like '%" + semeters + "%'";
		if (semeters.equals("0")) {
			q = "";
		}
		Query<Section> query = currentSession.createNativeQuery("SELECT  Section.*\r\n" + "FROM   Course INNER JOIN\r\n"
				+ "             Section ON Course.course_id = Section.course_id INNER JOIN\r\n"
				+ "             Schedule ON Section.schedule_id = Schedule.id " + "where Schedule.years = '" + year
				+ "'" + q, Section.class);
		List<Section> lstSection = query.getResultList();
		return lstSection;

	}

}
