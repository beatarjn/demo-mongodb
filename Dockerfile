FROM mongo
ENV MONGO_INITDB_DATABASE="social_events"
COPY mongo-init.js /docker-entrypoint-initdb.d/