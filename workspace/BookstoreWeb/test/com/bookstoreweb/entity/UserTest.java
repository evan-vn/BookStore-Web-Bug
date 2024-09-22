package com.bookstoreweb.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstoreweb.entity.Category;
import com.bookstoreweb.entity.Users;
public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Users user1 = new Users();
//		user1.setEmail("test2test@yahoo.com");
//		user1.setFullName("test2");
//		user1.setPassword("password");
		
		Category ct1 = new Category("Core Python");
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookstoreWeb");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		

		entityManager.getTransaction().begin();
		entityManager.persist(ct1);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		entityManagerFactory.close();
		
		System.out.println("New category is added");
		
		
		
		
		

	}

}
