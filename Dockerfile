FROM openjdk:17-jdk-slim

RUN apt-get update -yqq \
    && apt-get install -yqq maven avahi-utils \
    && rm -rf /var/lib/apt/lists/*

RUN mkdir /xtable-test

COPY ./pom.xml /xtable-test
COPY ./src /xtable-test/src

WORKDIR /xtable-test

RUN mvn install -e
RUN mvn compile -e

ENTRYPOINT ["mvn", "exec:java"]
