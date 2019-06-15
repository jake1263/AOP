package com.irish;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

import com.irish.service.ProductService;
import com.irish.service.sub.SubService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExecutionDemoApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	SubService subService;

	@Test
	public void test() {
		
	    productService.findByTwoArgs(122L, "张三");
		
	    subService.demo();
	    
	}

}
