# 💼 Dev Job Application – Job Portal

A full-stack Job Portal application built using **Java, Spring Boot, Spring Security, Spring Data JPA, Thymeleaf, and MySQL**.

The application provides separate experiences for Job Seekers and Recruiters, allowing recruiters to manage job postings and job seekers to explore job opportunities.

This project is actively developed to strengthen backend development skills and implement real-world Spring Boot concepts.

## 🚀 Project Overview

Dev Job Application is designed to connect recruiters with job seekers through a centralized job portal.

The application currently supports user registration, authentication, role-based authorization, recruiter profile management, job posting, and a recruiter dashboard.

### 👥 User Roles

- **Job Seeker:** Registers and logs in to explore job opportunities and view job details.
- **Recruiter:** Creates a recruiter profile, uploads a profile photo, posts jobs, and manages job postings through a dashboard.

## ✨ Implemented Features

### 1. User Authentication & Authorization

- User registration with email validation.
- Login and logout functionality.
- Spring Security-based authentication.
- Role-based authorization.
- Custom authentication provider.
- Custom authentication success handler.
- Separate user experiences based on assigned authorities.

### 2. Recruiter Profile Management

- Create recruiter profile.
- Store recruiter information in the database.
- Upload recruiter profile photo.
- Save uploaded profile images in user-specific directories.
- Associate recruiter profiles with registered user accounts.

### 3. Recruiter Job Management

- Create and publish new job postings.
- Associate job postings with the logged-in recruiter.
- Save job posting information using Spring Data JPA.
- Maintain job-related information such as:
    - Job Title
    - Job Description
    - Job Type
    - Salary
    - Remote/Work Mode
    - Company Information
    - Job Location
    - Posted Date
- Edit existing job postings.

### 4. Recruiter Dashboard

- Dedicated recruiter dashboard.
- Display jobs posted by the logged-in recruiter.
- Retrieve recruiter-specific job information.
- Display total candidates associated with each job.
- Fetch aggregated job information using native SQL queries.
- Use Spring Data JPA interface projections.
- Map projection results into custom DTOs.

### 5. Job Seeker Functionality

- Access job details through job-specific URLs.
- Retrieve job information using the job ID.
- Display job details using Thymeleaf templates.

## 🛠️ Technology Stack

### Backend
- Java 21
- Spring Boot 4.1.1
- Spring Security
- Spring Data JPA
- Hibernate ORM
- JDBC
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
- Spring Data JPA
- Hibernate ORM

### Development Tools
- IntelliJ IDEA
- Git & GitHub
- Maven
- MySQL Workbench
- Postman

## 🏗️ Application Architecture

The application follows a layered MVC architecture.

```text
src/main/java/com/ankit/jobportal/
│
├── config/
│   └── Security Configuration
│
├── controller/
│   ├── UsersController
│   ├── JobPostActivityController
│   ├── RecruiterProfileController
│   └── JobSeekerApplyController
│
├── entity/
│   ├── Users
│   ├── RecruiterProfile
│   ├── JobPostActivity
│   ├── JobCompany
│   ├── JobLocation
│   ├── RecruiterJobDto
│   └── IRecruiterJob
│
├── repository/
│   ├── UsersRepository
│   ├── RecruiterProfileRepository
│   └── JobPostActivityRepository
│
├── services/
│   ├── UsersService
│   ├── RecruiterProfileService
│   └── JobPostActivityService
│
└── util/
    └── FileUploadUtil
```

```text
src/main/resources/
│
├── static/
│   ├── css/
│   ├── js/
│   └── images/
│
├── templates/
│   ├── login.html
│   ├── dashboard.html
│   ├── recruiter_profile.html
│   ├── add-jobs.html
│   └── job-details.html
│
└── application.properties
```

*Note: This illustrates the main application components; refer to the repository for the complete source structure.*

## ⚙️ Getting Started

### Prerequisites

Make sure you have installed:

- JDK 21
- MySQL Server
- IntelliJ IDEA or Eclipse
- Git
- Maven (or use the included Maven Wrapper)

### 1. Clone the repository

```bash
git clone https://github.com/ankitraghav321/Dev-Job-Application.git

cd Dev-Job-Application
```

### 2. Create the database

Open MySQL Workbench or your MySQL terminal and execute:

```sql
CREATE DATABASE jobportal;
```

### 3. Configure database connection

Open:

`src/main/resources/application.properties`

Configure your MySQL connection:

```properties
spring.application.name=jobportal

spring.datasource.url=${DB_URL:jdbc:mysql://localhost:3306/jobportal}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Set the `DB_USERNAME` and `DB_PASSWORD` environment variables in your IDE or operating system.

**Important:** Never commit database credentials or sensitive configuration to GitHub.

### 4. Run the application

Using Maven Wrapper on Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

Alternatively, using installed Maven:

```bash
mvn spring-boot:run
```

### 5. Access the application

Open your browser:

```text
http://localhost:8080
```

Register a new account, log in, and explore the available functionality according to your assigned role.

## 🔐 Security Implementation

Spring Security handles authentication and authorization.

Current implementation includes:

- Custom login page.
- Authentication provider.
- Custom authentication success handler.
- Role/authority-based authorization.
- Protected application routes.
- Logout handling.
- Thymeleaf Spring Security integration.

## 🗄️ Database & Data Access

The application uses MySQL as its relational database.

Spring Data JPA and Hibernate handle entity persistence and database operations.

For recruiter dashboard statistics, the application also uses:

- Native SQL queries.
- Interface-based projections.
- DTO-based data transfer.
- SQL aggregation using `COUNT()`.
- Joins across job, company, location, and application tables.

## 🗺️ Future Enhancements / Roadmap

The following functionalities are planned for future development:

- [ ] Complete job application submission workflow.
- [ ] Job seeker profile management.
- [ ] Resume upload and management.
- [ ] Job search and filtering.
- [ ] Pagination and sorting.
- [ ] Application status tracking.
- [ ] Recruiter applicant management.
- [ ] Update and delete job postings.
- [ ] Improved validation and exception handling.
- [ ] REST API development.
- [ ] Unit and integration testing.
- [ ] Email notifications.

## 🎯 Learning Objectives

Through this project, I am gaining practical experience in:

- Java backend development.
- Spring Boot application development.
- Spring Security authentication and authorization.
- Spring Data JPA and Hibernate.
- Entity relationships and database mapping.
- Native SQL queries and JPA projections.
- DTO-based data transfer.
- MVC architecture.
- Thymeleaf server-side rendering.
- File upload and storage.
- Maven dependency management.
- Debugging and troubleshooting.

## 👨‍💻 Author

**Ankit Raghav**

Java Backend Developer | Spring Boot | Spring Security | Hibernate | MySQL

- GitHub: [ankitraghav321](https://github.com/ankitraghav321)

## 📌 Project Status

**Currently in Active Development 🚧**

The project is being developed incrementally, with new features and improvements added regularly.

---

⭐ If you find this project interesting, feel free to explore the repository and share your feedback.