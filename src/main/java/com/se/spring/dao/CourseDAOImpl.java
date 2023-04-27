package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Course;

@Repository
public class CourseDAOImpl implements CourseDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Course> getCourseAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Course> query = currentSession.createNativeQuery(
				"SELECT Course.*, Prerequisite_Course.prerequisite\r\n" + "FROM   Course INNER JOIN\r\n"
						+ "             Prerequisite_Course ON Course.course_id = Prerequisite_Course.course_id",
				Course.class);
		List<Course> lstCourse = query.getResultList();
		return lstCourse;
	}

	@Override
	@Transactional
	public Course getCourseById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Course> query = currentSession
				.createNativeQuery("SELECT Course.*, prerequisite\r\n" + "FROM   Course INNER JOIN\r\n"
						+ " Prerequisite_Course ON Course.course_id = Prerequisite_Course.course_id"
						+ " where Course.course_id = '" + id + "'", Course.class);
		Course lstCourse = query.uniqueResult();
		return lstCourse;
	}

	@Override
	@Transactional
	public String deleteCourse(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Course temp = currentSession.get(Course.class, id);
		currentSession.delete(temp);
		return id;
	}

	@Override
	@Transactional
	public Course updateCourse(String id, Course st) {
		Session currentSession = sessionFactory.getCurrentSession();
		Course temp = getCourseById(id);
		if (temp == null) {
			return null;
		}
		temp.setCourse_name(st.getCourse_name());
		temp.setCredits(st.getCredits());
		temp.setDesrciption(st.getDesrciption());
		temp.setPrerequisites(st.getPrerequisites());

		currentSession.saveOrUpdate(temp);
		return temp;
	}

	@Override
	@Transactional
	public Course addCourse(Course st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}

	@Override
	@Transactional
	public List<Course> addListCourse(List<Course> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (Course Course : listST) {
			currentSession.save(Course);
		}
		return listST;
	}

	@Override
	@Transactional
	public List<Course> getCourseByPrerequisite(String class_id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Course> query = currentSession
				.createNativeQuery("SELECT Course.*, prerequisite\r\n" + "FROM   Course INNER JOIN\r\n"
						+ "             Prerequisite_Course ON Course.course_id = Prerequisite_Course.course_id\r\n"
						+ "\r\n" + "where prerequisite = '" + class_id + "'", Course.class);
		List<Course> lstCourse = query.getResultList();
		return lstCourse;
	}
}
