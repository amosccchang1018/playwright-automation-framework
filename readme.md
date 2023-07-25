## About The Project

This project aims to validate the functionality of the login feature for a specific e-commerce website.

## Hardware Specifications

---

The recommended PC specifications for executing these test cases are as follows:

* Operating System: Mac OS
* Memory: Minimum 8GB RAM
* Disk Space: At least 256GB
* Processor: Intel i5 or equivalent

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Project Directory Structure

---

  ```sh
. 
mytheresa_qa_callenge_chi_chun
├── run.sh (script to run test cases in container)
├── .gitignore
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
    │                   ├── LoginE2ETest.java (as a tester)
    │                   ├── LoginTest.java (as a customer)
    │                   ├── WebScrapingTest.java (as a product owner)
    │                   └── ...
    │
    └── target
        ├── pom.xml (dependencies)
        └── Github_PRs<timeStamp>.csv (csv compiled from the pull request page on GitHub)
    
  ```


<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Prerequisites

---

The following tools must be installed to execute this project:

1. [docker](https://docs.docker.com/engine/install/)
2. [Java 11](https://www.oracle.com/java/technologies/downloads/) (for local execution)
3. [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) (for local execution)
3. IDE [IntelliJ](https://www.jetbrains.com/idea/download/) (for local execution)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## About test cases

---

### How to set domain in the beginning

To set desired domain, navigate to the following file:

```sh
cd path/to/mytheresa_qa_callenge_chi_chun/AutomationMytheresa/src/test/resources/config.properties
```
In the config file, you are able to set the environment first.

![Imgur](https://i.imgur.com/hc4xlZd.png)

### About test cases


The test cases are created based on the documented requirements and are located in the following files:

1. LoginTest (as a tester)
2. LoginE2ETest (as a customer)
3. WebScrapingTest (as a product owner)

To access them, navigate to the following directory:

```sh
cd path/to/mytheresa_qa_callenge_chi_chun/AutomationMytheresa/src/test/java/com/testcases
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Execution

---

### Local Execution

1. Install the **prerequisites** listed above in your local environment.
2. Launch the **IntelliJ IDE** after installation. 
3. Upon initial launch, the project needs to be built with the necessary configurations and dependencies. To do this, click on **Maven** > **Refresh icon** (Reload All Maven Projects). This might take a while, so your patience is appreciated.
  
   ![Imgur](https://i.imgur.com/WETlznc.png)

4. Choose a specific test case or all test cases in a class, then click the run icon.

   ![Imgur](https://i.imgur.com/K057pnX.png)

5. After clicking, select "Debug 'test case function' ".

   ![Imgur](https://i.imgur.com/6QGSbmy.png)

6. Wait for the execution to complete. The results and any error messages (useful for troubleshooting) will be displayed in the Debugger console.
7. 
   ![Imgur](https://i.imgur.com/i80JOOT.png)



### Execution in a Docker Container

Follow these steps to execute the test cases within a Docker container:

1. Pull the entire repository.
2. Navigate to the path where the repository is located and locate the shell script `run.sh`.
```bash
cd  path/to/mytheresa_qa_callenge_chi_chun
```
3. Execute the `run.sh` in your terminal.

```bash
# Permissions
chmod +x run.sh
# Execution
/.run.sh
```
4. 
5. After executing `run.sh`, a virtual environment will be established, and the test cases will be run. The results will be displayed in the terminal.


 ![Imgur](https://i.imgur.com/f5BFmFs.png)

 ![Imgur](https://i.imgur.com/Cqr6IKH.png)

Note: The shell script will build a container with the following components:

*1.Ubuntu Linux 20.04*

*2.Java 11*

*3.Maven*

*4.Playwright*

*5.testNG*

### Jenkins UI Display (In Progress)

For setting up the Jenkins UI, navigate to the repository directory first, then locate and execute the specific shell script:

```sh
cd path/to/mytheresa_qa_callenge_chi_chun/runJenkins.sh

./runJenkins.sh
```

After running the script, open a web browser and navigate to http://localhost:8080/. You'll be redirected to the Jenkins dashboard, as shown below:

 ![Imgur](https://i.imgur.com/UlyUoBn.png)

From this dashboard, you can manage and trigger test cases using the UI interface, eliminating the need to operate exclusively within the terminal environment.
<p align="right">(<a href="#readme-top">back to top</a>)</p>


## Future Testing Plans and Infrastructure Recommendations

---

* Complete the Jenkins configuration. Approximately 80% of the settings have already been established, as referenced in files with the suffix **"-Jenkins"**.

* Utilize tools like Confluence and Jira for better project management.
* Finalize the infrastructure framework.

#### Infrastructure for future test plans

Utilizing the provided template, we will comprehensively analyze each feature and design corresponding test cases.

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
