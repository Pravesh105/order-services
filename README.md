CICD-DEMO
This project aims to be the basic skeleton to apply continuous integration and continuous delivery.

Topology
CICD Demo uses some kubernetes primitives to deploy:

Deployment
Services
Ingress ( with TLS )
     internet
        |
   [ Ingress ]
   --|-----|--
   [ Services ]
   --|-----|--
   [   Pods   ]
This project includes:

Spring Boot java app
Jenkinsfile integration to run pipelines
Dockerfile containing the base image to run java apps
Makefile and docker-compose to make the pipeline steps much simpler
Kubernetes deployment file demonstrating how to deploy this app in a simple Kubernetes cluster
Pipeline Setup
Pipelines exist at Travis.

Some pipelines are configured by GitHub/Projects. If you have created a repository in one of these, your project will be automatically built if it has a Jenkinsfile/Travis/Gitlab/CircleCI.

Other pipelines are configured manually under folders. You can create a project manually with the following steps:

How to run the app:

make
Testing
Unit tests and integrations tests are separated using JUnit Categories.

Unit Tests
mvn test -Dgroups=UnitTest
Or using Docker:

make build
Integration Tests
mvn integration-test -Dgroups=IntegrationTests
Or using Docker:

make integrationTest
System Tests
System tests run with Selenium using docker-compose to run a Selenium standalone container with Chrome.

Using Docker:

If you are running locally, make sure the $APP_URL is populated and points to a valid instance of your application. This variable is populated automatically in Jenkins.
APP_URL=http://dev-cicd-demo-master.anzcd.internal/ make systemTest
