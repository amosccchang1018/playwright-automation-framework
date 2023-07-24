## About The Project

This project is designed to test whether the login feature is working properly on a specific shopping website.

## Hardware Specifications

---

PC recommended requirement for this test cases

* Mac OS
* Memory : 8 GRAM min
* min 256GD disk space
* i5 process 

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Project Directory Structure

---

  ```sh
. 
mytheresa_qa_callenge_chi_chun
├── run.sh ()
├── .gotignore
├── Dockerfile-java
├── Dockerfile-jenkins
├── readme.md
└── AutomationMytheresa
    ├── src
    │   ├── main
    │   └── test
    │       └── java
    │           └── com
    │               ├── constants 
    │               ├── utils
    │               └── testcases (Test cases for the application)
    │                   ├── LoginE2ETest.java
    │                   ├── LoginTest.java
    │                   ├── WebScrapingTest.java
    │                   └── ...
    │
    └── target
        ├── pom.xml (dependencs)
        └── github_prs.csv (csv compiled from the pull request page on GitHub)
    
  ```


<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Prerequisites

---
1. [docker](https://docs.docker.com/engine/install/) installed
2. [Java 11](https://www.oracle.com/java/technologies/downloads/) installed (run locally)
3. [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) (run locally)
3. IDE [IntelliJ](https://www.jetbrains.com/idea/download/) installed (run locally)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Run

---

### Run locally

1. Install above **prerequisites 1 to 4** in your local working environment.
2. After installation, **open IntelliJ**. 
3. For first time, it is needed to build the project with necessary configuration and dependencies. Click the
   **maven** > **Refresh icon**(Reload All Maven Projects). It would take some time, please be patient.

   ![Imgur](https://i.imgur.com/WETlznc.png)

4. Select certain test cases or all test cases in class, click the run icon

   ![Imgur](https://i.imgur.com/K057pnX.png)

5. After clicking it, select "Debug *'test case function'* "

   ![Imgur](https://i.imgur.com/6QGSbmy.png)

6. Waiting until the running is done, you will see the result in the Debugger console and related error message which will help to troubleshoot.

   ![Imgur](https://i.imgur.com/i80JOOT.png)



### Run in a Docker Container

1. Pull the entire repository.
2. Navigate to the path where the repository is located and locate the shell script `run.sh`.
```bash
cd  path/to/mytheresa_qa_callenge_chi_chun
```
3. Execute the `run.sh` in your terminal.

4. After the `run.sh` script has been executed, a virtual environment will be created and test cases will be run. You will be able to see the results in the terminal.

Note : the shell script will build a container with following 

*1.Ubuntu Linux 20.04*

*2.Java 11*

*3.Maven*

*4.Playwright*

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## About test cases

---

Based on the document requirement, the test cases are in following file,

1. LoginTest (As a tester)
2. LoginE2ETest (As a customer)
3. WebScrapingTest (As a product owner)

how to find them 

```sh
cd path/to/mytheresa_qa_callenge_chi_chun/AutomationMytheresa/src/test/java/com/testcases
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Recommendation for future test plans and infrastructure

---

* Using tools e.g. Confluence and Jia
* Finish the Infrastructure framework

#### Infrastructure for future test plans

![Imgur](https://i.imgur.com/S7oXs7i.png)

#### Infrastructure suggestion for test automation

![Imgur](https://i.imgur.com/ZMuYPVX.png)



<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact Me

---


Feel free to reach out via email or LinkedIn if you have any suggestions or innovative ideas for the enhancement of this project.

Email : amosccchang@gmail.com

LinkedIn : https://www.linkedin.com/in/ccchang1018/

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Acknowledgments

The following acknowledgments should provide insights into this project if certain aspects are unfamiliar to you. Please review them for a better understanding of the project.
* [Building Java Projects with Maven](https://spring.io/guides/gs/maven/)
* [Installation | Playwright Java](https://playwright.dev/java/docs/intro)
* [TestNG tutorial](https://testng.org/doc/)
* [The Java™ Tutorials](https://docs.oracle.com/javase/tutorial/)
* [Overview | Docker Documentation](https://docs.docker.com/get-started/)
* [Dockerfile tutorial](https://www.tutorialspoint.com/docker/docker_file.htm)
* [Jenkins Tutorial](https://www.jenkins.io/doc/tutorials/)
* [Hands-On Tutorials for Amazon Web Services (AWS)](https://aws.amazon.com/getting-started/hands-on/)
* [Databricks documentation](https://docs.databricks.com/?_gl=1*1kanlbo*_gcl_au*ODU2MTA0NzA4LjE2OTAxNjg0NTc.*rs_ga*OTMzNjJmZjUtOTg1My00ODI2LTgzNTYtYjc2NDc2YmRlM2Vi*rs_ga_PQSEQ3RZQC*MTY5MDE2ODQ1NjIwNi4xLjAuMTY5MDE2ODQ1OS42MC4wLjA.&_ga=2.229993884.180442662.1690168457-1076022423.1690168457)
* [Grafana tutorials](https://grafana.com/tutorials/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
