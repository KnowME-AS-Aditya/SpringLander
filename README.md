
---

# 🌱 SpringLander

A lightweight **Spring Boot** web application demonstrating clean user authentication, Thymeleaf-powered views, and MySQL/H2-backed persistence.

---

## ✨ Features

- 🔐 **User Registration**: Name, email, and password securely stored.
- 🔑 **User Login**: Session-based login with error handling.
- 📄 **Welcome Page**: Displays user info dynamically after login.
- 📋 **Userbase Dashboard**: Displays registered users in a styled HTML table.
- 🌐 **Thymeleaf Integration**: Dynamic data binding between frontend and backend.
- 📦 **JPA + H2/MySQL**: Seamless database interactions using Spring Data JPA.

---

## 💻 Tech Stack

| Layer          | Tech Used                          |
|----------------|------------------------------------|
| Backend        | Spring Boot, Java 17+              |
| Frontend       | HTML5, CSS3, Thymeleaf, Ionicons   |
| Database       | H2 (default) or MySQL (external)   |
| ORM/DAO        | Spring Data JPA                    |
| Tools & IDE    | IntelliJ                           |

---

## 🚀 Getting Started

### 🛠️ Prerequisites

- Java 17+
- Maven or Gradle
- IntelliJ / STS
- (Optional) MySQL or any JDBC-compatible DB

### 📦 Setup

1. **Clone the repo**
```bash
   git clone https://github.com/KnowME-AS-Aditya/SpringLander.git
   cd SpringLander/proj
````

2. **Run with Maven**

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Visit in browser**
   `http://localhost:8080/signup`

---

## 🧩 Project Structure

```
proj/
├── Controller/        # Handles routing and view logic
├── Model/             # JPA Entity (User)
├── Repo/              # Spring Data Repositories
├── Service/           # Business logic
├── resources/
│   ├── templates/     # HTML pages (signup, login, welcome, users)
│   └── application.properties
└── Application.java   # Entry point
```

---

## 🧪 Demo Flow

1. ✅ Register at `/signup`
2. 🔐 Login at `/loginpage`
3. 🎉 Land on `Welcome.html` with dynamic greeting
4. 👥 View registered users at `/userbase`

---

## 🛡️ Planned Enhancements

* 🛠 Admin Role for deleting users
* 🎯 Spring Security Integration
* 📫 Forgot Password Workflow
* 📊 Real-time dashboard UI improvements
* 🔄 Logout functionality (currently button only)

---

## 📸 Screenshots

> *(Add screenshots of signup, login, and welcome page once available)*

---

## 👨‍💻 Author

**Aditya Ranjan Sahoo**
💼 Backend Developer | IoT Enthusiast | OSS Contributor
📍 [GitHub Profile](https://github.com/KnowME-AS-Aditya)

---

## 📃 License

This project is licensed under the [MIT License](LICENSE).

---

> *"From signup to scale — SpringLander is where your backend begins."* 🚀

```

