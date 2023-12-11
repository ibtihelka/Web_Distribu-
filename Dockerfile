FROM openjdk:8
EXPOSE 8762
ADD target/User-0.0.1-SNAPSHOT.jar User.jar
ENTRYPOINT ["java","-jar","/User.jar"]