FROM openjdk:8-jdk-alpine


ARG APP_DIR=/app/
ARG JAR_FILE=target/meu-projeto-0.0.1-SNAPSHOT.jar

RUN mkdir -p $APP_DIR


WORKDIR $APP_DIR

# Copiar o JAR do seu projeto para o diretório do aplicativo
COPY ${JAR_FILE} $APP_DIR


ENTRYPOINT ["java", "-jar", "meu-projeto-0.0.1-SNAPSHOT.jar"]
