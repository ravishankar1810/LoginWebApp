# LoginWebApp

A simple Java web application demonstrating user login functionality using **Servlets** and an **HTML form**.  
This project handles user input, validates credentials on the backend, and returns a dynamic success or failure message.

---

## 🚀 Features

- **HTML Login Form:** A clean UI for username and password entry.  
- **Servlet Validation:** All credential validation is handled securely on the server-side by a Java Servlet.  
- **Dynamic Response:** The user is shown a personalized welcome message on successful login.  
- **Error Handling:** A clear error message is displayed on login failure.

---

## 🖼️ Screenshots

- **Login Page** ![Login Page Screenshot](https://github.com/ravishankar1810/LoginWebApp/blob/30d35834913687e7169fbdfe18ccf4a414bc9d2c/Screenshot%202025-11-02%20045142.png)
- **Success** ![Success Page Screenshot](https://github.com/ravishankar1810/LoginWebApp/blob/30d35834913687e7169fbdfe18ccf4a414bc9d2c/Screenshot%202025-11-02%20045215.png)
- **Failure** ![Failure Page Screenshot](https://github.com/ravishankar1810/LoginWebApp/blob/30d35834913687e7169fbdfe18ccf4a414bc9d2c/Screenshot%202025-11-02%20045316.png)

*(Add screenshots here)*

---

## 🧰 Technology Stack

- **Java**
- **Jakarta Servlets**
- **Apache Maven** (for dependency management)
- **Apache Tomcat** (as the web application server)
- **HTML & CSS**

---

## ⚙️ Getting Started

Follow these steps to set up and run the project locally.

### ✅ Prerequisites

Make sure you have the following installed:

- **Java JDK** (e.g., JDK 17 or newer)  
- **Apache Maven**  
- **Application Server** compatible with Jakarta Servlets (e.g., Apache Tomcat 10 or 11)  
- **IDE:** IntelliJ IDEA (recommended)

---

### 🧩 How to Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/LoginWebApp.git
## 2 Open in IntelliJ IDEA

### Step 1: Open the Project
- Open the project as a **Maven project** in IntelliJ IDEA.  
- IntelliJ will automatically detect the `pom.xml` file and download dependencies.

---

### Step 2: Configure Tomcat Server
1. Go to **Run > Edit Configurations...**  
2. Click **+ > Tomcat Server > Local**  
3. Point it to your **Tomcat installation directory**  
4. Go to the **Deployment** tab → Click **+** → Add **LoginWebApp:war exploded** artifact  
5. Set the **Application context** to `/` (a single forward slash)

---

### Step 3: Run the Application
- Select your **Tomcat configuration**  
- Click the green **Run ▶️** button  
- Your browser will open to:

```arduino
 http://localhost:8080/
```
### Step 4: 🔐 Test Credentials

| Username | Password     |
|-----------|--------------|
| admin     | password123  |

---

## Step 5: 📝 License
This project is open source and available under the **[MIT License](LICENSE)**.

---

## 💡 Author
Developed by **[Ravi Shakar kr. Singh]**  
Feel free to connect on [GitHub]([https://github.com/your-username](https://github.com/ravishankar1810))

