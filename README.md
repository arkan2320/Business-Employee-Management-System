# 🏢 Business Employee Management System

> A robust Java console application designed to simulate a corporate employee management system. It demonstrates advanced **Object-Oriented Programming (OOP)** principles including Inheritance, Polymorphism, Abstraction, and Encapsulation.

---

## 🚀 Features

- **Employee Management:** Add different types of employees (`Manager`, `SalesPerson`, `Intern`) with specific attributes.
- **Dynamic Role Identification:** Uses `instanceof` to identify and display specific roles (e.g., "Project Manager 👔").
- **Payroll System:** Calculates monthly salaries based on base salary, bonuses, and commissions.
- **Real-time Tracking:** Implements a **Static Counter** to track the total number of employees created across the system.
- **Interactive Menu:** A user-friendly CLI (Command Line Interface) using `Scanner` to navigate the system.
- **Data Validation:** Prevents invalid inputs during employee creation.

---

## 🛠️ Tech Stack & Concepts

### Technologies
- **Language:** Java (JDK 8+)
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub

### OOP Concepts Applied
1.  **Inheritance:** - `Employee` is the parent abstract class.
    - `Manager`, `SalesPerson`, and `Intern` are child classes inheriting common attributes (`name`, `id`, `salary`).
2.  **Polymorphism:** - Used `ArrayList<Employee>` to store different object types in a single list.
    - Overridden methods like `calculateSalary()` and `displayInfo()` behave differently based on the object type.
3.  **Abstraction:** - The `Employee` class is `abstract` to prevent generic instantiation and force subclasses to implement specific logic.
4.  **Encapsulation:** - All fields are `private` to ensure data security.
    - Access is controlled via public Getters/Setters and Constructors.
    - The `static employeeCount` is protected and accessed only via a static method.

---

## 📂 Project Structure

```text
src/
├── Main.java          // Entry point with Scanner Menu & Business Logic
├── Employee.java      // Abstract Parent Class (contains static counter)
├── Manager.java       // Child Class (adds Bonus logic)
├── SalesPerson.java   // Child Class (adds Commission logic)
└── Intern.java        // Child Class (Basic salary structure)
