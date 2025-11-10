# Jenkins Maven Test Project

A simple Java Maven project for testing Jenkins, JDK, and Maven integration.

## Project Structure

```
Test/
├── pom.xml                          # Maven configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── jenkins/
│   │               └── test/
│   │                   ├── App.java           # Main application class
│   │                   └── Calculator.java    # Calculator utility class
│   └── test/
│       └── java/
│           └── com/
│               └── jenkins/
│                   └── test/
│                       ├── AppTest.java        # Unit tests for App
│                       └── CalculatorTest.java # Unit tests for Calculator
└── README.md
```

## Requirements

- JDK 11 or higher
- Maven 3.6 or higher

## Building the Project

To compile the project, run:

```bash
mvn clean compile
```

## Running Tests

To run the unit tests:

```bash
mvn test
```

After running tests, results will be available in `target/surefire-reports/`

## Creating JAR

To package the application as a JAR file:

```bash
mvn package
```

The JAR file will be created in the `target/` directory as `jenkins-maven-test-1.0-SNAPSHOT.jar`

## Running the Application

After packaging, run the application:

```bash
java -jar target/jenkins-maven-test-1.0-SNAPSHOT.jar
```

Or use Maven:

```bash
mvn exec:java -Dexec.mainClass="com.jenkins.test.App"
```

## Maven Build Lifecycle

Complete build process (clean, compile, test, package):

```bash
mvn clean package
```

## Jenkins Integration

This project is designed to be built and tested by Jenkins. The typical Jenkins build will:

1. Pull the code from the repository
2. Run `mvn clean package` to compile, test, and package
3. Archive the JAR artifact from `target/`
4. Publish test results from `target/surefire-reports/`

## Output

After a successful Maven build, you will find:

- **target/classes/** - Compiled .class files
- **target/test-classes/** - Compiled test .class files
- **target/jenkins-maven-test-1.0-SNAPSHOT.jar** - Packaged JAR file
- **target/surefire-reports/** - Test results (XML and TXT format)

## Project Details

- **Group ID**: com.jenkins.test
- **Artifact ID**: jenkins-maven-test
- **Version**: 1.0-SNAPSHOT
- **Java Version**: 11