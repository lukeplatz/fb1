FROM openjdk:8-jre-alpine

USER root

ADD ./target/fb1-0.1-SNAPSHOT.jar /opt/fb1-0.1-SNAPSHOT.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/fb1-0.1-SNAPSHOT.jar"]

EXPOSE 8080

