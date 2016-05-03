# image aus der offiziellen docker-registry, busybox mit java8
FROM java:alpine
# blubb
MAINTAINER alec.a@gmx.net
# der port, der vom container exposed werden soll
EXPOSE 8080
# kopiere das jar in das (leere) basis image
COPY target/spring-boot-helloworld-0.0.1-SNAPSHOT.jar .
# command zum starten des images
CMD java -jar spring-boot-helloworld-0.0.1-SNAPSHOT.jar

