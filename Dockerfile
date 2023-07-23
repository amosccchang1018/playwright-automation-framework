# Use the official Ubuntu 18.04 base image
FROM ubuntu:20.04

# Set environment variables to suppress interactive dialogs during installation
ENV DEBIAN_FRONTEND=noninteractive

# Update the package index and install necessary packages
RUN apt-get update -y
RUN apt-get install -y maven
RUN apt-get  install -y default-jdk

# Update the package index and install necessary packages
RUN apt-get update -y && \
    apt-get install -y libxkbcommon0 \
    libxdamage1 \
    libgbm1 \
    libpango-1.0-0 \
    libcairo2 \
    xvfb

# Set the working directory
WORKDIR /app

# The following part assumes you have copied the necessary project files to the "AutomationMytheresa" directory
# Update the path accordingly if needed
# Copy the project's files to the container's working directory
COPY ./AutomationMytheresa /app

# Build the project with Maven
RUN mvn clean install -DskipTests

# The CMD command will be overwritten when calling "docker run" with parameters
CMD ["mvn", "test"]