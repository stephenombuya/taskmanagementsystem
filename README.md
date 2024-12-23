# **Task Management System Documentation**
Welcome to the Task Management System repository! This document serves as comprehensive documentation to help you understand, contribute to, and use the Task Management System built entirely in Java.

## **Table of Contents**
- Introduction
- Features
- Technologies Used
- Setup and Installation
- Usage
- Project Structure
- Contributing
- License



### **Introduction**
The Task Management System is a Java-based application designed to simplify task management by allowing users to create, manage, and track their tasks effectively. The system can be utilized for personal or team-based task tracking.


### **Features**
  - **Task Creation**: Add new tasks with details like title, description, due date, and priority.
  - **Task Management**: Update, delete, or mark tasks as completed.
  - **Categorization**: Organize tasks based on categories or statuses.
  - **Search and Filter**: Search for tasks or filter them by status, priority, or due date.
  - **Console-Based Interface**: Interact with the application via a command-line interface (CLI).


### **Technologies Used**
  - **Programming Language**: Java (JDK 8+ recommended)
  - **IDE**: IntelliJ IDEA, Eclipse, or any Java IDE
  - **Build Tool**: Gradle/Maven (Optional for dependencies)
  - **Database**: None (Uses in-memory data structures for simplicity)



### **Setup and Installation**
 **Prerequisites**
  1. Install Java Development Kit (JDK) version 8 or higher.
  2. (Optional) Install an IDE like IntelliJ IDEA or Eclipse.
  
 **Steps to Run the Application**
 
  1. Clone the repository:

 ``` bash
  git clone https://github.com/stephenombuya/taskmanagementsystem/tree/main
  cd task-management-system
  ```

2. Compile the Java source files:

```bash
javac -d out src/**/*.java
```

3. Run the application:

```bash
java -cp out Main
```



### **Usage**
The application provides a menu-driven interface. Once started, you will see options like:
  - Add a Task
  - View All Tasks
  - Update a Task
  - Delete a Task
  - Mark Task as Complete
  - Search Tasks
  - Exit


### **Project Structure**

```plaintext
task-management-system/
├── src/
│   ├── main/
│   │   ├── Main.java               // Entry point of the application
│   │   ├── Task.java               // Model class for Task entity
│   │   ├── TaskManager.java        // Handles task operations
│   │   ├── Menu.java               // Provides menu-based navigation
│   │   └── utils/
│   │       ├── InputValidator.java // Utility for input validation
│   │       └── DateUtils.java      // Utility for date handling
├── out/                            // Compiled output (auto-generated)
├── README.md                       // Project documentation
└── LICENSE                         // License information
```


### **Contributing**
We welcome contributions! Here's how you can contribute:

1. Fork the repository.
2. Create a branch for your feature or bug fix:

```bash
git checkout -b feature-name
```

3. Commit your changes and push to your branch:

```bash
git commit -m "Added new feature"
git push origin feature-name
```

4. Create a pull request describing your changes.


### **License**
This project is licensed under the Apache License 2.0. Feel free to use and modify the code as per the terms of the license.

For questions, suggestions, or issues, please open an [issue](issues) or reach out to us.

