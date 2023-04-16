package com.se.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.spring.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Department> getDepartmentAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Department> query = currentSession.createNativeQuery("select *  from Department", Department.class);
		List<Department> lstDepartment = query.getResultList();
		System.out.println(lstDepartment.get(0));
		return lstDepartment;
	}

	@Override
	@Transactional
	public Department getDepartmentById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Department> query = currentSession.createNativeQuery(
				"\r\n" + "select *\r\n" + "from Department\r\n" + "where id_dep = '" + id + "'",
				Department.class);
		Department lstDepartment = query.uniqueResult();
		return lstDepartment;
	}

	@Override
	@Transactional
	public String deleteDepartment(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(id, Department.class);
		return id;
	}

	@Override
	@Transactional
	public Department updateDepartment(String id, Department st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(id, st);
		return st;
	}

	@Override
	@Transactional
	public Department addDepartment(Department st) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(st);
		return st;
	}

	@Override
	@Transactional
	public List<Department> addListDepartment(List<Department> listST) {
		Session currentSession = sessionFactory.getCurrentSession();
		for (Department Department : listST) {
			currentSession.save(Department);
		}
		return listST;
	}

	@Override
	@Transactional
	public List<Department> getDepartmentByName(String class_id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Department> query = currentSession.createNativeQuery(
				"select * \r\n" + "from Department\r\n" + "where name_dep = '" + class_id + "'", Department.class);
		List<Department> lstDepartment = query.getResultList();
		return lstDepartment;
	}

}
