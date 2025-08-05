db = db.getSiblingDB("social_events");

db.createUser({
    user: "root2",
    pwd: "pass",
    roles: [
        {
            role: "dbAdmin",
            db: "social_events",
        },
        {
            role: "userAdmin",
            db: "social_events",
        },
        {
            role: "dbOwner",
            db: "social_events",
        },
    ],
});

db.createCollection("events");

db.getCollection("events").insertOne({
    "idEvent": "evt99999",
    "userId": "beata123",
    "comment": "Another event",
    "date": "2025-07-27T14:15:00.000+00:00",
    "platform": "Twitter",
    "retweet": "evt56789"
});



