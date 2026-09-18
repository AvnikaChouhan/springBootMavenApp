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

The service checks the current system time and generates a greeting.

Example:

Before 12 PM  → Good morning
12 PM - 4 PM  → Good Afternoon
4 PM - 8 PM   → Good Evening
After 8 PM    → Good night
Available Endpoints
Greeting Page
GET /greeting

The controller calls the greeting service and sends the generated greeting to the JSP page.

Example:

Good morning

or

Good Evening

depending on the current time.

Test Endpoint
GET /test

Response:

Controller is working

This endpoint can be used to verify that the Spring Boot controller is running correctly.

Requirements

Before running the project, make sure you have:

Java 21 or later
Maven, or use the included Maven Wrapper
Git

Check your Java installation:

java -version
Run the Project
1. Clone the Repository
git clone https://github.com/AvnikaChouhan/springBootMavenApp.git
2. Open the Project Directory
cd springBootMavenApp

If the actual Maven project is inside another folder:

cd springBootMavenApp
3. Run Using Maven Wrapper

On Windows:

mvnw.cmd spring-boot:run

On Linux/macOS:

./mvnw spring-boot:run

Alternatively, if Maven is installed:

mvn spring-boot:run
Access the Application

After starting the application, open:

http://localhost:8080/greeting

To test the controller:

http://localhost:8080/test
Maven Dependencies

The project uses dependencies including:

Spring Boot Starter Web
Spring Boot Starter Test
Tomcat Embed Jasper
Jakarta Servlet API

Dependencies are managed through:

pom.xml
Concepts Demonstrated

This project helped in understanding:

Spring Boot project structure
Maven dependency management
Controller layer
Service layer
Dependency Injection
Spring MVC
JSP View Resolution
HTTP GET mappings
Separation of application logic
Future Improvements

Possible improvements include:

Rename classes using Java naming conventions
Replace field injection with constructor injection
Add form handling
Add database integration
Add REST APIs
Add input validation
Add exception handling
Add unit tests
Add Docker support
Add GitHub Actions CI
Author

Avnika Chouhan

Java Backend Developer focused on learning and building applications using:

Java • Spring Boot • Maven • Gradle • REST APIs
License

This project is created for learning and educational purposes.
