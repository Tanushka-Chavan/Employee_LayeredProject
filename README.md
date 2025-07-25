# 🚀 Hibernate_Employee

A **Java + Hibernate + MySQL project** where an **Employee database is created, and various operations are performed using Hibernate with Criteria API for filtering and projections.**

This project helps you **practice ORM, layered architecture, Criteria API filters, and transaction management in Hibernate**, building strong backend fundamentals.

---

## ✨ Project Highlights

✅ Auto-creation of Employee table using Hibernate  
✅ Insert Employee records dynamically  
✅ Fetch employee data using Criteria API with filters and projections  
✅ Update and delete employee records conditionally  
✅ clean layered architecture with a menu-driven option  
✅ Uses **Hibernate Criteria API** for flexible dynamic querying

---

## 🛠️ Tech Stack

| ⚙️ Component | 📌 Technology Used          |
|-------------|-----------------------------|
| Language    | Java SE 17                 |
| ORM         | Hibernate 5                |
| Database    | MySQL 8                    |
| IDE         | Eclipse                    |
| Driver      | MySQL Connector J          |

---

## 🏗️ Project Architecture

```
Hibernate_Employee/
│
├── src/
│   ├── com.tka.configuration
│   │      └── Hibernate.java
│   │
│   ├── com.tka.controller
│   │      └── EmployeeController.java
│   │
│   ├── com.tka.dao
│   │      └── EmployeeDao.java
│   │
│   ├── com.tka.entity
│   │      └── Employee.java
│   │
│   ├── com.tka.frontened
│   │      └── User.java
│   │
│   └── com.tka.service
│          └── EmployeeService.java
│
├── hibernate.cfg.xml
└── Referenced Libraries/
```

✨ **Layers:**

- 🧩 **Entity Layer:** `Employee.java` for database mapping
- 🗃️ **DAO Layer:** `EmployeeDao.java` for DB operations
- 🛠️ **Service Layer:** `EmployeeService.java` for business logic
- 🎛️ **Controller Layer:** `EmployeeController.java` to connect frontend and service
- 🖥️ **Frontend:** `User.java` to test and run
- ⚙️ **Configuration:** `Hibernate.java` for SessionFactory management

---

## 🔍 Criteria Used

| #️⃣ | 🛠️ Criteria Condition     | 💡 Description                                       |
|-----|----------------------------|------------------------------------------------------|
| 1️⃣ | `Restrictions.gt`          | Salary > 20k, 25k; Age > 35                         |
| 2️⃣ | `Restrictions.eq`          | Salary = 51k, Profile = 'dev' / 'test', name='john' |
| 3️⃣ | `Restrictions.ne`          | Salary != 51k                                       |
| 4️⃣ | `Restrictions.le`          | Experience <= 20                                    |
| 5️⃣ | `Restrictions.eq`          | Experience = 21 (for delete)                        |
| 6️⃣ | `Projections.property`     | Fetch specific columns like name                   |

---

## 📥 How to Download & Run

✅ **1️⃣ Clone / Download:**

Download ZIP or clone:
```bash
git clone <repository_link>
```

✅ **2️⃣ Database Setup:**

- Create a database named `CAPGEMINI` in MySQL:
```sql
CREATE DATABASE CAPGEMINI;
```
- Update `hibernate.cfg.xml` with your username and password.

✅ **3️⃣ Add Libraries:**

- Add Hibernate JARs and MySQL Connector JAR to your Eclipse build path.

✅ **4️⃣ Run:**

- Run `User.java` from `com.tka.frontened`.
- Check the console for output for each operation.

---

## 🎯 Learning Outcomes

✅ Hibernate SessionFactory & configuration management  
✅ Using Criteria API for dynamic filtering  
✅ Implementing layered architecture in Java  
✅ Performing CRUD with transactions and projections  
✅ Strengthening backend data management skills

---

## 👩‍💻 Author

**Tanushka Sachin Chavan**  
🎓 Third-Year Computer Engineering Student  
💻 Exploring Java, Hibernate, Spring Boot, and Full-Stack Development

---

✨ **Happy Learning and Coding!**
