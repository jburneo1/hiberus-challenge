# hiberus-challenge

# Clonar repositorio
git clone https://github.com/jburneo1/hiberus-challenge

# Generate .jar to each microservice
mvn clean package -Dmaven.test.skip=true

# Go to root  ./docker-compose and execute
docker-compose up -d

# Create Clients and Payments mode to  'microservice-bill' and 'microservice-logistic', request is in the route ./request

