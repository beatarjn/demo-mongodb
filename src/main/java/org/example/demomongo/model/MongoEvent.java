package org.example.demomongo.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
@Getter
@Setter
public class MongoEvent {

  @Id private String id;

  private String idEvent;
  private String userId;
  private String comment;
  private Date date;
  private String platform;
  private String retweet;

  public MongoEvent() {}

  public MongoEvent(
      String idEvent, String userId, String comment, Date date, String platform, String retweet) {
    this.idEvent = idEvent;
    this.userId = userId;
    this.comment = comment;
    this.date = date;
    this.platform = platform;
    this.retweet = retweet;
  }
}
