FROM maven:3.8.4-openjdk-17 AS builder


WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn package -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080
WORKDIR /app
COPY --from=builder /app/target/repositorioDeTcc-0.0.1-SNAPSHOT.jar /app/repositorioDeTcc.jar
CMD ["java", "-jar", "repositorioDeTcc.jar"]