package com.irish.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irish.domain.OperationLog;

public interface OperationLogDao extends JpaRepository<OperationLog, Long> {
}
