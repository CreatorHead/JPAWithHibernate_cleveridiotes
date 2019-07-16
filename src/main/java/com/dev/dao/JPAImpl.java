package com.dev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.beans.User;

public class JPAImpl implements UserDAO {
	private final static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("myPersistanceUnit");
	
	public Boolean createProfile(User user) {
		Boolean state = false;
		try {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			em.close();
			state = true;
		} catch (Exception e) {
			//throw custom exception
			e.printStackTrace();
		}
		return state;
	}

}
