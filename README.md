# Java Inheritance Demo: Real Estate Theme 🏡

This project is a console-based Java application designed to clearly demonstrate the five fundamental types of inheritance in Object-Oriented Programming (OOP):
1.  **Single Inheritance**
2.  **Multilevel Inheritance**
3.  **Hierarchical Inheritance**
4.  **Multiple Inheritance** (achieved via interfaces)
5.  **Hybrid Inheritance**

The demonstrations are built around a relatable **Real Estate** theme, using classes like `Property`, `Building`, `Apartment`, and `LuxuryVilla` to make the concepts easy to understand. The application is fully interactive through a command-line menu.

---

## ✨ Features

* **Comprehensive Examples**: Clear, separate examples for each type of inheritance.
* **Menu-Driven Interface**: An easy-to-use menu to navigate between the different demonstrations.
* **Well-Commented Code**: The source code is thoroughly commented to explain the logic and concepts.
* **Javadoc Ready**: The entire project includes Javadoc comments, ready for HTML documentation generation.
* **Educational Focus**: Designed to help students and developers solidify their understanding of Java inheritance.

---

## 🛠️ Prerequisites

To compile and run this project, you will need:
* **Java Development Kit (JDK)**: Version 8 or newer.

---

## 🚀 How to Run

You can run this project either from a command-line terminal or directly from an IDE like Eclipse or IntelliJ IDEA.

### 1. From the Command Line

1.  **Download/Clone the Project**:
    Download the source files and place them in a directory. Make sure all `.java` files are in the same folder.

2.  **Open a Terminal**:
    Navigate to the directory where you saved the `.java` files.

3.  **Compile the Java Files**:
    Run the Java compiler. The `*.java` command compiles all Java files in the current directory.
    ```bash
    javac *.java
    ```

4.  **Run the Application**:
    Execute the main class `Real EstateDemo`.
    ```bash
    java RealEstateDemo
    ```
    The application menu will then appear in your terminal.

### 2. From an IDE (Eclipse / IntelliJ IDEA)

1.  **Create a New Project**:
    Create a new Java project in your IDE.

2.  **Add the Files**:
    Copy all the `.java` files from this project into the `src` folder of your new IDE project.

3.  **Run the Main Class**:
    Locate the `RealEstateDemo.java` file, right-click on it, and select **"Run As" > "Java Application"** (in Eclipse) or **"Run 'RealEstateDemo.main()'"** (in IntelliJ). The program will execute in the IDE's console window.

---

## 📄 Generating Javadoc

The project is fully documented with Javadoc comments. You can generate a professional HTML documentation site.

### From the Command Line

Navigate to the source directory and run the following command:
```bash
# This creates a 'doc' subdirectory with the HTML documentation
javadoc -d doc -author -version *.java
