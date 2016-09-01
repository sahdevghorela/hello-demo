FROM frolvlad/alpine-oraclejdk8:slim
ADD build/libs/hello-demo-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","app.jar"]