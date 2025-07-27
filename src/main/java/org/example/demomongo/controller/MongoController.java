package org.example.demomongo.controller;

import java.util.List;
import org.example.demomongo.model.MongoEvent;
import org.example.demomongo.service.MongoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("events")
public class MongoController {
  private final MongoService mongoService;

  public MongoController(final MongoService mongoService) {
    this.mongoService = mongoService;
  }

  @PostMapping
  public MongoEvent create(@RequestBody final MongoEvent mongoEvent) {
    System.out.println("create method from controller");
    return mongoService.create(mongoEvent);
  }

  @GetMapping
  public List<MongoEvent> listMongoEvents() {
    return mongoService.findAll();
  }

  @GetMapping("/{id}")
  public MongoEvent findById(@PathVariable final String id) {
    return mongoService.findById(id);
  }
}
