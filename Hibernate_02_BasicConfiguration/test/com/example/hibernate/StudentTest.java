package com.example.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
	
	private static SessionFactory sessionFactory;

	@BeforeClass
	public static void beforeClass() {
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testStudentSave() {
	
		Student s = new Student();
		s.setId(3);
		s.setName("zhangsan");
		s.setSex("ÄÐ");
		s.setAge(8);
		
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
	}
	
	@AfterClass
	public static void afterClass() {
		sessionFactory.close();
	}
	
}
