FROM openjdk:8
EXPOSE 8760
ADD target/GestionLocation-0.0.1-SNAPSHOT.jar GestionLocation.jar
ENTRYPOINT ["java", "-jar", "/GestionLocation.jar"]