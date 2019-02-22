**1 - Objective**
Automate the facebook Login flow  

**2 - Environment**
A Java project contains source code and related files for building a Java program. It has an associated Java builder that can incrementally compile Java source files as they are changed. Basically, JUnit is an open source unit testing tool and used to test small/large units of code. 
Maven is a build automation tool used primarily for Java projects. Maven addresses two aspects of building software: first, it describes how software is built, and second, it describes its dependencies.

**3 - Installation**

You'll need Jre, Java, ChromeDriver, Maven and Eclipse, Selenium Client & WebDriver Language Bindings Java and JDK. Once those are installed and setup, you can download in the following:

- Jre Download:
http://www.oracle.com/technetwork/pt/java/javase/downloads/jre8-downloads-2133155.html

- Java Download
https://www.java.com/pt_BR/download/

- Chrome Driver
http://chromedriver.chromium.org/downloads

- Maven Dependency
https://mvnrepository.com/artifact/org.apache.maven/maven-project

- Eclipse
https://www.eclipse.org/downloads/

- Selenium Client & WebDriver Language Bindings Java
https://www.seleniumhq.org/download/

- JDK
http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html


**4 - Running the tests**  

These are steps to execute 
    Click on "br.com.mediumProject" Project
        Click on src/main/java
            Click on "test" package
                Select the tests  
    Right click on test or tests 
        "Run as" option
            "2 TestNg Test" option
        
**5- Dependencies That I used**

<dependencies>
  
  <!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>6.14.3</version>
    <scope>test</scope>
</dependency>

<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>6.10</version>
  <scope>test</scope>
</dependency>

  
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    
    
<!-- https://mvnrepository.com/artifact/info.cukes/gherkin -->
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>gherkin</artifactId>
    <version>2.7.3</version>
    <scope>provided</scope>
</dependency>
    
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.14.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-server</artifactId>
    <version>3.14.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-api -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-api</artifactId>
    <version>3.14.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-junit -->
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>1.2.5</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.11</version>
    <scope>test</scope>
</dependency>
    
    
  </dependencies>


