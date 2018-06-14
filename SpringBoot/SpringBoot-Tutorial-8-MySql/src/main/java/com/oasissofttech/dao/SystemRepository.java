package com.oasissofttech.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.oasissofttech.model.System;

@Repository
public interface SystemRepository extends CrudRepository<System,Long> {
	

}