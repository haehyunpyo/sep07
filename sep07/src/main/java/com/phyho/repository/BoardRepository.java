package com.phyho.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.phyho.entity.Board;

public interface BoardRepository extends MongoRepository<Board, Long>{

	Optional<Board> findById(String id);

	void deleteById(String id);

}
