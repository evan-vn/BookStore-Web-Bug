package com.bookstoreweb.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstoreweb.entity.Users;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users> {

	public UserDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	public Users create(Users t) {
		return super.create(t);
	}

	@Override
	public Users update(Users user) {
		// TODO Auto-generated method stub
		return super.update(user);
	}

	@Override
	public Users get(Object id) {
		
		return super.find(Users.class, id);
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		super.delete(Users.class, id);
		
	}

	@Override
	public List<Users> listAll() {
		// TODO Auto-generated method stub
		return super.findWithNameQuery("Users.findAll");
	}

	@Override
	public long count() {
		
		return super.countWithNameQuery("Users.countAll");
	}
	
	
	
	
	

}
