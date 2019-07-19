package com.dev.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import associations.one_to_many.Pencil;
import associations.one_to_many.PencilBox_UniDirectional;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("MySQLUnit");
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();
		
	}
}
