FROM openjdk:17-jdk-slim

RUN mkdir /xdash
COPY XDASH-2.0.0-SNAPSHOT.jar /xdash/

CMD /usr/local/openjdk-17/bin/java -Djava.net.preferIPv4Stack=true -jar /xdash/XDASH-2.0.0-SNAPSHOT.jar
