
# Insider Test Automation Project (TestNG)

This is a Selenium-based test automation framework using **Java**, **TestNG**, and **Allure** for reporting. It supports functional and smoke tests for Insider's web-based UI.

---

## 📂 Project Structure
```
insider_test_testng/
│
├── src/main/java
│   ├── expecteds              # Expected values used in tests
│   ├── locators               # Locator definitions for web elements
│   ├── pages                  # Page Object classes for different pages
│   └── utils                  # Utility classes for common functionalities
│
├── src/test/java/tests
│   ├── base                   # Base test classes
│   ├── functional             # Functional test cases
│   └── smoke                  # Smoke test cases
│
├── src/test/resources
│   └── config.properties      # Configuration properties
│
├── allure-results             # Allure report results
├── screenshots                # Failure screenshots
├── testNGxmlFiles             # TestNG XML files for test execution
├── pom.xml                    # Maven configuration
└── README.md                  # Project description
```

## 🛠 Technologies Used
- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Allure Reporting**

## 🚀 How to Run the Tests
1. Clone the repository.
2. Run the tests using TestNG XML files available in `testNGxmlFiles`.


## 📜 License
This project is for demonstration purposes.
