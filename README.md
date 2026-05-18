# 💰 Expense Manager with Monthly Reports
## 📌 Project Overview

The Expense Manager with Monthly Reports is a Java-based backend console application designed to manage and analyze personal or organizational expenses efficiently. The system reads expense records from CSV files, categorizes spending, and generates detailed monthly expense reports with summaries and analytics.

This project follows a clean layered architecture using Core Java concepts, ensuring modularity, maintainability, and scalability.

The application helps users:

Track expenses
Analyze monthly spending
Generate category-wise reports
Identify highest and lowest expenses
Maintain structured financial records

### 🚀 Tech Stack
Core Technologies
Java 21 – Core application development
Maven – Project build and dependency management
CSV File Handling – Expense data processing
Java Collections Framework – Data storage and manipulation
Java Stream API – Aggregation and report generation
File I/O – Reading configuration and CSV files
Development Tools
Visual Studio Code
IntelliJ IDEA
Git
GitHub

###  🧩 Features & Modules
Features
Read expense records from CSV files
Generate monthly expense reports
Calculate:
Total monthly expenses
Average daily expenses
Highest expense
Lowest expense
Category-wise expense analysis
External configuration using application.properties
Layered architecture implementation
Exception handling for invalid files and records

### 🏗️ Project Structure
org.java.expenseManager
├── model          # Expense entity classes
├── service        # Business logic layer
├── exception      # Custom exception handling
└── ExpenseManagerApp.java

### 🧠 Java Concepts Used
Object-Oriented Programming (OOP)
Interfaces & Implementations
Encapsulation
Exception Handling
Java Collections (List, Map)
Java Stream API
Lambda Expressions
File Handling
Properties File Configuration
LocalDate & YearMonth API
### 📂 Input Files
expenses.csv

Stores expense records.

#### Sample CSV Format
Amount,Description,Date,Category
250,Grocery shopping,2025-07-01,Food
120,Coffee at Starbucks,2025-07-01,Food
1000,Uber ride to airport,2025-07-02,Transport
1800,Electricity bill,2025-07-03,Bills
599,Amazon order,2025-07-04,Shopping

#### application.properties

Used for external configuration.

input.path=C:/path/to/resources

### ⚙️ How to Run the Project
#### Prerequisites
Java JDK 21
Maven
IntelliJ IDEA or VS Code
Git
Setup Instructions
Clone the Repository
git clone <repo-url>
Navigate to Project Directory
cd ExpenseManagerWithMonthlyReports
Configure Properties File

Update:

src/main/resources/application.properties

Example:

input.path=C:/Users/RevathiTannidi/.../src/main/resources

#### Run the Application
Using Maven
mvn clean install
mvn exec:java
Using IntelliJ IDEA
Open project

#### Configure Program Arguments:

path/to/application.properties
Run ExpenseManagerApp
Using VS Code

Update .vscode/launch.json

{
  "version": "0.2.0",
  "configurations": [
    {
      "type": "java",
      "name": "ExpenseManagerApp",
      "request": "launch",
      "mainClass": "org.java.expenseManager.ExpenseManagerApp",
      "args": "\"src/main/resources/application.properties\""
    }
  ]
}
#### 📊 Sample Output
=== Monthly Expense Report: 2025-07 ===

Total Spent: ₹9722.00
Average Daily Expense: ₹313.61

Most Expensive Entry:
Expense{amount=3000, description='Flight ticket', date=2025-07-07, category='Travel'}

Least Expensive Entry:
Expense{amount=75, description='Snacks', date=2025-07-09, category='Food'}

By Category:
 - Travel       : ₹3000.00
 - Shopping     : ₹599.00
 - Housing      : ₹2200.00
 - Transport    : ₹1129.00
 - Bills        : ₹1899.00
 - Food         : ₹895.00
### 🛠️ Modules

1. Expense Management
Store and process expense details
Read expense records from CSV files
Validate and parse data

3. Report Generation
Generate:
Monthly summaries
Category-wise reports
Highest & lowest expenses
Average spending analysis

3. Configuration Management
Externalized configuration using properties files
Dynamic input file path handling

### 🔍 Key Highlights
Layered Architecture
Clean Code Practices
Modular Design
CSV-Based Data Processing
Java Stream API Usage
Exception Handling
Scalable Backend Structure

#### 🔮 Future Enhancements
Database Integration (MySQL/PostgreSQL)
Spring Boot REST APIs
Expense Filtering & Search
User Authentication
Dashboard UI
PDF/Excel Report Export
Charts & Graphs
Monthly Budget Alerts

#### 📚 Learning Outcomes
Core Java Development
File Handling
Collections Framework
Stream API
Exception Handling
Project Structuring
Maven Build Management
Git & GitHub Workflow
#### ``👩‍💻 Author
Revathi Chandra Tannidi
Java Developer
