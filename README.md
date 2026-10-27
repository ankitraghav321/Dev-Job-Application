# Dev Job Application — Job Portal

A Job Portal web application built using Java, Spring Boot, Spring Security, Thymeleaf, and MySQL. This project is being developed to practice Java backend development and build a full-stack, role-based web application.

## 🚀 Project Overview

The application provides registration and authentication for users who access the job portal as Job Seekers or Recruiters.

The project focuses on implementing secure authentication, role-based access control, database persistence, and server-side web rendering using the Spring ecosystem.

## 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot 4.1.1
- Spring Security
- Spring Data JPA
- Hibernate ORM
- Maven

### Frontend
- HTML5
- CSS3
- JavaScript
- Thymeleaf
- Bootstrap 5.3.8
- jQuery
- Font Awesome

### Database
- MySQL
- JDBC
- JPA / Hibernate

## ✨ Implemented Features

### 1. User Registration
- Register new users.
- Check whether an email address is already registered.
- Support user-type selection.
- Persist user information using the service layer and database.

### 2. User Login
- Authenticate users using Spring Security.
- Use a configured authentication provider.
- Redirect authenticated users through a custom authentication success handler.
- Retrieve the authenticated username and granted authorities.

### 3. Role-Based Authorization
The application supports the following user authorities:

- **Job Seeker**
- **Recruiter**

Spring Security controls access to public and authenticated routes based on the configured authorization rules.

### 4. Dashboard
- Render the dashboard using Thymeleaf.
- Display the authenticated username.
- Retrieve the current user's profile through the service layer.
- Provide navigation options based on user authorities.

### 5. Logout
- Handle logout using Spring Security.
- Redirect users to the configured home page after logout.

## 📂 Project Structure

The project uses the standard Maven directory layout.

```text
Dev-Job-Application/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ankit/jobportal/
│   │   │       ├── config/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── JobportalApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

*Note: Package and file names above illustrate the intended organization. Adjust them to match the actual source files in the repository.*

## ⚙️ Getting Started

### Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK) 21
- MySQL Server
- Maven, or the included Maven Wrapper
- IntelliJ IDEA, Eclipse, or another Java IDE

### 1. Clone the repository

```bash
git clone https://github.com/ankitraghav321/Dev-Job-Application.git
cd Dev-Job-Application
```

### 2. Create the MySQL database

Open MySQL and execute:

```sql
CREATE DATABASE jobportal;
```

Configure a MySQL user with the required privileges for the application.

### 3. Configure the database connection

Update `src/main/resources/application.properties` with your local database configuration.

```properties
spring.application.name=jobportal

spring.datasource.url=${DB_URL:jdbc:mysql://localhost:3306/jobportal}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Set the `DB_USERNAME` and `DB_PASSWORD` environment variables before starting the application.

For local development, configure these variables using your IDE's run configuration or your operating system's environment settings.

**Security note:** Do not commit database passwords or other credentials to a public repository.

### 4. Run the application

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

Alternatively, if Maven is installed:

```bash
mvn spring-boot:run
```

### 5. Open the application

Visit:

```text
http://localhost:8080
```

Open the registration page, create an account, and log in using your registered credentials.

The exact entry URL depends on the controller mappings configured in the application.

## 🔐 Security Implementation

Spring Security is used to configure authentication and authorization.

The current implementation includes:

- Custom login page.
- Configured authentication provider.
- Custom `AuthenticationSuccessHandler`.
- Role/authority-based access rules.
- Protected routes for authenticated users.
- Logout URL and post-logout redirect.
- Thymeleaf Spring Security integration.

The final access policy depends on the matchers and authorization rules defined in `WebSecurityConfig`.

## 🗄️ Database

The application connects to MySQL using Spring Data JPA and Hibernate.

The database stores application data through the entity and repository layers.

The current database configuration targets:

```text
Database: jobportal
Host: localhost
Port: 3306
```

## 🗺️ Development Roadmap

Potential future improvements include:

- Recruiter profile creation and editing.
- Job posting and management.
- Job search, filtering, and pagination.
- Job application submission.
- Tracking application status.
- Job Seeker profile management.
- Improved validation and exception handling.
- Unit and integration testing.
- REST API development.

These items are planned enhancements and are not represented as completed features.

## 🎯 Learning Objectives

This project provides practical experience with:

- Java and Spring Boot application development.
- Spring Security authentication and authorization.
- Custom authentication success handlers.
- MVC architecture and Thymeleaf templates.
- Spring Data JPA and Hibernate.
- MySQL database integration.
- Maven dependency management.
- Debugging and troubleshooting web applications.

## 👨‍💻 Author

**Ankit Raghav**

Java Backend Developer | Spring Boot | Spring Security | MySQL

GitHub: [ankitraghav321](https://github.com/ankitraghav321)

## 📌 Project Status

**In active development.**

Registration, login, logout, authentication handling, and the dashboard are implemented. More features will be added as development progresses.

---

If you find this project useful or have suggestions for improvement, feel free to explore the repository and share feedback.
