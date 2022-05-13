# Assumptions
    My project is a about pizza dilvery system which creates the diffrent types of the pizza.
    in my project there are mainly two categroy. 1) Vegan pizza and 2) Regular Pizza.
    Based on pizza selection user can get chance to customize pizza topings and select the the 
    type of the pizza. Pizza delivery notification to multiple driver.

#   For this project I used 3 design patterns.
     1) Prototype pattern: for creating dynamically the concrete pizza
     2) Builder pattern: for separating the construction of pizza object
     3) Observer pattern: for sending notification to all drivers that a new order is ready 
        for delivery.

# What are the design goals in your project?

    The goals of implementing this patterns are to have dynamically in creating the pizza depending 
    on the type.Having a separate construction of the pizza object,to sent notification to all the 
    drivers.

# How is the flexibility, of your implementation, e.g., how you add or remove in future new types?

    I need to create a new type of pizza, e.g adult pizza,kids pizza,vege pizza. I required to include 
    it as a class and map into the MapPizzaBuilder class.

# How is the simplicity and understandability of your implementation?

    Initally, I struggled to draw diagram uisng three patterns.It is easy to follow the code and the 
    implementation of the three patterns with the help of the UML daigram.Moreover,information in the 
    diagram that helps to understand where are the patterns.

# How you avoided duplicated code?

     I avoid duplicate code by letting each class their own responsibilities.

# Reference tutorial link

     Overall it is my first time learning experiance to use three patterns togther.I learned
     new patterns while implementing project by watching some youtube videos and tutorials.
    
    1)https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
    2)https://refactoring.guru/design-patterns/prototype
    3)https://www.youtube.com/watch?v=rsDTqn1ALjw
    5)https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
    6)https://refactoring.guru/design-patterns/builder

# Future Implementation
    Currently all driver are getting delivery notification but in future I am planning to add functionality which
    keep track of the records for delivery notification accepted and rejected by driver and driver whose accept the 
    delivery request that person only able to deliver pizza.

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




