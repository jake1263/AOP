package com.irish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.irish.service.UserService;

public class Test {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
		userService.add();
	}

}
