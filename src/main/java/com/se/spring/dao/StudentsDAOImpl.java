package com.se.spring.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
		System.out.println(lstStudent.get(0).getFaculty().getIdFaculty());
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
				+ "where Student.uid='"+ id +"'",Student.class);
		Student lstStudent = query.uniqueResult();
		return lstStudent;
	}

	@Override
	@Transactional
	public String deleteStudent(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Student temp = currentSession.get(Student.class, id);
		currentSession.delete(temp);
		return id;
	}

	@Override
	@Transactional
	public Student updateStudent(String id, Student st) {
		Session currentSession = sessionFactory.getCurrentSession();
		Student temp = getStudentById(id);
		if (temp==null) {
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
		temp.setMajor(st.getMajor());
		temp.setDateStart(st.getDateStart());
		
		currentSession.saveOrUpdate(temp);
		return temp;	
		}

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

	@Override
	@Transactional
	public List<Student> getStudentByFaculty(String class_id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createNativeQuery("select * \r\n"
				+ "FROM   dbo.Person INNER JOIN\r\n"
				+ "             dbo.Student ON dbo.Person.uid = dbo.Student.uid\r\n"
				+ "where id_faculty = '"+ class_id +"'",Student.class);
		List<Student> lstStudent = query.getResultList();
		return lstStudent;
	}
	
	

}
