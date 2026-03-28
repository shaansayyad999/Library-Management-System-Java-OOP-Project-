# Library Management System - Documentation

## 1. Project Overview

The Library Management System is a console-based Java application designed to manage books and members efficiently. The system allows users to perform operations such as adding books, registering members, searching for books, and managing borrowing and returning of books.

This project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts including encapsulation, class design, and modular architecture.

---

## 2. Setup Instructions

Follow the steps below to run the project:

1. Open terminal or command prompt
2. Navigate to the project directory

cd LibraryManagementSystem/src

3. Compile all Java files

javac *.java

4. Run the main program

java LibrarySystem

---

## 3. Code Structure

The project is organized into multiple classes, each with a specific responsibility:

* **Book.java**
  Defines book attributes such as ISBN, title, author, genre, and availability status.

* **Member.java**
  Represents a library member and handles borrowing and returning of books.

* **Library.java**
  Manages collections of books and members, and contains core functionalities like search, borrow, return, and display.

* **LibrarySystem.java**
  Main class that provides a menu-driven interface for user interaction.

This modular structure ensures clean code organization and separation of concerns.

---

## 4. Visual Documentation

Screenshots are included in the `screenshots` folder demonstrating:

* Main menu interface
* Adding books
* Registering members
* Viewing all books
* Searching books
* Borrowing books
* Returning books

These screenshots validate the working of all features implemented in the system.

---

## 5. Technical Details

### Data Structures Used

* **ArrayList** is used to store books and members dynamically.
* It allows easy insertion, deletion, and traversal of data.

### Algorithms Implemented

* **Linear Search** is used for searching books by title or author.
* Iteration is used to display and filter available books.

### OOP Concepts Applied

* **Encapsulation**: Private fields with public getters/setters
* **Abstraction**: Methods hide internal logic (borrow, return, search)
* **Modularity**: Separate classes for Book, Member, and Library

### System Architecture

* Follows a **layered approach**:

  * Data Layer → Book, Member
  * Logic Layer → Library
  * Interface Layer → LibrarySystem

---

## 6. Testing Evidence

The system was tested using multiple scenarios:

* Adding multiple books and members
* Searching books with different keywords
* Borrowing available books
* Handling unavailable books
* Returning borrowed books
* Viewing updated availability

Sample test data is included in the `sample_data` folder.

---

## 7. Technical Requirements Met

The following technical requirements have been successfully implemented:

* Book class with attributes: ISBN, title, author, genre, availability
* Member class with attributes: memberId, name, contact, borrowedBooks
* Proper encapsulation using private variables and public methods
* Library class managing all operations
* Search functionality for books using title/author
* Borrow and return functionality with validation
* Menu-driven user interface
* Use of ArrayList for dynamic data handling
* Input handling using Scanner

---

## 8. Conclusion

The Library Management System successfully demonstrates the application of Object-Oriented Programming principles in Java. The project is modular, easy to understand, and provides all required functionalities such as book management, member handling, searching, and borrowing operations.

It serves as a strong foundation for building more advanced systems with additional features like file handling, GUI, or database integration.