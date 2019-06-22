package com.irish.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irish.annotation.ExtTransaction;
import com.irish.dao.UserDao;
import com.irish.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	 @ExtTransaction
	 public Object  add(String userId) {
		 System.out.println("方法入参 :  "+userId);
		 userDao.add(20 , "password20" , "test00020");
		 //int i = 1 / 0;
		 System.out.println("################");
		 userDao.add(22 , "password22" , "test00022");
		 return "方法返回值 ： 001";
	 }

	public void del() {
		System.out.println("del");
	}


}
