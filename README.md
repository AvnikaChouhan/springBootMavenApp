# Spring Boot Maven Greeting Application

A simple Spring Boot web application built using **Java** and **Maven** to demonstrate the basic structure of a Spring Boot MVC project.

The application displays a greeting message based on the current time of day and also provides a simple test endpoint to verify that the controller is working.

---

## Features

* Spring Boot application using Maven
* MVC architecture
* Controller and Service layers
* JSP-based frontend
* Time-based greeting generation
* Simple REST-style test endpoint
* Maven Wrapper included for easy project execution

---

## Tech Stack

* Java 21
* Spring Boot
* Spring MVC
* Maven
* JSP
* Apache Tomcat
* Jakarta Servlet API

---

## Project Structure

```text
springBootMavenApp/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── Maven/
│   │   │           └── springBootMavenApp/
│   │   │               ├── SpringBootMavenAppApplication.java
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   └── controller.java
│   │   │               │
│   │   │               └── service/
│   │   │                   ├── IGreetingService.java
│   │   │                   └── service.java
│   │   │
│   │   ├── resources/
│   │   │   └── application.properties
│   │   │
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           └── jsp/
│   │               └── Hello.jsp
│   │
│   └── test/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## How It Works

The application follows a simple MVC architecture:

```text
User Request
     ↓
Controller
     ↓
Greeting Service
     ↓
Greeting Generated
     ↓
JSP View
     ↓
Response to User
```

The
