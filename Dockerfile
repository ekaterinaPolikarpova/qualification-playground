FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY /build/libs/qual-1.0-SNAPSHOT.jar /app/myapp.jar
ENTRYPOINT ["java", "-jar", "myapp.jar"]
