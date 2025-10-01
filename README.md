# 📚 Library  

A simple **Java-based Library Management System** built as a class case study. This project demonstrates the **four pillars of Object-Oriented Programming (OOP)**:  

- **Encapsulation** → Secure book details using private fields and getters/setters.  
- **Inheritance** → Student and Staff classes inherit common properties from Person.  
- **Polymorphism** → A Person reference can point to Student or Staff with different behaviors.  
- **Abstraction** → Abstract class `LibraryUser` enforces implementation of `accessLibrary()` in subclasses.  

---

## 🚀 Features  
- Students can **borrow** and **return** books.  
- Staff can **add** and **remove** books.  
- Books track their **availability** status.  
- Abstraction ensures all library users define how they access the library.  

---

## 🛠️ Technologies  
- **Language**: Java (JDK 17+ recommended)  
- **Tools**: Any IDE (IntelliJ, Eclipse, VS Code) or terminal with `javac`  

---

## 📂 Project Structure  

```
src/
 ├── Book.java
 ├── Person.java
 ├── Student.java
 ├── Staff.java
 ├── LibraryUser.java
 ├── StudentUser.java
 ├── StaffUser.java
 └── LibraryDemo.java   // main entry point
```

---

## ▶️ Running the Project  

1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/library-management-system.git
   cd library-management-system
   ```

2. Compile the project:  
   ```bash
   javac src/*.java
   ```

3. Run the demo:  
   ```bash
   java -cp src LibraryDemo
   ```

---

## 🎯 Learning Outcomes  
This project demonstrates:  
- How encapsulation secures class data.  
- How inheritance promotes code reuse.  
- How polymorphism allows different behaviors from the same reference type.  
- How abstraction enforces a contract for subclasses.  

---

## 📖 Case Study Tasks  

1. **Encapsulation** → `Book` class with private fields, getters, and setters.  
2. **Inheritance** → `Student` extends `Person`.  
3. **Polymorphism** → `Person` reference used for `Student` and `Staff`.  
4. **Abstraction** → Abstract `LibraryUser` class with implemented subclasses.  
5. **Integration** → `LibraryDemo` combining all concepts.  

---

## 👩‍💻 Author  
Developed as part of a **university class task** to practice OOP principles in Java.  
