# 🧪 JUnit 4 & JUnit 5 Testing Project

This repository demonstrates **unit testing in Java** using **JUnit 4** and **JUnit 5 (Jupiter)** frameworks.  
It includes practical examples of writing, running, and managing test cases for Java classes like `Calculator`.  
The project highlights the differences between JUnit 4 and JUnit 5 annotations, execution flow, and assertion handling.

---

## 📘 Overview

- **Language:** Java  
- **Frameworks:** JUnit 4 & JUnit 5  
- **Build Tool:** Maven  
- **IDE Used:** Eclipse  

The project contains two main test classes:
1. `CalculatorServiceTest` — implemented using **JUnit 4**
2. `CalculatorServiceTestJUnit5` — implemented using **JUnit 5 (Jupiter)**

---

## ⚙️ Features

- Demonstrates setup and teardown methods  
  - `@BeforeClass`, `@AfterClass`, `@Before`, `@After` (JUnit 4)  
  - `@BeforeAll`, `@AfterAll`, `@BeforeEach`, `@AfterEach` (JUnit 5)
- Assertion handling with `Assert` and `Assertions`
- Timeout testing in JUnit 4
- Test disabling with `@Disabled` in JUnit 5
- Use of `@DisplayName` for custom test case names
- Demonstrates both static and instance-level lifecycle methods

---

## 🧩 Technologies Used

| Technology | Purpose |
|-------------|----------|
| **Java (JDK 8+)** | Core language for implementation |
| **JUnit 4 (v4.13.2)** | Classic testing framework |
| **JUnit 5 (Jupiter v5.10.0)** | Modern testing platform with enhanced features |
| **Maven** | Build and dependency management |

---

## 📦 Maven Dependencies

Add these to your `pom.xml`:

```xml
<!-- JUnit 4 Dependency -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>

<!-- JUnit 5 Dependency -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```
---
## 🚀 How to Run Tests
1. Open the project in Eclipse or IntelliJ IDEA.
2. Run JUnit 4 Tests:
   -  Right-click on CalculatorServiceTest.java → Run As → JUnit Test
      (Ensure the test runner is set to JUnit 4)
3. Run JUnit 5 Tests:
   -  Right-click on CalculatorServiceTestJUnit5.java → Run As → JUnit Test
      (JUnit 5 automatically detects lifecycle annotations and extensions)

---
## 🧠 Example Output (JUnit 5)
```
This is single time logic
Before Each
First Test Case
After Each
After All The Test Case Logic
```

## 🧮 Example Test Snippet
```
@Test
@DisplayName("This is custom name")
public void addTwoNumbersTest() {
    System.out.println("First Test Case");
    int actual = Calculator.addTwoNumbers(12, 12);
    int expected = 24;
    Assertions.assertEquals(expected, actual, () -> "Not Matched");
}
```

## 🧰 Project Structure
```
src
├── main
│   └── java
│       └── com
│           └── lcwd
│               └── services
│                   └── Calculator.java
└── test
    └── java
        └── com
            └── lcwd
                └── services
                    ├── CalculatorServiceTest.java        # JUnit 4
                    └── CalculatorServiceTestJUnit5.java   # JUnit 5
```
---
👨‍💻 Author
Shubham Pathak
🎓 Sharda University | 💻 Java Developer | ☕ Tech Enthusiast
📧 shubhammpathak566@gmail.com













