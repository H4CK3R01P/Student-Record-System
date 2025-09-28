# Student-Record-System
# Student Record Management System

## Objective
This project is a **console-based Java application** that allows users to manage student records efficiently. Users can perform **CRUD operations** (Create, Read, Update, Delete) on student data using a simple menu-driven interface.

---

## Features
- **Student Class:** Represents student information with fields like `ID`, `Name`, and `Marks`.
- **ArrayList Storage:** Dynamically stores multiple student objects.
- **CRUD Operations:**
  - **Add Student:** Insert new student records.
  - **View Students:** Display all student records.
  - **Update Student:** Modify existing student details using student ID.
  - **Delete Student:** Remove student records by ID.
- **Menu-Driven CLI:** User-friendly console interface.
- **Input Validation:** Handles empty lists and invalid IDs gracefully.

---

## Tools & Technologies
- **Language:** Java  
- **IDE:** VS Code or IntelliJ IDEA Community Edition  
- **Terminal / Command Prompt:** For running the program  

---

## How to Run
1. Open terminal/command prompt and navigate to the folder containing `StudentRecordSystem.java`.
2. Compile the program:
 ```bash
javac StudentRecordSystem.java

```
Example Output
===== Student Record Management System =====

Menu:
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice (1-5): 1
Enter student ID: 101
Enter student name: Alice
Enter student marks: 85
Student added successfully!

Enter your choice (1-5): 2

Student Records:
ID: 101, Name: Alice, Marks: 85
