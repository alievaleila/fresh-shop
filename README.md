# Fresh Shop - E-Commerce Spring Boot Application

This project is a robust backend implementation for an e-commerce platform built with **Spring Boot**. It focuses on scalable architecture, secure data handling, and clean code principles.

## 🚀 Key Features & Implementation
* **Layered Architecture:** Follows the standard industry pattern: **Controller -> Service -> Repository** for better maintainability and separation of concerns.
* **Entity Relationships:** Implemented complex database relations including `One-to-Many` and `Many-to-One` between **Products** and **Categories**.
* **DTO Pattern:** Utilized **Data Transfer Objects (DTOs)** to ensure secure data exchange between the backend and the frontend, preventing the exposure of internal database entities.
* **CRUD Operations:** Fully functional logic for managing products, including creation, retrieval, updates, and deletion.
* **Dynamic UI:** Integrated with **Thymeleaf** to render server-side data dynamically on the frontend.

## 🛠 Tech Stack
* **Backend:** Java 17+, Spring Boot (Web, Data JPA)
* **Template Engine:** Thymeleaf
* **Build Tool:** Maven
* **Database:** H2 / PostgreSQL
* **Frontend:** HTML5, CSS3, JavaScript (Responsive Design)

## 📂 Project Structure
* `src/main/java`: Contains the core business logic, DTOs, and controllers.
* `src/main/resources`: Holds UI templates and static assets (CSS, Images).
* `pom.xml`: Manages project dependencies and build configurations.

## ⚙️ How to Run
1. Clone the repository.
2. Ensure you have **Maven** and **JDK 17** installed.
3. Run the application via IDE or use `mvn spring-boot:run`.
