# Microservice / Kafka based Social Media Platform

## Utilising Micronaut and Kafka to create a framework for a containerised social media platform.

### The Epsilon suite of tools is utilised to facilitate the automated creation of similar microservices using a metamodel. Automated Java code generation is also facilitated using the EGX/EGL generation languages.

1. How to run the microservices:
   1. Go to each Microservice root folder and build the docker image
   2. Navigate to /microservices
   3. Run start-kafka.bash
   4. RUN topic-creation.bash in another Bash shell
   5. RUN docker compose -p assessment-prod -f compose-prod.yml up -d

2. How to run the various command line interfaces

   My project uses one CLI per microservice, so navigate to each
respective microservice CLI and run with gradle.
