# **Zuul Server**

Zuul Server is a gateway application that handles all the requests and does the dynamic routing of microservice applications.Zuul acts as an API gateway or Edge service. It receives all the requests coming from the UI and then delegates the requests to internal microservices.

** Here we have added some Functionility **
1.Swagger
2.Logger
3.JaCoCo
4.Actuator
5.Spring Profile

### **Swagger**
Spring Boot makes developing RESTful services ridiculously easy — and using Swagger makes documenting your RESTful services easy.
We have added the dependency for Swagger in pom.xml file.We have created a Configration file for Swagger in config folder and inside this, we will create a Docket bean in a Spring Boot configuration to configure Swagger 2 for the application. A Springfox Docket instance provides the primary API configuration with sensible defaults and convenience methods for configuration.
We used the @EnableSwagger2 annotation enables Swagger support in the class.On browser we can check the ui interface for Swagger

### **Logger**
Logger is used to log the information, error, bug etc. to a file.
We have create a file for logger in config folder and we can take the object of this class to add logging in the service.We have created a Log4j properties file to handle logging related stuff and Here you can Change the location of your log file.
You Only have to Create the object:
Logger log = LoggingConfig.getLog();
then you can easily use the logger in your file.

### **JaCoCo**
JaCoCo – a code coverage reports generator for Java projects.
Code coverage is a software metric used to measure how many lines of our code are executed during automated tests.

JaCoCo reports help you visually analyze code coverage by using diamonds with colors for branches and background colors for lines:
    Red diamond means that no branches have been exercised during the test phase.
    Yellow diamond shows that the code is partially covered – some branches have not been exercised.
    Green diamond means that all branches have been exercised during the test.
The same color code applies to the background color, but for lines coverage.
JaCoCo mainly provides three important metrics:
    Lines coverage reflects the amount of code that has been exercised based on the number of Java byte code instructions called by the tests.
    Branches coverage shows the percent of exercised branches in the code – typically related to if/else and switch statements.
    Cyclomatic complexity reflects the complexity of code by giving the number of paths needed to cover all the possible paths in a code through linear combination.
To take a trivial example, if there are no if or switch statements in the code, the cyclomatic complexity will be 1, as we only need one execution path to cover the entire code.
In real world project, and as developments go further, we need to keep in track the code coverage score.
JaCoCo offers a simple way of declaring minimum requirements that should be met, otherwise the build will fail.
We Have added the dependency in pom.xml file.
To Get the 100% Code Coverage We have to make sure all of your code will be Covered.
for that we have to Create test cases in a better way which cover all scenrio for our code.
This Create a report Which is present in 
target/site/jacoco/{repective folder}

### **Actuator**
Actuator brings production-ready features to our application.
Monitoring our app, gathering metrics, understanding traffic, or the state of our database become trivial with this dependency.
The main benefit of this library is that we can get production-grade tools without having to actually implement these features ourselves.
Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.
We have added the dependency in pom.xml file.
When You start your spring boot project Actuator create the report of information about api and do their health check
You can check your api status:
https://localhost:{port}/actuator for all information
https://localhost:{port}/actuator/health to check health of you api


### **Spring Profile**
Here We Add the Properties file for dev and prod phase.


