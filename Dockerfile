FROM openjdk:18-alpine
MAINTAINER experto.com
VOLUME /tmp
ADD build/libs/platzi-market-0.0.1-SNAPSHOT.jar platzi-market.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/platzi-market.jar"]