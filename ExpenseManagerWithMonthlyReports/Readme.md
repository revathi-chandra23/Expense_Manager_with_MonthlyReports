# Expense Manager with Monthly Reports

A Java-based console application to manage and analyze monthly expenses using CSV files.
This project reads expense records from CSV files, categorizes expenses, and generates monthly summary reports.

## Core Technologies
Java 21

Maven

CSV File Handling

Java Collections Framework

Java Stream API

Exception Handling

File I/O

Development Tools

Visual Studio Code

IntelliJ IDEA

Git

GitHuUsed

Object-Orienteb Programming (OOP)

Interfaces and Implementations

Encapsulation

Exception Handling

File Processing

Properties File Configuration

LocalDate / YearMonth API

Collections (List, Map)

Stream Operations

Lambda Expressions


## Features
Read expense data from CSV files

Generate monthly expense reports

Category-wise expense analysis


Calculate:

Total monthly expense

Average daily expense

Highest expense

Lowest expense

External configuration using application.properties


Clean layered architecture

## Project Structure
src/
├
── main/

│   ├── java/

│   │   └── org/java/expenseManager/

│   │       ├── model/

│   │       ├── service/

│   │       ├── exception/

│   │       └── ExpenseManagerApp.java

│   └── resources/

│       ├── expenses.csv

│       └── application.properties



## Sample CSV Format
Amount,Description,Date,Category
250,Grocery shopping,2025-07-01,Food
120,Coffee at Starbucks,2025-07-01,Food
1000,Uber ride to airport,2025-07-02,Transport
1800,Electricity bill,2025-07-03,Bills
599,Amazon order,2025-07-04,Shopping
Configuration

#### Update application.properties:

input.path=C:/path/to/resources
##### How to Run
Using IntelliJ IDEA
Open the project

Configure program arguments:

path/to/application.properties
Run ExpenseManagerApp
Using VS Code

Update .vscode/launch.json:

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

#### Sample Output
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
  Learning Outcomes
  File handling in Java
  Exception handling
  Collections framework
  Stream API usage
  Clean project structure
  Maven project setup
 

### Author

Revathi Chandra Tannidi