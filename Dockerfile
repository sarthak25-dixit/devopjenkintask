FROM openjdk:8
RUN mkdir /app
WORKDIR /app
COPY target/devopAssignment-0.0.1-SNAPSHOT.jar /app
EXPOSE 9099
ENTRYPOINT ["java", "-jar", "devopAssignment-0.0.1-SNAPSHOT.jar"]