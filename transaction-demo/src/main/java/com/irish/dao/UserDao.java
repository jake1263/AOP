package com.irish.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irish.domain.User;

public interface UserDao extends JpaRepository<User, Long> {
}
