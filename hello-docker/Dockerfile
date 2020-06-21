FROM openjdk:11
WORKDIR /home/ubuntu
ADD hello-docker/target/spring-hello-docker.jar /home/ubuntu/spring-hello-docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring-hello-docker.jar"]
