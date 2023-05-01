#FROM openjdk:17-jdk-alpine
#EXPOSE 8100
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]


FROM openjdk:17-jdk-alpine
EXPOSE 8100

# Определяем переменные
ARG JAR_FILE=build/libs/*.jar
ARG TEST_FILES=src/test/*
ENV AGENT_WORKDIR=/root/agent

# Копируем код
COPY . /root/agent
WORKDIR /root/agent

# Устанавливаем необходимые зависимости
RUN apk update && \
    apk add --no-cache bash curl && \
    curl -s "https://get.sdkman.io" | bash && \
    source "$HOME/.sdkman/bin/sdkman-init.sh" && \
    sdk install gradle

# Копируем приложение
COPY ${JAR_FILE} app.jar

# Копируем тесты
COPY ${TEST_FILES} test/

# Запускаем тесты при запуске контейнера
CMD ["./gradlew", "test"]
