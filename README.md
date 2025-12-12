# 🏢 Business Employee Management System

![Java](https://img.shields.io/badge/Java-JDK_8%2B-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-IDE-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

> A robust **Java Console Application** designed to simulate a corporate employee management system. It demonstrates mastery of advanced **Object-Oriented Programming (OOP)** principles including Inheritance, Polymorphism, Abstraction, and Encapsulation.

---

## 🚀 Features

- **Employee Management:** Add different types of employees (`Manager`, `SalesPerson`, `Intern`) with specific attributes (Bonus, Commission).
- **Dynamic Role Identification:** Uses `instanceof` to identify and display specific job roles (e.g., "Project Manager", "Sales Person").
- **Payroll System:** Calculates monthly salaries dynamically based on the specific rules of each role.
- **Real-time Counter:** Implements a `static` counter in the parent class to track the total number of employees created across the system instantly.
- **Interactive Menu:** A user-friendly **CLI** (Command Line Interface) using `Scanner` to navigate the system comfortably.
- **Data Encapsulation:** All sensitive data (Salaries, IDs) is protected using private access modifiers.

---

## 🛠️ Concepts & Tech Stack

### 🔹 OOP Concepts Applied
1.  **Inheritance:**
    - `Employee` is the parent abstract class.
    - `Manager`, `SalesPerson`, and `Intern` inherits common attributes like `id`, `name`, and `baseSalary`.
2.  **Polymorphism:**
    - Utilized `ArrayList<Employee>` to store different object types in a single collection.
    - Overridden methods like `calculateSalary()` behave differently based on the object type at runtime.
3.  **Abstraction:**
    - The `Employee` class is `abstract` to enforce a template for all employees.
4.  **Encapsulation:**
    - Fields are `private` and accessed via public Constructors and Getters.
    - The `static employeeCount` is protected and accessed via a static method.

### 🔹 Technologies
- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub

---

## 📂 Project Structure

```text
src/
├── Main.java          // Entry point: Contains Scanner Menu & Business Logic
├── Employee.java      // Abstract Parent Class (Contains static counter & abstract methods)
├── Manger.java        // Child Class: Adds Bonus logic
├── SalesPerson.java   // Child Class: Adds Commission logic
└── Intern.java        // Child Class: Basic salary structure

📸 Output Example
=== 🏢 Company System Menu ===
1. Add New Employee
2. View All Employees
3. View Total Payroll
4. Exit
👉 Choose an option: 2

--- 📋 Employee List ---
Employee ID: 101
Name: Arkan
Base Salary: 15000.0
Role: Project Manager
Total Employees Count: 5
-------------------------
Employee ID: 102
Name: Sarah
Base Salary: 8000.0
Role: Sales Person
Total Employees Count: 5
-------------------------
💻 How to Run
Clone the repository:git clone [https://github.com/Arkan2320/Business-Employee-Management-System.git](https://github.com/Arkan2320/Business-Employee-Management-System.git)
Open in IntelliJ IDEA.
Run the Main.java file.
Follow the menu instructions in the console.
