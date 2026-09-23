# Maven CI/CD Demo

A beginner-friendly Java Servlet web application for a Jenkins, GitHub, Maven,
and Apache Tomcat CI/CD lab.

## Requirements

- Java 11 or newer
- Maven 3.8 or newer
- Apache Tomcat 9 or newer

## Build with Maven

From the project root, run:

```bash
mvn clean package
```

This command runs the tests and creates the deployable WAR at:

```text
target/sample-web-app.war
```

## Run tests

To run the automated tests without creating the WAR, run:

```bash
mvn clean test
```

## Deploy to Tomcat

1. Build the project with `mvn clean package`.
2. Copy `target/sample-web-app.war` into Tomcat's `webapps` directory.
3. Start or restart Apache Tomcat.

The WAR filename determines the application context path. Because the file is
named `sample-web-app.war`, the default URL is:

```text
http://localhost:8080/sample-web-app/
```

To use the required `/labapp` URL, deploy a copy named `labapp.war` to the
Tomcat `webapps` directory, or configure Tomcat to use `/labapp` as the
context path. Then open:

```text
http://localhost:8080/labapp
```

The application also exposes its servlet at `/status` below the context path:

```text
http://localhost:8080/labapp/status
```

## Project structure

```text
Java-Web-App/
├── pom.xml
├── README.md
└── src/
	├── main/
	│   ├── java/com/example/webapp/
	│   │   ├── ApplicationStatus.java
	│   │   └── StatusServlet.java
	│   ├── resources/
	│   │   └── (reserved for application resources)
	│   └── webapp/
	│       ├── WEB-INF/web.xml
	│       ├── index.html
	│       └── styles.css
	└── test/
		└── java/com/example/webapp/ApplicationStatusTest.java
```