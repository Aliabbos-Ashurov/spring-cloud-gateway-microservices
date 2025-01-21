# Microservices Architecture for User and Notification Management

This repository contains a microservices-based project that demonstrates the implementation of a **User Service** and a
**Notification Service** using **Spring Boot**, **Eureka Discovery Server**, and **MongoDB/PostgreSQL**. The system
leverages **Feign Clients** for inter-service communication and integrates with **Eureka Server** for service
registration and discovery.

## Features

### 1. User Service

- Handles user management operations.
- Supports user creation, retrieval, and persistence in a **PostgreSQL** database.
- Communicates with the Notification Service to send user-specific notifications.

### 2. Notification Service

- Manages notifications for users.
- Stores notification data in a **MongoDB** collection.
- Provides APIs for saving and retrieving notifications.

### 3. Eureka Discovery Server

- Centralized service registry for dynamic service discovery.
- Enables load balancing and fault tolerance.

### 4. Inter-Service Communication

- Uses **Spring Cloud OpenFeign** for declarative REST client communication.
- Supports service discovery and load balancing through Eureka.

### 5. Database Configuration

- User Service: **PostgreSQL** with Hibernate for ORM.
- Notification Service: **MongoDB** with Spring Data MongoDB for NoSQL database operations.

## Technologies Used

- **Spring Boot** for microservices.
- **Spring Cloud** for service discovery and Feign integration.
- **MongoDB** and **PostgreSQL** as databases.
- **Docker** for containerization.
