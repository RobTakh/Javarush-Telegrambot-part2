FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_java_comm_bot
ENV BOT_TOKEN=1937814693:AAFoNop17rqsq7jhhqDw68gr0Lx0Kyx-_lk
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]