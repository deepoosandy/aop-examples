FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9000
ADD target/*.jar aopapp.jar
ENTRYPOINT ["sh", "-c", "java -jar /aopapp.jar"]