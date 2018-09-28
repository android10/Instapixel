# Pull open jde base image based on Alpine Linux.
FROM openjdk:8-jre-alpine

ENV ARTIFACT_ID image-upload.jar
ENV ARTIFACT_DIR /opt/app

# Define working directory.
RUN mkdir -p $ARTIFACT_DIR
WORKDIR $ARTIFACT_DIR

# Copy the current directory contents into the container.
COPY ./target/$ARTIFACT_ID $ARTIFACT_DIR

# Run when the container launches.
CMD java -jar $ARTIFACT_ID