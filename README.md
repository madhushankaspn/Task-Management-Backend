# Task Master ⚙️ - Backend API (Spring Boot)

This is the backend repository for the **Task Master** application. It provides a robust RESTful API built with Java and Spring Boot, utilizing a MySQL database for persistent data storage.

🔗 **Frontend Repository:** [https://github.com/madhushankaspn/task-management-frontend.git]

## 💻 Tech Stack

* **Language:** Java 17+
* **Framework:** Spring Boot 3
* **Data Access:** Spring Data JPA (Hibernate)
* **Database:** MySQL
* **Build Tool:** Maven

## 🔌 API Endpoints

The following RESTful endpoints have been implemented and thoroughly tested using Postman:

| HTTP Method | Endpoint | Description | Request Body Example |
| :--- | :--- | :--- | :--- |
| `GET` | `/tasks` | Retrieve all tasks | *None* |
| `POST` | `/tasks` | Create a new task | `{ "taskName": "Complete QA testing", "completed": false }` |
| `PUT` | `/tasks/{id}` | Update task status | `{ "taskName": "Complete QA testing", "completed": true }` |
| `DELETE` | `/tasks/{id}` | Delete a task | *None* |

## 📸 Technical Presentation



* **Postman API Verification:**
 <img width="1599" height="995" alt="image" src="https://github.com/user-attachments/assets/696a5a1d-8a63-4de3-ab9b-c96afd80fac7" />


* **Spring Boot Controller:**
 <img width="1734" height="932" alt="image" src="https://github.com/user-attachments/assets/5016cb82-ce17-4de5-bdca-c0efd64b32b4" />


## 🛠️ Getting Started

To run this backend server locally:

1. **Database Setup:**
   - Start MySQL via XAMPP.
   - Create a database named `taskmanager`.
2. **Clone the repository:**
   ```bash
   git clone [(https://github.com/madhushankaspn/Task-Management-Backend.git)]
