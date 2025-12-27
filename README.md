# Smart Inventory Management System

## Overview

A Java-based application for managing inventory with a Swing GUI and MySQL database.

## Features

- User login
- Inventory dashboard
- Product, supplier, and sales management

## Prerequisites

- JDK 8+
- MySQL Server
- MySQL Connector/J (JDBC driver)
- XAMPP or similar tool for MySQL

## Setup

### 1. Clone the Repository

git clone <repository-url>
cd SmartInventoryManagementSystem
## 2.Set up MYSQL
Start MySQL using XAMPP or another tool.

Create Database:


CREATE DATABASE inventory;
Run the SQL Schema:

Run the SQL commands from resources/database/schema.sql to set up the users table.

Insert Sample Data (optional):


INSERT INTO users (username, password) VALUES ('admin', 'admin123');
## 3.Configure Database Connection
Create a config.properties file in the project root with the following content:


db.url=jdbc:mysql://localhost:3306/inventory
db.user=root
db.password=your_mysql_password

## 4. Build and Run
Command Line
Compile:

javac -cp "lib/mysql-connector-j-9.0.0.jar" -d bin src/com/inventory/main/*.java
Run:

java -cp "bin;lib/mysql-connector-j-9.0.0.jar" com.inventory.main.App "jdbc:mysql://localhost:3306/inventory" "root" "your_mysql_password"
IDE
Import the project.
Add MySQL Connector/J to the classpath.
Run the App class.

## Screenshots
Login Form:

![LoginSS](https://github.com/user-attachments/assets/ca78baf3-bd03-497a-8a79-762ca08ca9f2)

Dashboard:

![DashBoardSS](https://github.com/user-attachments/assets/912b7d79-bb4e-443c-830d-c42a8307b48e)

## Troubleshoots
Connection Issues: Check MySQL server, URL, username, and password in config.properties.
Driver Not Found: Ensure MySQL Connector/J is in the lib directory and included in the classpath.
Contributing
Fork the repo and submit a pull request for contributions.


## Contact
For questions, email eshan.kesarwani@gmail.com
