# Spring_boot
Example for an ocurring error, when loading a javaagent file, while using zip-layout.
The app needs a LoadTimeWeaver, which is set by spring-instrument-4.2.3.
However when using zip-Layout, the LTM is not specified.
The initialization works, when switching to different layout.

The error occurs when starting the application with this command:

java -javaagent:classpath/spring-instrument-4.2.3.RELEASE.jar -jar spring.boot.zip.layout.example-0.1.0.jar

Download-link for javaagent file:
http://mvnrepository.com/artifact/org.springframework/spring-instrument/4.2.3.RELEASE
