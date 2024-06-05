FROM docker.io/openjdk:17-jdk-slim
VOLUME /tmp
COPY target/hello_springboot-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
