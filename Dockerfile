FROM openjdk:20-jdk

ARG JAR_FILE=target/*.jar

COPY ./target/modsen-task-discovery-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/app.jar"]