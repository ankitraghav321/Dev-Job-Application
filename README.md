# 💼 Dev Job Application – Job Portal

A full-stack Job Portal application built using **Java 21, Spring Boot, Spring Security, Spring Data JPA, Hibernate, Thymeleaf, and MySQL**.

The application provides dedicated experiences for **Job Seekers** and **Recruiters**. Recruiters can create and manage job postings, while job seekers can discover jobs, filter opportunities, submit applications, and save jobs for later.

This project is actively developed to practise real-world Java backend development, MVC architecture, authentication, persistence, entity relationships, and server-side rendering.

## 🚀 Project Overview

Dev Job Application connects recruiters and job seekers through a centralized job portal.

### 👥 User Roles

- **Job Seeker:** Creates a profile, explores and filters job opportunities, views job details, applies for jobs, and saves jobs.
- **Recruiter:** Creates a recruiter profile, uploads a profile photo, publishes job postings, and views recruiter dashboard information, including candidate counts.

## ✨ Implemented Features

### 1. User Authentication & Authorization

- User registration with email validation.
- Login and logout functionality.
- Spring Security-based authentication.
- Role/authority-based access for Job Seekers and Recruiters.
- Custom authentication provider.
- Custom authentication success handler.
- Protected routes and role-specific user experiences.
- Thymeleaf Spring Security integration.

### 2. Recruiter Profile Management

- Create and persist recruiter profiles.
- Associate recruiter profiles with registered user accounts.
- Upload recruiter profile photos.
- Store uploaded profile images in user-specific directories.

### 3. Recruiter Job Management

- Create and publish job postings.
- Associate job postings with the logged-in recruiter.
- Edit existing job postings.
- Persist job information using Spring Data JPA.
- Capture job title, description, employment type, salary, work mode, company, location, and posted date.

### 4. Recruiter Dashboard

- Dedicated recruiter dashboard.
- Display jobs posted by the logged-in recruiter.
- Retrieve recruiter-specific job information.
- Display the number of candidates associated with each job.
- Retrieve aggregated job information using native SQL queries.
- Use Spring Data JPA interface projections and custom DTOs.

### 5. Job Seeker Profile Management

- Create and update a job seeker profile.
- Associate the profile with the registered user account.
- Manage profile information and skills.
- Upload profile photo and resume files.
- Store uploaded files in user-specific directories.

### 6. Candidate Dashboard & Job Discovery

- Dedicated candidate dashboard for job seekers.
- Search job postings by job title and location.
- Filter jobs by employment type:
  - Full-Time
  - Part-Time
  - Freelance
- Filter jobs by work mode:
  - Remote-Only
  - Office-Only
  - Partial-Remote
- Filter jobs by posting date:
  - Today
  - Last 7 days
  - Last 30 days
- View job details using job-specific URLs.

### 7. Job Application Management

- Submit a job application for a selected job.
- Associate each application with the logged-in job seeker profile and the selected job posting.
- Record the application date.
- Retrieve applications by job seeker or job posting.
- Identify jobs that the current job seeker has already applied for.
- Enforce a unique database constraint for a user-job application pair.

### 8. Saved Jobs

- Save job postings for later reference.
- Associate saved jobs with the logged-in job seeker.
- View saved jobs on a dedicated **Saved Jobs** page.
- Navigate from a saved job to its job details.
- Identify jobs that have already been saved.
- Enforce a unique database constraint for a user-job saved record.

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

The application follows a layered MVC architecture, separating controllers, services, repositories, and entities.

```text
src/main/java/com/ankit/jobportal/
│
├── config/
│   └── Security configuration
│
├── controller/
│   ├── UsersController
│   ├── JobPostActivityController
│   ├── RecruiterProfileController
│   ├── JobSeekerProfileController
│   ├── JobSeekerApplyController
│   └── JobSeekerSaveController
│
├── entity/
│   ├── Users
│   ├── RecruiterProfile
│   ├── JobSeekerProfile
│   ├── JobPostActivity
│   ├── JobCompany
│   ├── JobLocation
│   ├── JobSeekerApply
│   ├── JobSeekerSave
│   ├── RecruiterJobDto
│   └── IRecruiterJob
│
├── repository/
│   ├── UsersRepository
│   ├── RecruiterProfileRepository
│   ├── JobSeekerProfileRepository
│   ├── JobPostActivityRepository
│   ├── JobSeekerApplyRepository
│   └── JobSeekerSaveRepository
│
├── services/
│   ├── UsersService
│   ├── RecruiterProfileService
│   ├── JobSeekerProfileService
│   ├── JobPostActivityService
│   ├── JobSeekerApplyService
│   └── JobSeekerSaveService
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
│   ├── job-seeker-profile.html
│   ├── add-jobs.html
│   ├── job-details.html
│   └── saved-jobs.html
│
└── application.properties
```

*Note: This is an overview of the main components. Refer to the repository for the complete source structure.*

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

Open `src/main/resources/application.properties` and configure the MySQL connection:

```properties
spring.application.name=jobportal

spring.datasource.url=${DB_URL:jdbc:mysql://localhost:3306/jobportal}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Set `DB_USERNAME` and `DB_PASSWORD` as environment variables in your IDE or operating system. Set `DB_URL` too when using a database URL other than the default shown above.

**Important:** Never commit database credentials or other sensitive configuration to GitHub.

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

Open:

```text
http://localhost:8080
```

Register an account, log in, and explore the functionality available to the account's assigned role.

## 🔐 Security Implementation

Spring Security handles authentication and authorization.

The current implementation includes:

- Custom login page and authentication provider.
- Custom authentication success handler.
- Role/authority-based access control.
- Protected application routes.
- Logout handling.
- Thymeleaf Spring Security integration.

## 🗄️ Database & Data Access

The application uses MySQL as its relational database. Spring Data JPA and Hibernate handle entity persistence and database operations.

Data access techniques used in the project include:

- Repository methods for retrieving job applications and saved jobs by job seeker or job posting.
- Entity relationships connecting users, profiles, job postings, applications, and saved jobs.
- Unique constraints to prevent duplicate application and saved-job records for the same user-job pair.
- Native SQL queries and `COUNT()` aggregation for recruiter dashboard statistics.
- Interface-based projections and DTOs for transferring aggregated dashboard data.

## 🗺️ Roadmap

Potential future improvements:

- [ ] Job search pagination and sorting.
- [ ] Application status tracking (Pending, Reviewed, Shortlisted, Rejected).
- [ ] Recruiter view of applicant profiles and resumes.
- [ ] Recruiter update and delete job postings.
- [ ] Remove jobs from the saved-jobs list.
- [ ] Improved validation and centralized exception handling.
- [ ] REST API development.
- [ ] Unit and integration testing.
- [ ] Email notifications for application updates.

## 🎯 Learning Objectives

Through this project, I am gaining practical experience in:

- Java backend development and Spring Boot.
- Spring Security authentication and authorization.
- Spring Data JPA and Hibernate.
- Entity relationships, constraints, and database mapping.
- Repository, service, and controller layers.
- Native SQL queries, JPA projections, and DTOs.
- MVC architecture and Thymeleaf server-side rendering.
- File upload and storage.
- Search and filtering workflows.
- Job application and saved-job workflows.
- Maven dependency management.
- Debugging and troubleshooting.

## 👨‍💻 Author

**Ankit Raghav**

Java Backend Developer | Spring Boot | Spring Security | Hibernate | MySQL

- GitHub: [ankitraghav321](https://github.com/ankitraghav321)

## 📌 Project Status

**Active Development 🚧**

The project is being developed incrementally, with new features and improvements added regularly.

---

⭐ If you find this project interesting, feel free to explore the repository and share your feedback.
