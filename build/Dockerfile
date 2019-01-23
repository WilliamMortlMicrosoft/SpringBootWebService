FROM java:8
MAINTAINER William M Mortl <wimortl@microsoft.com>

# open the port 
EXPOSE 8080

# install things
RUN apt-get update
# RUN apt-get -y upgrade
RUN apt-get install -y supervisor

# make the logging directory
RUN mkdir -p /var/log/WebService/

# create directories and add files
RUN mkdir -p /WebService
ADD target/HelloWorldWebService-0.0.1-SNAPSHOT.jar /WebService/.
ADD build/supervisord.conf /WebService/.

WORKDIR /WebService
CMD ["supervisord", "-csupervisord.conf"]