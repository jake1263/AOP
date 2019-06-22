package com.irish.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import com.irish.dao.UserDao;
import com.irish.service.UserService;
import com.irish.transaction.TransactionUtils;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private TransactionUtils transactionUtils;

	public void add() {
		TransactionStatus transactionStatus = null;
		try {
			// 开启事务
			transactionStatus = transactionUtils.begin();
			userDao.add(20, "password001","test001");
			//System.out.println("开始报错啦!@!!");
			//int i = 1 / 0;
			System.out.println("################");
			userDao.add(21, "password002","test002");
			// 提交事务
			if (transactionStatus != null)
				transactionUtils.commit(transactionStatus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// 回滚事务
			if (transactionStatus != null)
				transactionUtils.rollback(transactionStatus);
		}
	}

}
