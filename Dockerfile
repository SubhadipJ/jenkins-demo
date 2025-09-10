FROM openjdk:17-jdk-slim
ADD target/JenkinsDemo.jar JenkinsDemo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/JenkinsDemo.jar"]