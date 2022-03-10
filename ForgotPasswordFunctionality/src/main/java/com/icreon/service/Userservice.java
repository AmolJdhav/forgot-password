package com.icreon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icreon.model.User;
import com.icreon.repository.Myconnection;
import com.icreon.repository.UserDao;



@Service
public class Userservice {

	@Autowired
	UserDao dao ;
	
	public User getUsersByEmailandPassword(String username, String password) {
		dao = new UserDao(Myconnection.getConnection());
		return UserDao.getUserByUsernameAndPassword(username, password);
	}
}
