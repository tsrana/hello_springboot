FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/hello_springboot-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
