
FROM openjdk:11-jre-slim
WORKDIR /app
COPY .mvn .mvn
COPY target/nxenesitApplication*.jar /app/
CMD ["java", "-jar", "nxenesitApplication.jar"]
