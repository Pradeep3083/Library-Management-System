# 📚 Library Management System (Java OOP)

## Overview
This is a simple **Library Management System** built in Java using **Object-Oriented Programming (OOP)** concepts such as **Abstraction, Encapsulation, Inheritance, and Polymorphism**.  
It allows users to:
- View all books
- Issue a book
- Return a book

The system runs in the console and uses multiple classes:
- **Book** – Represents a book with title, author, and issue status.
- **User** – Represents a library user with a name and unique ID.
- **Library** – Manages books, users, issuing, and returning books.
- **Main** – Runs the menu-based application.

---

## Features
✅ Add books and users to the library  
✅ View available and issued books  
✅ Issue a book to a user  
✅ Return a book  
✅ Prevent issuing already issued books  

---

## How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/library-management-system.git
2. Open the project in VS Code or any Java IDE.
3. Compile and run.
   ```bash
   javac Main.java
   java Main

---

## Example Output
==== Library Menu ====
1. Show all books
2. Issue a book
3. Return a book
4. Exit
Enter your choice: 1

--- Book List ---

Java Programming by James Gosling [Available]

Python Crash Course by Eric Matthes [Available]

C++ Primer by Stanley Lippman [Available]

---

## OOP Concepts used
- Encapsulation - Private fields with getters/setters.
- Abstraction – Clear separation between book, user, and library logic.
- Polymorphism – Methods like toString() overridden for custom output.
- Inheritance – (Can be extended further if creating specialized book/user types).
