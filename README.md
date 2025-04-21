# Dating App

A modern online dating platform that helps users find meaningful connections. This application provides a comprehensive suite of features for online matching and communication.

## Features

- **User Profiles**: Create detailed profiles with photos and personal information
- **Matching Algorithm**: Find compatible matches based on preferences and interests
- **Real-time Messaging**: Communicate with your matches without restrictions
- **Photo Sharing**: Upload and manage multiple profile photos
- **Preference Settings**: Customize search criteria including age range, distance, and interests
- **User Blocking**: Control your experience by blocking unwanted interactions

## Technology Stack

### Backend
- **Java 17**: Core programming language
- **Spring Boot**: Application framework
- **Spring Data JPA**: Data access and persistence
- **Spring Security**: Authentication and authorization
- **Hibernate**: ORM for database interactions
- **PostgreSQL**: Relational database
- **Maven**: Build automation and dependency management
- **RESTful API**: For client-server communication

### Frontend (Planned)
- **Angular**: For building dynamic user interfaces

## Getting Started

### Prerequisites
- JDK 17
- Maven
- PostgreSQL
- IDE (Cursor AI or similar)

### Database Setup
1. Create a PostgreSQL database named `dating_app_db`
2. Configure database connection in `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/dating_app_db
spring.datasource.username=postgres
spring.datasource.password=admin
```

### Running the Application
1. Clone the repository
2. Navigate to the project directory
	export JAVA_HOME="/c/Program Files/Java/jdk-17"
    export PATH="$JAVA_HOME/bin:$PATH"
3. Run:
`mvn clean package && java -cp target/classes:target/dependency/* com.ilieff.datingapp.DatingAppApplication`
 `mvn clean install -X` and `mvn spring-boot:run -X`
4. The application will be available at `http://localhost:8080`

## API Documentation
API documentation will be available at `http://localhost:8080/swagger-ui.html` when running the application.

## Contributing
Contributions are welcome! Please feel free to submit a Pull Request.