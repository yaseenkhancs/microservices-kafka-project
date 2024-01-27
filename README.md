#Microservice / Kafka based Social Media Platform

##Utilising Micronaut and Kafka to create a framework for a containerised social media platform as part of my ENG2 project.

1. How to run the microservices:

A) Go to each Microservice root folder and build the docker image
B) Navigate to /microservices
B) Run start-kafka.bash
C) RUN topic-creation.bash in another Bash shell
D) RUN docker compose -p assessment-prod -f compose-prod.yml up -d

2. How to run the various command line interfaces

My project uses one CLI per microservice, so navigate to each
respective microservice CLI and run.
