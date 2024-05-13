Task Manager API

The Task Manager API is a simple yet powerful RESTful service designed with Spring Boot. It allows users to manage tasks effectively with functionalities like adding, updating, deleting, and fetching tasks.

Features

Create Tasks: Add new tasks with details such as title, description, and priority.
Read Tasks: Retrieve the list of tasks or a specific task by its ID.
Update Tasks: Modify the details of an existing task.
Delete Tasks: Remove tasks from the system.
Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites

What things you need to install the software and how to install them:

JDK 11 or newer
Maven 3.6 or Gradle 7.0 (Choose depending on your setup)
H2 Database (Embedded for development)
Git (For version control)

Installing

A step-by-step series of examples that tell you how to get a development environment running:

Clone the repository:

git clone https://github.com/swedevswe/taskmanager.git
cd taskmanager

Run the application with Maven:

mvn spring-boot:run

Or with Gradle:

./gradlew bootRun

Access the application:

Visit http://localhost:8080 in your web browser.

API Reference
Below is a brief overview of the API endpoints provided by the Task Manager API:

GET /tasks - Retrieve all tasks
GET /tasks/{id} - Retrieve a task by its ID
POST /tasks - Create a new task
PUT /tasks/{id} - Update an existing task
DELETE /tasks/{id} - Delete a task

Built With
Spring Boot - The framework used
Maven - Dependency Management
H2 Database - Embedded database

