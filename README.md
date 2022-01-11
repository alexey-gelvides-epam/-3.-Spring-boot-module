# -3.-Spring-boot-module
Spring boot module

Preparement
Install docker.
Create docker-compose.yaml file and shape the needed insfrastructrue


Database(PostgreSQL)
Database admin(Admin, PgAdmin, e.t.c)
Prometheus
(Optional) Grafana


Task 1
1 point.
Using https://start.spring.io create a Spring-boot app.
Create CommandLineRunner and output 'hello world'.
Start your application.
Check that spring context is up and there is 'hello world' message in console.


Task 2
1 point.
Create app that should support create, read, update and delete operations for some entity.
Use Spring Data module.
Don't use Spring Data REST starter.


Task 3
1 point.
Implement authentication and authorization mechanism.
OAuth2 should be used.
JWT Token should be used.


Task 4
1 point.
Should support different environments - local, dev, stg, prod.
Spring profiles.
Each environment - different db properties.


Task 5
1 point.
Add tool for migrating data.
Flyway or Liquibase.


Task 6
1 point.
Enable actuator.
Implement a few custom health indicators.
Implement a few custom metrics using Prometheus.


Task 7
1 point
In memory db must be used for testing purpose.
Implement repository testing.
Implement unit tests.
Implement tests for RestController using mock mvc.
Implement integration tests on testcontainers.


Lectures
Intro in Spring Boot - https://learn.epam.com/detailsPage?id=d806f913-4cdd-4a54-9eea-ce53096f7e0a
Spring Boot: Under the Hood / Nicolas Fränkel - https://www.youtube.com/watch?v=zSJFx0iyrq4&ab_channel=Java.IL
Spring boot 2.0 new features (Optional) - https://learn.epam.com/detailsPage?id=1a5d6b23-b4b9-4942-bf64-a8e758d3ef01
Spring Boot Quick Start 33 - Spring Boot Actuator - https://www.youtube.com/watch?v=ojc_Jy_0EgI&ab_channel=JavaBrains
Mastering Spring Boot's Actuator - https://www.youtube.com/watch?v=otcYECeFS6Y&ab_channel=SpringDeveloper
Production Monitoring and Management with Spring Boot Actuator - https://www.youtube.com/watch?v=7L5rBQUMiPI&ab_channel=LeanStacks
Spring Boot Enable AutoConfiguration debugging - https://www.youtube.com/watch?v=iBr-OpVdbz4&ab_channel=BASELogic
Spring Boot Internals, Debug flag - https://www.youtube.com/watch?v=NOYvjCeidcI&ab_channel=Melardev
TDD in Spring Boot applications - https://www.youtube.com/watch?v=s9vt6UJiHg4&ab_channel=SpringDeveloper
Test Driven Spring Boot applications - https://www.youtube.com/watch?v=E87XhgYBM-Y
Rest services with NoSQL in Spriing Boot - https://learn.epam.com/detailsPage?id=4e0a5e98-9b9e-46a1-97be-1a4d2186ca33
Bootiful Testing - https://www.youtube.com/watch?v=1W5_tOiwEAc
It's a Kind of Magic: Under the Covers of Spring Boot - Brian Clozel, Stéphane Nicoll - https://www.youtube.com/watch?v=jDchAEHIht0
From Zero to Hero with Spring Boot - Brian Clozel - https://www.youtube.com/watch?v=aA4tfBGY6jY
DB Integration Tests with Spring Boot and Testcontainers - https://www.baeldung.com/spring-boot-testcontainers-integration-test



Documentation
Spring-boot documentation - https://docs.spring.io/spring-boot/docs/current/reference/html/
Docker - https://docs.docker.com/engine/install/
Spring-boot docerize - https://spring.io/guides/gs/spring-boot-docker/



Sites
Spring Boot and OAuth2 - https://spring.io/guides/tutorials/spring-boot-oauth2/
OAuth 2.0 Protocols and Patterns - https://github.com/jgrandja/oauth2-protocol-patterns
Display Auto-Configuration Report in Spring Boot - https://www.baeldung.com/spring-boot-auto-configuration-report
Troubleshoot Auto-configuration - https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#howto-troubleshoot-auto-configuration
Metrics Collection in Spring Boot With Micrometer and Prometheus - https://www.codeprimers.com/metrics-collection-in-spring-boot-with-micrometer-and-prometheus/
