# The Sweet Cupcake Shop – Java GUI OOP Project

A **Java Swing GUI** project that automates shop transactions and user management for **The Sweet Cupcake Shop** using Object-Oriented Programming (OOP) principles.

This system has two user levels:
- **Cashier**
- **Manager**

---

## 🚀 Overview

This project allows shop staff to:

✅ View all cupcake details (flavors & prices)  
✅ Add new cupcakes and categorize them (classic, seasonal, custom, gluten-free)  
✅ Search for cupcakes by category  
✅ Manager can create new cashier accounts  

Data is saved and retrieved from files (data folder) for persistence.

---

## 📌 Important Setup (Before Running)

To run this project successfully:

1. **Import all `.jar` files from the `lib` folder** into your IDE (Eclipse, IntelliJ, VS Code, etc.).  
   - These are required libraries your project depends on.  
   - Make sure they are added to the **build path / referenced libraries** in your IDE.

2. Open the project in your IDE.

3. Ensure the **`data/` folder** is present so the system can read and write user and cupcake data.

> ⚠️ If the libraries are not added or the data folder is missing, the project will not run properly.

---

## ▶️ How to Run

1. Open your IDE and import the project.  
2. Add all `.jar` files from `lib/` into your project’s classpath.  
3. Run the main class (e.g., `Main.java` or equivalent).  
4. Use the login screen to access features.

---

## 🔐 Sample Login Credentials

| User Level | Username | Password    |
|------------|----------|-------------|
| Manager    | admin    | admin123    |
| Cashier    | cashier1 | cashier123  |

> You can create additional cashier accounts when logged in as **Manager**.

---

## 📁 Project Structure (Example)
Java-OOP-GUI-CupcakeShop/
│
├─ src/ # Java source files
├─ lib/ # Required .jar library files (must be imported in IDE)
├─ data/ # Files storing saved cupcake/user data
├─ images/ # Screenshots (optional)
├─ UserManual.pdf # Detailed user manual for reference
├─ README.md
├─ .gitignore
└─ LICENSE

---

## 🛠 Features

### Cashier
✔ View cupcake list  
✔ Add cupcakes  
✔ Search by category  

### Manager (All Cashier features +)
✔ Create cashier accounts  
✔ Full management access

---

## 📖 User Manual

For detailed instructions, workflow, and screenshots, **open the `UserManual.pdf`** included in this repository. It explains:

- How to login and navigate the system  
- Step-by-step guides for adding, searching, and managing cupcakes  
- How to create cashier accounts (Manager)  
- Data file handling and troubleshooting  

---

## 📌 Notes

- Make sure the **lib folder’s jar files are referenced** so the IDE can compile and run without errors.  
- Keep the **data folder** intact for proper file handling.  
- Add GUI screenshots in the `images/` folder to showcase the interface.  

---

## 📜 License

This project is licensed under the **MIT License**.



