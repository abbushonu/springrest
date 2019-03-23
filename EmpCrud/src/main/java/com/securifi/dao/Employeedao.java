package com.securifi.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.Configuration;

import com.securifi.beans.Employee;

public class Employeedao {
	org.hibernate.SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	org.hibernate.Session session = sf.openSession();
	org.hibernate.Transaction t = session.beginTransaction();

	public int save(Employee e) {
		System.out.println("dao save method invoked");
		session.save(e);
		t.commit();
		return 1;
	}

	public java.util.List getAllEmployes() {
		List employees = new ArrayList();
		String query="select employee";
		session.createQuery(query);
		
System.out.println(session.createCriteria("from Employee"));	
				System.out.println(session.createCriteria(Employee.class));
	//	employees=session.getEntityName(Employee.class);
		System.out.println("-----------------"+employees+"--------------------");
		return employees;
	}
}
