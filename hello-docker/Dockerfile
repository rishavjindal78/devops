FROM openjdk:11
WORKDIR /home/ubuntu
ADD spring-hello-docker.jar /home/ubuntu/spring-hello-docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring-hello-docker.jar"]
