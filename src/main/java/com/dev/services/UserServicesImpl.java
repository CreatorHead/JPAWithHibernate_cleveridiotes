package com.dev.services;

import com.dev.beans.User;
import com.dev.dao.JPAImpl;
import com.dev.dao.UserDAO;

public class UserServicesImpl implements UserServices {

	private UserDAO db = new JPAImpl();

	public Boolean createProfile(User user) {
		return db.createProfile(user);
	}
	
	
}
