FROM openjdk:11
ADD target/demo-docker-0.0.1-SNAPSHOT.jar demo-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","demo-docker.jar"]
