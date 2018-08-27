FROM openjdk:8u171-jdk-alpine3.8
MAINTAINER John Doe "john.doe@example.com"
EXPOSE 8080
WORKDIR /app
COPY utilityapp-0.1.jar application.jar
COPY app-entrypoint.sh app-entrypoint.sh
RUN chmod +x app-entrypoint.sh
ENTRYPOINT ["/app/app-entrypoint.sh"]
