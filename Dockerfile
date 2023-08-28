FROM eclipse-temurin:17
COPY target/dockerfg.jar dockerfq.jar
CMD ["java","-jar","dockerfg"]