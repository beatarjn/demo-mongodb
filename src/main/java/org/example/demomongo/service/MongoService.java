package org.example.demomongo.service;

import java.util.List;
import java.util.Optional;
import org.example.demomongo.model.MongoEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class MongoService {

  private final MongoRepository mongoRepository;

  public MongoService(MongoRepository mongoRepository) {
    this.mongoRepository = mongoRepository;
  }

  public MongoEvent create(MongoEvent mongoEvent) {
    return (MongoEvent) mongoRepository.save(mongoEvent);
  }

  public List<MongoEvent> findAll() {
    List<MongoEvent> all = mongoRepository.findAll();
    all.forEach(System.out::println);
    return all;
  }

  public MongoEvent findById(String id) {
    Optional<MongoEvent> event = mongoRepository.findById(id);
    event.ifPresent(System.out::println);
    return event.orElseGet(null);
  }
}
