#this is the version of os that will be running on the system
FROM ubuntu:latest

LABEL maintainer="Aloy Aditya Sen"
ENV DEBIAN_FRONTEND noninteractive

# update
RUN apt-get update
RUN apt-get upgrade -y

# add packages
RUN apt-get install -y git openjdk-8-jdk

# clone the github repo
RUN git clone --recursive https://github.com/AloyASen/work-assistant.git
WORKDIR work-assistant
RUN git submodule update --init --recursive

# compile
RUN ./gradlew assemble

# Expose the web interface ports
EXPOSE 80 443

