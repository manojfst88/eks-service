# This is Dockerfile that will be used to build the exercises application image
FROM eclipse-temurin:17.0.6_10-jdk
RUN mkdir /usr/local/app
RUN mkdir /usr/local/app/resources
COPY ./target/eks-service-0.0.1-SNAPSHOT.jar /usr/local/app/eks-service.jar
COPY ./src/main/resources/* /usr/local/app/resources/
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "/usr/local/app/eks-service.jar"]