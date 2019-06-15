package com.irish.aop.datalog;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.irish.aop.domain.Action;

public interface ActionDao extends MongoRepository<Action,String> {
}
