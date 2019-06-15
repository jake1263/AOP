package com.irish.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.irish.aop.dao.ProductDao;
import com.irish.aop.domain.Product;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatalogApplicationTests {

	@Autowired
	ProductDao productDao;

	@Test
	public void testInsert() {
		Product product = new Product();
		product.setName("dell computer");
		product.setOnlineTime(new Date());
		product.setBuyPrice(new BigDecimal("29.5"));
		product.setCategory("computer");
		product.setDetail("this is a dell notebook");
		product.setUpdateTime(new Date());
		productDao.save(product);
		System.out.println("new product id:"+product.getId());
	}

	@Test
	public void testUpdate(){
		Product product = productDao.findOne(2L);
		product.setName("test-update");
		product.setBuyPrice(new BigDecimal("23.5"));
		product.setOnlineTime(new Date());
		productDao.save(product);
	}

	@Test
	public void testDelete(){
		productDao.delete(2L);
	}

}
