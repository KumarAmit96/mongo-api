package com.mongo.api.repository;


import com.mongo.api.model.Book;
import com.mongo.api.model.Lend;
import com.mongo.api.model.LendStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LendRepository extends MongoRepository<Lend, String> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
