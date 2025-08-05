package org.example.demomongo.service;

import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.demomongo.model.MongoEvent;
import org.example.demomongo.repository.EventRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MongoService {

  private final EventRepository mongoRepository;

  public MongoEvent create(MongoEvent mongoEvent) {
    return mongoRepository.save(mongoEvent);
  }

  public List<MongoEvent> findAll() {
    return mongoRepository.findAll();
  }

  public MongoEvent findById(String id) {
    Optional<MongoEvent> event = mongoRepository.findById(id);
    return event.orElseGet(null);
  }
}
