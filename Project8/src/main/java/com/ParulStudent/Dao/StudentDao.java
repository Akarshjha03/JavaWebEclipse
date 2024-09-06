package com.ParulStudent.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ParulStudent.entity.Student;
import com.ParulStudent.util.HibernateUtil;

public class StudentDao {
	Session ses;
	Transaction txt;
	
	public void saveStudent(Student std)
	{
			ses = HibernateUtil.getSessionFactory().openSession();


		txt = ses.beginTransaction();
		ses.save(std);
		txt.commit();
	}

}
