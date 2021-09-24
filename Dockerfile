FROM openjdk:11
COPY build/libs/voting-db-0.0.1-SNAPSHOT.jar voting-db.jar
ENTRYPOINT ["java", "-jar", "voting-db.jar"]
EXPOSE 8080
