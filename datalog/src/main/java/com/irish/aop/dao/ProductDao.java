package com.irish.aop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irish.aop.domain.Product;

public interface ProductDao extends JpaRepository<Product,Long> {
    public Product findById(Long id);
}
