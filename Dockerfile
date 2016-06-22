FROM java:8
WORKDIR /home/app
COPY target/dockertest-1.0-SNAPSHOT.jar .
CMD java -jar dockertest-1.0-SNAPSHOT.jar
