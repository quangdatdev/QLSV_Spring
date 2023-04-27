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
		Query<Department> query = currentSession.createNativeQuery("select * from Department", Department.class);
		List<Department> lstDepartment = query.getResultList();
		System.out.println(lstDepartment.get(0));
		return lstDepartment;
	}

	@Override
	@Transactional
	public Department getDepartmentById(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Department> query = currentSession.createNativeQuery(
				"\r\n" + "select *\r\n" + "from Department\r\n" + "where id_dep = '" + id + "'", Department.class);
		Department lstDepartment = query.uniqueResult();
		return lstDepartment;
	}

	@Override
	@Transactional
	public String deleteDepartment(String id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Department temp = currentSession.get(Department.class, id);
		currentSession.delete(temp);
		return id;
	}

	@Override
	@Transactional
	public Department updateDepartment(String id, Department st) {
		Session currentSession = sessionFactory.getCurrentSession();
		Department temp = getDepartmentById(id);
		if (temp == null) {
			return null;
		}
		temp.setName_dep(st.getName_dep());
		temp.setNoOfSeat(st.getNoOfSeat());
		currentSession.saveOrUpdate(temp);
		return temp;
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
	public List<Department> getDepartmentByName(String day, String lau, String phong) {
		Session currentSession = sessionFactory.getCurrentSession();

		String strLau = "	and name_dep like '___________" + lau + "%'\r\n";
		String strPhong = "	and name_dep like '____________________" + phong + "%'";

		if (lau.equals("0")) {
			strLau = "";
		}
		if (phong.equals("0")) {
			strPhong = "";
		}
		String sql = "select * from Department\r\n" + "where name_dep like '____"+day+"%'\r\n" + strLau + strPhong;

		Query<Department> query = currentSession.createNativeQuery(sql, Department.class);
		List<Department> lstDepartment = query.getResultList();
		return lstDepartment;
	}

}
