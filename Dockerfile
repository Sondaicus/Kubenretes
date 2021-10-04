FROM openjdk:11

EXPOSE 8080

ARG JAR_FILE=target/kubernetes*.jar

COPY ${JAR_FILE} kubernetes.jar

ENTRYPOINT ["java", "-jar", "/kubernetes.jar"]