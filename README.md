# Restaurant Config Server

This service is the centralized configuration server for the Restaurant Digital Ordering System built using Spring Boot and Spring Cloud.

## Responsibilities

- Centralized configuration management
- Environment-based configuration
- Externalized configuration for microservices
- Secure property management

## Technology Stack

- Spring Boot 3.x
- Spring Cloud Config Server
- Git-backed configuration repository

## Microservices using this config server

- restaurant-api-gateway
- restaurant-auth-service
- restaurant-restaurant-service
- restaurant-menu-service
- restaurant-order-service
- restaurant-kitchen-service
- restaurant-payment-service

## How it works

All microservices fetch their configuration from this server during startup.

Example:

http://localhost:8888/{application-name}/{profile}

Example:

http://localhost:8888/restaurant-auth-service/default
