# User-Managment

# Description:

In this Spring Boot project, we will be using a three-tier architecture consisting of a controller, service, and repository.

The controller layer is also referred to as the API layer because we store all REST API Spring MVC endpoints in this layer.

Next comes the service layer. This layer contains all the business logic of our application.

Then there's the repository layer. The repository layer contains all database-related logic and is also called the persistence layer. The repository layer is responsible for interacting with the database.

In this application, we will be using a MySQL database and the Postman REST client to test all REST APIs.

# Technical stack:

Spring MVC, Spring Boot, Spring Data JPA, MySQL

# Version_1.1

In this version, the implementation of Data Transfer Objects (DTOs) was realized through manual coding of this design pattern.

# Version_1.2

The addition of Model Mapper and MapStruct libraries for the implementation of the Data Transfer Object (DTO) design pattern has been introduced.

# Version_1.3

# This update includes:

- Exception and error handling in Spring Boot REST API;
- Validation of REST API requests in Spring Boot;
- Spring Boot Actuator;
- Implementation of REST API documentation using the SpringDoc Open API library in Spring Boot.
