# Spring Boot + Java + Gradle Demo

## Requirements
- Java 17+
- IntelliJ IDEA

This project uses Gradle for dependency management and builds.

## Build
./gradlew clean build

Windows PowerShell:
./gradlew.bat clean build

## Run
./gradlew.bat bootRun

## Endpoints
GET  http://localhost:8080/api/hello
GET  http://localhost:8080/api/employees
GET  http://localhost:8080/api/employees/1
POST http://localhost:8080/api/employees

Example POST body:
{
  "id": 3,
  "name": "Alice",
  "role": "Software Engineer"
}
