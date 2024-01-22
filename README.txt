STUDENT Y3884331
===============

TO AID IN NAVIGATION, THIS FILE WILL HAVE INSTRUCTIONS ON HOW TO RUN EACH ASPECT OF THE PROJECT.

=============================
1. HOW TO RUN THE MICROSERVICES:

A) NAVIGATE TO ROOT FOLDER
B) RUN start-kafka.bash IN GIT BASH (CREATES KAFKA CLUSTER AND DATABASE)
C) RUN topic-creation.bash IN ANOTHER GIT BASH INSTANCE (CREATES TOPICS)
D) RUN docker compose -p assessment-prod -f compose-prod.yml up -d

==============================
2. HOW TO RUN THE VARIOUS COMMAND LINE INTERFACES:

MY PROJECT USES ONE CLI PER MICROSERVICE, SO NAVIGATE TO THE
CLI ROOT FOLDER, AND RUN GRADLE WITH THE APPROPRIATE COMMANDS.
USE THE -H ARGUMENT TO SEE THE COMMANDS AVAILABLE.

=================================
3. HOW TO VIEW MY EMFATIC METAMODEL 

NAVIGATE TO /modeling/metamodel/uk.ac.york.eng2.assessment.y3884331

================================
4. HOW TO VIEW MY GRAPHICAL CONCRETE SYNTAX

THE ENTIRE NESTED ECLIPSE PROJECT HAS BEEN UPLOADED, SO EVERYTHING
NECESSARY WILL BE IN /runtime-New_configuration

EXTRA INFORMATION:

NAVIGATE TO runtime-New_configuration/example
THIS CONTAINS THE .AIRD FILE AND THE MODEL. 

NAVIGATE TO runtime-New_configuration/my.project.design/description
THIS CONTAINS THE .ODESIGN

===================================
5. HOW TO VIEW MY MODEL VALIDATION

NAVIGATE TO /modeling/metamodel/uk.ac.york.eng2.assessment.y3884331.validation

=====================================
6. HOW TO VIEW MY MODEL TO TEXT

NAVIGATE TO modeling/m2t/uk.ac.york.eng2.assessment.y3884331.m2t

=====================================
7. LAUNCH CONFIGURATIONS LOCATION

NAVIGATE TO modeling/configs


