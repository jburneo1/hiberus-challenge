# hiberus-challenge

# Clonar repositorio
git clone https://github.com/jburneo1/hiberus-challenge

# Generate .jar to each microservice
mvn clean package -Dmaven.test.skip=true

# Go to root  ./docker-compose and execute
docker-compose up -d

# Create Clients and Payments mode to  'microservice-bill' and 'microservice-logistic', request is in the route ./request

# Frameworks/libs/
- Swagger to Documentation
- RestTemplate to consume Http
- Maven to Build and all the relationed with dependencies
- Postgresql to connect to a Database
- Try use discover with Eureka Server, Gateway (Zuul) but to I want dockerize them, I was have problems and decide not use.
- Java 8
- Spring Boot V2.3.1., my framework favorite to Develop on the Backend 
- Docker 19.03
- Docker Compose V3.4