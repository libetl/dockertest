FROM maven:3-jdk-8
WORKDIR /home/app
COPY . $WORKDIR
RUN mvn install
EXPOSE 8080
CMD java -jar dockertest-1.0-SNAPSHOT.jar
