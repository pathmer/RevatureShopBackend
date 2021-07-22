FROM openjdk:16
EXPOSE 9001
ADD /target/Spring-Cloud-Gateway-0.0.1-SNAPSHOT.jar spring-cloud-gateway.jar
ENTRYPOINT ["java", "-jar", "gateway.jar"] 
CMD java -jar spring-cloud-gateway.jar
