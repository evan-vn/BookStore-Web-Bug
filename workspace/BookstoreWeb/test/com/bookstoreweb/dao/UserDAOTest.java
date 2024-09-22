package com.bookstoreweb.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bookstoreweb.entity.Category;
import com.bookstoreweb.entity.Users;

public class UserDAOTest {
	private static EntityManagerFactory entityManagerFactory ;
	private static EntityManager entityManager;
	private static UserDAO userDAO;
	
	@BeforeClass
	public static void setupClass() {
		entityManagerFactory = Persistence.createEntityManagerFactory("BookstoreWeb");
		entityManager = entityManagerFactory.createEntityManager();
		userDAO = new UserDAO(entityManager);
	}

	@Test
	public void testCreateUsers() {
		
// TODO Auto-generated method stub
		
		Users user1 = new Users();
		user1.setEmail("testJUNIT2@yahoo.com");
		user1.setFullName("test2");
		user1.setPassword("password");
		
		//Category ct1 = new Category("Core Python");
		userDAO.create(user1);
		
		
		assertTrue(user1.getUserId() > 0);
			
	}
	
	@Test
	public void testUpdateUser() {
		Users user1 = new Users();
		user1.setUserId(1);
		user1.setEmail("changedemail.com");
		user1.setFullName("Nochange");
		user1.setPassword("passchanged");
		
		user1 = userDAO.update(user1);
		String expected = "passchanged";
		String acctual = user1.getPassword();
		
		assertEquals(expected, acctual);
	}
	
	@Test(expected=PersistenceException.class)
	public void testCreateUserFieldNotSet() {
		Users user1 = new Users();
		user1 = userDAO.create(user1);
		
		assertNotNull(user1);
		
	}
	@Test
	public void testGetUsersFound() {
		Integer id = 1;
		Users user = userDAO.get(id);
		if (user != null) {
			System.out.println(user.getEmail());
		}
		
		assertNotNull(user);
	}
	@Test
	public void testGetUsersNotFound() {
		Integer id = 90;
		Users user = userDAO.get(id);
		assertNull(user);
	}
	@Test
	public void testDeleteUser() {
		Integer id = 5;
		userDAO.delete(id);
		Users user = userDAO.get(id);
		assertNull(user);
	}
	@Test(expected=EntityNotFoundException.class)
	public void testDeleteNonExistUser() {
		Integer id = 55;
		userDAO.delete(id);
	}
	
	
	@Test
	public void testListAll() {
		List<Users> listUsers = userDAO.listAll();
		for(Users user : listUsers ) {
			System.out.println(user.getEmail());
		}
		assertTrue(listUsers.size() > 0);
	}
	
	@Test
	public void testCount() {
		long totalUsers = userDAO.count();
		assertEquals(5, totalUsers);
	}
	
	
	
	
	@AfterClass
	public static void tearDownClass() {
		entityManager.close();
		entityManagerFactory.close();
	}

	
	
	
	
	
	
	
}
