# Topera's Hello World #006
## Rest Server with SpringBoot - deployable as WAR
This hello world is a Rest Server created with SpringBoot (configured with Gradle),
that can be deployed as a WAR file

Test using WAR
* $ cd gradle-rest-server-spring-war
* $ gradle war
* Deploy war generated in ./build/libs/hello-0.1.war
* If you are using Wildfly/JBoss, please access http://localhost:8080/test
* In other servers, please access http://localhost:8080/hello-0.1/test

Note: This example is already configured to have context root as "/" in Wildfly/JBoss, due to the file src/main/webapp/WEB-INF/jboss-web.xml

Extra tip:
To deploy in AWS, just create a new Application in Elastic Beanstalk.
Then create a new web server Environment, of platform **Tomcat**.
I was not able to make this work in **Glassfish**.

Tech Stack
* Spring Boot 1.5.6
* IntelliJ IDEA 2016.1.4
* Gradle 3.5.1

To take a look in other tutorials, please see https://github.com/topera/hello-world-index
