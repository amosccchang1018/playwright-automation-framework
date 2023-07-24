<!-- ABOUT THE PROJECT -->
## About The Project

This project is designed to test whether the login feature is working properly on a specific shopping website.


## Hardware Specifications

---
* Memory : 8 GB
* Mac OS

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
   **maven** > **Refresh icon**(Reload All Maven Projects)

   ![Imgur](https://i.imgur.com/WETlznc.png)

4. Select certain test cases or all test cases in class

   ![Imgur](https://i.imgur.com/K057pnX.png)

5. sdfd

   ![Imgur](https://i.imgur.com/6QGSbmy.png)

6. fsdfs

   ![Imgur](https://i.imgur.com/i80JOOT.png)

### Run in a Docker Container

1. Pull the entire repository.
2. Navigate to the path where the repository is located and locate the shell script run.sh.
```bash
cd  path/to/mytheresa_qa_callenge_chi_chun
```
3. Execute the `run.sh` in your terminal.

4. After the `run.sh` script has been executed, a virtual environment will be created and test cases will be run. You will be able to see the results in the terminal.



Note : the shell script will build a container with 

*1.Ubuntu Linux 20.04*

*2.Java 11*

*3.Maven*

*4.Playwright*

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## About test cases

---

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Further Developments

---

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact Me

---
Email : amosccchang@gmail.com

LinkedIn : https://www.linkedin.com/in/ccchang1018/

<p align="right">(<a href="#readme-top">back to top</a>)</p>




<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

The following acknowledgments should provide insights into this project if certain aspects are unfamiliar to you. Please review them for a better understanding of the project.
* [Building Java Projects with Maven](https://spring.io/guides/gs/maven/)
* [Installation | Playwright Java](https://playwright.dev/java/docs/intro)
* [TestNG tutorial](https://testng.org/doc/)
* [The Java™ Tutorials](https://docs.oracle.com/javase/tutorial/)
* [Overview | Docker Documentation](https://docs.docker.com/get-started/)
* [Dockerfile tutorial](https://www.tutorialspoint.com/docker/docker_file.htm)

<p align="right">(<a href="#readme-top">back to top</a>)</p>




<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)

There are many great README templates available on GitHub; however, I didn't find one that really suited my needs so I created this enhanced one. I want to create a README template so amazing that it'll be the last one you ever need -- I think this is it.

Here's why:
* Your time should be focused on creating something amazing. A project that solves a problem and helps others
* You shouldn't be doing the same tasks over and over like creating a README from scratch
* You should implement DRY principles to the rest of your life :smile:

Of course, no one template will serve all projects since your needs may be different. So I'll be adding more in the near future. You may also suggest changes by forking this repo and creating a pull request or opening an issue. Thanks to all the people have contributed to expanding this template!

Use the `BLANK_README.md` to get started.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

* [![Next][Next.js]][Next-url]
* [![React][React.js]][React-url]
* [![Vue][Vue.js]][Vue-url]
* [![Angular][Angular.io]][Angular-url]
* [![Svelte][Svelte.dev]][Svelte-url]
* [![Laravel][Laravel.com]][Laravel-url]
* [![Bootstrap][Bootstrap.com]][Bootstrap-url]
* [![JQuery][JQuery.com]][JQuery-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.
* npm
  ```sh
  npm install npm@latest -g
  ```

### Installation

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```sh
   git clone https://github.com/your_username_/Project-Name.git
   ```
3. Install NPM packages
   ```sh
   npm install
   ```
4. Enter your API in `config.js`
   ```js
   const API_KEY = 'ENTER YOUR API';
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [x] Add Changelog
- [x] Add back to top links
- [ ] Add Additional Templates w/ Examples
- [ ] Add "components" document to easily copy & paste sections of the readme
- [ ] Multi-language Support
    - [ ] Chinese
    - [ ] Spanish

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites to kick things off!

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
