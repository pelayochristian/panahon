# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8888

ADD target/eurekaserver.jar eurekaserver.jar

# Run the jar file
ENTRYPOINT ["java","-jar","eurekaserver.jar"]
