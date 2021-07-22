FROM openjdk:16
EXPOSE 8080
#COPY . /app
#WORKDIR /app
ADD target/accounts-0.0.1-SNAPSHOT.jar accounts.jar
ENTRYPOINT ["java", "-jar", "/accounts.jar"]
CMD java -jar accounts.jar
