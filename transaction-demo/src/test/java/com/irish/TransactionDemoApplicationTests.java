package com.irish;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.irish.service.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionDemoApplicationTests {

	@Autowired
	DemoService demoService;

	@Test
	public void testWithoutTransaction() {
		//数据库中user表的name字段建立唯一索引，
		//加事务注解后，向operation_log , user表插入数据，要么同时成功，要么同时失败
		demoService.addUser("tom");
	}

}
