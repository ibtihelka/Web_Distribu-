FROM openjdk:8
EXPOSE 8760
ADD target/Annonce-0.0.1-SNAPSHOT.jar Annonce.jar
ENTRYPOINT ["java","-jar","/Annonce.jar"]