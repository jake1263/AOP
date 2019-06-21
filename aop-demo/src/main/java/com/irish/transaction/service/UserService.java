package com.irish.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import com.irish.dao.UserDao;
import com.irish.transaction.TransactionUtils;


@Service
public class UserService  {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private TransactionUtils transactionUtils;

	//手动控制事务
	public void add() {
		TransactionStatus transactionStatus = null;
		try {
			// 开启事务
			transactionStatus = transactionUtils.begin();
			userDao.add("test001", 20);
			//System.out.println("开始报错啦!@!!");
			//int i = 1 / 0;
			System.out.println("################");
			userDao.add("test002", 21);
			// 提交事务
			if (transactionStatus != null)
				transactionUtils.commit(transactionStatus);
		} catch (Exception e) {
			System.out.println(e);
			// 回滚事务
			if (transactionStatus != null)
				transactionUtils.rollback(transactionStatus);
		}
	}

}
