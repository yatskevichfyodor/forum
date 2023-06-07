FROM maven

WORKDIR /app
COPY target/forum-0.0.1-SNAPSHOT.jar /app/backend.jar
ENTRYPOINT [ "java", "-jar", "-Dspring.profiles.active=docker", "backend.jar" ]
