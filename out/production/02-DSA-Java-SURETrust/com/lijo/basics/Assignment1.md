# Assignment: Implementing CRUD Operations with Java

## Objective
To build a simple Java application that performs CRUD (Create, Read, Update, Delete) operations on a database and exposes the functionality via RESTful APIs. Learn to interact with a database, use an ORM framework (e.g., Hibernate or JPA), and test APIs using tools like Postman.

---

## Assignment Question

### Problem Statement
You are tasked with creating a "Student Management System" using Java. The system should allow users to manage student records stored in a database through a RESTful API.

### Requirements

1. **Database Setup:**
    - Create a MySQL database named `student_management`.
    - Inside the database, create a table named `students` with the following fields:
      ```sql
      CREATE TABLE students (
          id INT AUTO_INCREMENT PRIMARY KEY,
          name VARCHAR(50) NOT NULL,
          age INT NOT NULL,
          course VARCHAR(50) NOT NULL,
          email VARCHAR(100) NOT NULL UNIQUE
      );
      ```

2. **Application Development:**
    - Develop a Spring Boot application that performs CRUD operations on the `students` table using Hibernate/JPA.
    - Implement the following RESTful API endpoints:

      #### Endpoints:
        - **POST** `/api/students` - Add a new student.
            - Example request body:
              ```json
              {
                  "name": "John Doe",
                  "age": 21,
                  "course": "Computer Science",
                  "email": "john.doe@example.com"
              }
              ```

        - **GET** `/api/students` - Retrieve all students.
        - **GET** `/api/students/{id}` - Retrieve a specific student by ID.
        - **PUT** `/api/students/{id}` - Update an existing student's details.
        - **DELETE** `/api/students/{id}` - Delete a student by ID.

3. **Validation:**
    - Ensure that all fields are validated:
        - The `email` field must be unique.
        - The `age` field must be a positive integer.
    - Return appropriate HTTP status codes (e.g., 201 for created, 404 for not found).

4. **Testing:**
    - Test the API endpoints using Postman.
    - Take screenshots of requests and responses for each endpoint.

5. **Documentation:**
    - Create a `README.md` file with the following:
        - Setup instructions for running the application.
        - A brief description of the API endpoints.
    - Prepare a PDF report that includes:
        - Screenshots of Postman requests and responses.
        - A brief explanation of each implemented feature.

6. **Submission Guidelines:**
    - Upload your project files to your `SURE Trust` GitHub repository.
    - Include the `README.md` file and the PDF report in the repository.

---

## Evaluation Criteria
- **Functionality:** Proper implementation of CRUD operations (40%).
- **Code Quality:** Readability and adherence to best practices (20%).
- **Validation and Error Handling:** Appropriate field validation and error messages (15%).
- **Testing:** Postman screenshots and thorough testing of endpoints (15%).
- **Documentation:** Clear and concise README and report (10%).
