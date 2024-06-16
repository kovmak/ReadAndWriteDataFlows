# Data Streams and File Handling in Java

## Table of Contents

- [Overview](#overview)
- [Data Access Layer (DAL)](#data-access)
- [Service Layer](#service-layer)
- [Presentation Layer](#presentation-layer)
- [License](#license)

## Overview

This project demonstrates reading and writing data streams, working with external files, and creating JavaDoc documentation. It includes implementing Data Access Layer (DAL) with two architectural patterns: ActiveRecord and DataMapper/DAO.

## Layers

### Data Access Layer (DAL)
- **FileHandler**: Class for file operations.
- **CRUD Classes**: Classes for Create, Read, Update, and Delete operations.

### Service Layer
- Business logic and data validation.

### Presentation Layer
- User interface and console output.

## Entities

### User
Represents a user with a hashed password.

### Review
Represents a review associated with a user and a subject.

### Product/Service
Represents the subject of the reviews.

## Architectural Patterns

- **ActiveRecord**: Implements the ActiveRecord pattern.
- **DataMapper/DAO**: Implements the DataMapper pattern.

## How to Run

1. Clone the repository:
   ```
   git clone https://github.com/kovmak/ReadAndWriteDataFlows
2. Navigate to the project directory:
   ```
   cd datastreams-java
3. Compile the project:
   ```
   javac -d bin src/**/*.java
4. Run the project:
   ```
   java -cp bin com.example.Main

## Documentation

Generate JavaDoc documentation:
   ```
javadoc -d doc -sourcepath src -subpackages com.krnelx
   ```
## License

This project is licensed under the [MIT License](LICENSE). Refer to the LICENSE file for details.
