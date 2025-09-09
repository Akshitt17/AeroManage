# AeroManage - Microservices-Based Airport Management System

AeroManage is a scalable, modular airport management platform built using a microservices architecture. The backend consists of Spring Boot microservices with Java 17, implementing RESTful APIs secured by **JWT authentication**. The system leverages Netflix Eureka for service discovery and Spring Cloud Gateway as an API Gateway for routing and load balancing. The frontend is built with React to provide a responsive, intuitive user experience.

---

## Features

- Modular Spring Boot microservices with Java 17  
- JWT-based authentication and role-based authorization  
- Service discovery and registration with Netflix Eureka  
- API Gateway using Spring Cloud Gateway for centralized request routing  
- Responsive React frontend on port 5173  
- MySQL persistent storage for each microservice  
- Role-based access control for secure operation  

---

## Architecture Overview

    React Frontend (http://localhost:5173)
                    ↓
    Spring Cloud Gateway (API Gateway)
                    ↓
    Netflix Eureka (Service Registry)
                    ↓
    Spring Boot Microservices (Flight, Passenger, Resource, etc.)
                    ↓
             MySQL Databases



---

## Technology Stack

| Component           | Technology                     |
| ------------------- | -----------------------------  |
| Backend             | Java 17, Spring Boot           |
| Frontend            | React.js                       |
| API Gateway         | Spring Cloud Gateway           |
| Service Discovery   | Netflix Eureka                 |
| Database            | MySQL                          |
| Security            | JWT Authentication             |
| Build Tool          | Maven                          |


---

## Getting Started

### Prerequisites

- Java 17 JDK  
- Node.js (v14+) and npm or yarn  
- MySQL Server  
- Maven 3.x+  
- Docker (optional, for containerized deployment)  

### Backend Setup

1. Clone the repository and navigate to the backend folder:

    ```
    git clone https://github.com/yourusername/aeromanage.git
    cd aeromanage/backend
    ```

2. Configure MySQL connection settings in each microservice’s `application.properties` or `application.yml`.

3. Start Eureka Server:

    cd eurekaserver
    mvn spring-boot:run

4. Start API Gateway:

    cd apigateway
    mvn spring-boot:run


5. Start individual microservices (e.g., flight, passenger, resource):

    cd flight-service
    mvn spring-boot:run

    cd passenger-service
    mvn spring-boot:run

    cd resource-service
    mvn spring-boot:run
 

### Frontend Setup

1. Navigate to the frontend directory:

    cd aeromanage/frontend

2. Install dependencies and run the React dev server:

    npm install
    npm run dev

3. Access the UI at:

    http://localhost:5173


## Usage

- Secure login with JWT-based authentication  
- Manage flights, passengers, and airport resources via frontend UI  
- Role-based access ensures secure operation per user privileges  
- Real-time service discovery and load balanced API routing  


