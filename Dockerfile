FROM adoptopenjdk/openjdk16:ubi
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build/libs/*.jar app.jar
EXPOSE 80
CMD ["java", "-jar", "app.jar"]