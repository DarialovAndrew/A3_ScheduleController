FROM openjdk:11
EXPOSE 8888
ADD target/ScheduleController-0.0.1-SNAPSHOT.jar ScheduleController-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ScheduleController-0.0.1-SNAPSHOT.jar"]