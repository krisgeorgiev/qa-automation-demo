# QA Automation Demo

This repository is a **QA/Test/DevOps lab project** showcasing automated API testing with **Java, Maven, JUnit 5 and RestAssured**.  
It is structured to reflect professional workflows (branching, SSH setup for GitHub, and Maven test execution).

---

## 🔹 Lab 1: API Testing with Java + Maven + RestAssured

---
- `pom.xml` >> Maven build file (manages dependencies and test execution).  
- `src/test/java/...` >> Standard Maven test folder.  
- `ApiSmokeTest.java` >> Example RestAssured test file.


Assertions:
- Status code is `200`
- JSON contains `id = 1`
- JSON has a `title` property
- `userId` ≥ 1

---
### How to Run

1. Verify Java + Maven installed:
   ```bash
   java --version
   mvn -v
2. git clone git@github.com:krisgeorgiev/qa-automation-demo.git
   cd qa-automation-demo
   mvn test

