# Employee_Address

## Framework and Language Used
- Framework: Spring Boot
- Language: Java

## Entity Classes
### Employee
- id: Long
- firstName: String
- lastName: String
- address: Address (One-to-One relationship with Address entity)

### Address
- id: Long
- street: String
- city: String
- state: String
- zipcode: String

## Controllers
### EmployeeController
- GET /employees - Get all employees
- GET /employees/{id} - Get an employee by ID
- POST /employees - Create a new employee
- PUT /employees/{id} - Update an employee by ID
- DELETE /employees/{id} - Delete an employee by ID

### AddressController
- GET /addresses - Get all addresses
- GET /addresses/{id} - Get an address by ID
- POST /addresses - Create a new address
- PUT /addresses/{id} - Update an address by ID
- DELETE /addresses/{id} - Delete an address by ID

## Data Flow
The data flow in the project follows the typical MVC (Model-View-Controller) pattern:

- Controllers: Handle incoming HTTP requests, validate inputs, and coordinate the flow of data between the client and the service layer.
- Service: Contains the business logic of the application, performs operations on the entities, and interacts with the repositories.
- Repositories: Provide the interface to interact with the underlying database.
- Database: Stores the Employee and Address entities and their related data.

## Project Summary
The Employee and Address Management project is a Spring Boot-based application that allows you to manage employees and their corresponding addresses.

The Employee entity represents an employee with attributes such as id, firstName, lastName, and address. The address attribute is a one-to-one relationship with the Address entity.

The Address entity represents an address with attributes such as id, street, city, state, and zipcode.

The project provides separate controller classes for handling CRUD operations on employees and addresses. The controllers expose various endpoints to create, read, update, and delete employees and addresses.
