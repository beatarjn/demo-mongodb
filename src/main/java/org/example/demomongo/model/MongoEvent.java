package org.example.demomongo.model;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MongoEvent {

  @Id private String id;

  private String idEvent;
  private String userId;
  private String comment;
  private Instant date;
  private String platform;
  private String retweet;
}

