FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8080

ADD ./build/libs/demo-0.0.1-SNAPSHOT.jar /app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-Xms128m -Xmx512m"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]