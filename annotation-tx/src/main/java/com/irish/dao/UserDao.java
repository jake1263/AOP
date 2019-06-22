package com.irish.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(Integer age , String password , String userName ) {
		String sql = "INSERT INTO  user(age, password , user_name) VALUES(?,?,?);";
		int updateResult = jdbcTemplate.update(sql, age , password , userName);
		System.out.println("updateResult:" + updateResult);
	}

}
