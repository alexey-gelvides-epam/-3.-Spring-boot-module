FROM openjdk:17
ADD target/spring-boot-module-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]