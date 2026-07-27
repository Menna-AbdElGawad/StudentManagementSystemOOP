````markdown
# 🎓 Student Management System

A simple **Java Console Application** built using **Object-Oriented Programming (OOP)** concepts to manage student records. The system allows users to add students, display their information, calculate statistics, search by student ID, and sort students based on their grades.

---

## 📌 Features

- ➕ Add students with validation.
- 👨‍🎓 Display all students' information.
- 📊 Calculate the average grade.
- 🏆 Find the student with the highest grade.
- 🔍 Search for a student by ID.
- ✅ Count passed and failed students.
- 📈 Sort students by grade (Ascending).
- ❌ Input validation for:
  - Number of students.
  - Student grades (0 - 100).
  - Menu options.
  - Student ID.

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays
- Arrays.sort() with Comparator
- Scanner Class

---

## 📂 Project Structure

```text
StudentManagementSystem/
│
├── Main.java
├── Student.java
└── README.md
````

---

## 📋 Menu

```text
1. Display Students
2. Calculate Average Grade
3. Find Highest Grade
4. Search Student by ID
5. Count Passed and Failed Students
6. Sort Students by Grade
0. Exit
```

---

## 🧱 Student Class

Each student contains:

* Student ID
* Student Name
* Grade

### Grade Status

| Grade    | Status    |
| -------- | --------- |
| 90 - 100 | Excellent |
| 75 - 89  | Good      |
| 60 - 74  | Pass      |
| Below 60 | Fail      |

---

## 🚀 How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/StudentManagementSystem.git
```

2. Open the project in your preferred Java IDE (IntelliJ IDEA, Eclipse, or VS Code).

3. Compile the project.

```bash
javac Main.java Student.java
```

4. Run the application.

```bash
java Main
```

---

## 📸 Sample Output

### Welcome Screen

```text
== Welcome to the Student Management System! ==
===============================================
```

### Main Menu

```text
=== Main Menu ===

1. Display Students
2. Calculate Average Grade
3. Find Highest Grade
4. Search Student by ID
5. Count Passed and Failed Students
6. Sort Students by Grade
0. Exit
```

### Student Information

```text
- Student ID: 1
- Student Name: Menna
- Grade: 95.0
- Grade Status: Excellent
```

---

## 💡 OOP Concepts Used

* Classes & Objects
* Constructors
* Encapsulation
* Getters & Setters
* Method Overloading
* Object Arrays

---

## 📈 Future Improvements

* Add Update Student feature.
* Delete Student by ID.
* Save and load data from files.
* Search by student name.
* Sort by name or ID.
* Store data using Collections (`ArrayList`) instead of arrays.

---

## 👩‍💻 Author

**Menna AbdElGawad**

```
```
