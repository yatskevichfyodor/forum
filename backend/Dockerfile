FROM maven
COPY target/forum-backend-0.0.1-SNAPSHOT.jar /app/backend.jar
COPY src/main/resources/h2/demo.mv.db /app/demo.mv.db
WORKDIR /app
ENTRYPOINT [ "java", "-jar", "-Dspring.profiles.active=docker", "backend.jar" ]
