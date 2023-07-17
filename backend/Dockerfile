FROM maven

WORKDIR /app
COPY target/forum-backend-0.0.1-SNAPSHOT.jar /app/backend.jar
ENTRYPOINT [ "java", "-jar", "-Dspring.profiles.active=docker", "backend.jar" ]
