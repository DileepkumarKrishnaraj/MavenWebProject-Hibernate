package com.samco.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.samco.model.SamcoTrainee;
import com.samco.util.HibernateUtil;

public class TraineeDaoImplementation implements TraineeDao {

	public void createTrainee(SamcoTrainee samcoTrainee) {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			if(sessionFactory != null) {
				session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(samcoTrainee);
				session.getTransaction().commit();
				session.close();
				sessionFactory.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
