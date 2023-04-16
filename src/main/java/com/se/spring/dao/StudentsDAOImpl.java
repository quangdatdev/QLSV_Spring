package com.se.spring.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Person;
import com.se.spring.entity.Student;

@Repository
public class StudentsDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Student> getStudentAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createNativeQuery("select *  FROM   dbo.Person INNER JOIN\r\n"
				+ "             dbo.Student ON dbo.Person.uid = dbo.Student.uid",Student.class);
		List<Student> lstStudent = query.getResultList();
		System.out.println(lstStudent.get(0));
		return lstStudent;
	}

	@Override
	@Transactional
	public Student getStudentById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createNativeQuery("\r\n"
				+ "select *\r\n"
				+ "FROM   dbo.Person INNER JOIN\r\n"
				+ "             dbo.Student ON dbo.Person.uid = dbo.Student.uid "
				+ "where uid = '"+ id +"'",Student.class);
		Student lstStudent = query.uniqueResult();
		return lstStudent;
	}

	@Override
	@Transactional
	public String deleteStudent(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Student st = new Student();
		st.setId(id);
		currentSession.delete(st);
		Person p = new Person();
		p.setId(id);
//		currentSession.delete(id, Student.class);
//		currentSession.delete(id, Person.class);
//		Query q = currentSession.createQuery("delete Entity where uid ='"+id+"'");
//		Query q1 = currentSession.createQuery("delete Student where uid ='"+id+"'");
//		Query q2 = currentSession.createQuery("delete Person where uid ='"+id+"'");
//		q1.executeUpdate();
		return id;
	}

	@Override
	@Transactional
	public Student updateStudent(String id, Student st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(id, st);
		return st;	}

	@Override
	@Transactional
	public Student addStudent(Student st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}
	
	
	@Override
	@Transactional
	public List<Student> addListStudent(List<Student> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (Student student : listST) {
			currentSession.save(student);
		}
		return listST;
	}
	

	@Override
	@Transactional
	public List<Student> getStudentByClass(String class_id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createNativeQuery("select * \r\n"
				+ "FROM   dbo.Person INNER JOIN\r\n"
				+ "             dbo.Student ON dbo.Person.uid = dbo.Student.uid\r\n"
				+ "where id_class = '"+ class_id +"'",Student.class);
		List<Student> lstStudent = query.getResultList();
		return lstStudent;
	}
	
	

}
