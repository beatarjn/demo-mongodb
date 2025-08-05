package org.example.demomongo.repository;

import org.example.demomongo.model.MongoEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<MongoEvent, String> {}
