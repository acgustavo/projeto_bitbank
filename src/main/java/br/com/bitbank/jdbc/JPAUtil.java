package br.com.bitbank.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BitbankPU");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}