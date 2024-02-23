FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/svarikot-prime-service-0.0.1-SNAPSHOT.jar svarikot-prime-service.jar
ENTRYPOINT ["java", "-jar", "svarikot-prime-service.jar"]
