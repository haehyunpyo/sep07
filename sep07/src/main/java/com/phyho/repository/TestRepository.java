package com.phyho.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.phyho.entity.Test;

public interface TestRepository extends MongoRepository<Test, Long> {

}
