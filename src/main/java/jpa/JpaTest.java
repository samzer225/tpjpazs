package jpa;

import system.Ticket;
import system.User;
import system.UserSupportTech;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.util.List;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		JpaTest jpatest = new JpaTest(manager);

		try {
			jpatest.createUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


	/**
	 * @name createUser
	 */
	private void createUser() {
		int numOfUsers = manager.createQuery("Select u From User u", User.class).getResultList().size();
		if (numOfUsers == 0) {
			Ticket ticket = new Ticket("bug on project", "Todo");
			manager.persist(ticket);

			manager.persist(new User("Jakab Gipsz"));
			manager.persist(new User("Captain Nemo"));
			manager.persist(new UserSupportTech("Zabra Enoch", "Consultant"));

		}
	}

	/**
	 * @name listUser
	 */
	private void listUser() {
		List<User> resultList = manager.createQuery("Select a From User a", User.class).getResultList();
		System.out.println("num of employess:" + resultList.size());
		for (User next : resultList) {
			System.out.println("next employee: " + next);
		}
	}

}