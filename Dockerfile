FROM eclipse-temurin:11-jdk-alpine

ENV APP_PATH=/opt/app
ENV JAR_NAME=otus-msa-1.0-SNAPSHOT.jar
ENV JAR_PATH=$APP_PATH/$JAR_NAME

RUN mkdir $APP_PATH
COPY ./target/$JAR_NAME $APP_PATH
COPY run.sh $APP_PATH
RUN chmod +x $APP_PATH/run.sh

EXPOSE 8000
ENTRYPOINT $APP_PATH/run.sh $JAR_PATH
