# Software Engineering Summer Semester 2020
Welcome to the Exercise repository! This README provides information and instructions 
to help you work through each Exercise.
It also points out important administrative aspect.

Please be sure to read and understand all the information provided in this instructional README.md. 
Should anything be unclear, feel free to post questions to the Moodle discussion board.
The instructions provided herewith also detail how the project is structured as well as how to build it.

- [ Important Information !! ](#important-information-!!)
- [ General Information ](#general-information)
  - [ Test Driven Development](#test-driven-development)
  - [ Continuous integration ](#continuous-integration)
- [ Working with the project ](#working-with-the-project)
  - [ Dependencies!!](#dependencies)
  - [ Project Structure ](#project-structure)
  - [ Building the project ](#building-the-project)
  - [ Working with Travis ](#working-with-travis)
- [ Updating the Exercise starter code ](#updating-the-exercise-starter-code)
- [ Exercise resources ](#exercise-resources)
- [ Exercise grades ](#exercise-grades)
- [ FAQ](#faq)
## Important Information !!
Please note, throughout the completion and submission of these exercises,
any academic dishonesty and breach of ethics will incur penalty.

***[Plagiarism](https://en.wikipedia.org/wiki/Plagiarism#cite_note-RandomHouse95-1) is the representation of another
author's language, thoughts, ideas, or expressions as one's own.***

In concrete terms, this means that you have to cite all external sources your team is using. 
This includes other students, Git repositories, 
Stack Overflow, all other websites and everything else you can imagine which is not 
an original idea from either team member. 

## General Information
### Test Driven Development
We will use [ Test Driven Development ](https://en.wikipedia.org/wiki/Test-driven_development) ([TDD](https://en.wikipedia.org/wiki/Test-driven_development))
as our approach to completing each exercise assignment.
Therefore, each exercise comes with starter code and **failing** test cases as a guideline.
The aim here, is to implement code such that the tests will **pass**.
As such, each exercise is scored based on **passing tests**.

<p align="center">
  <img width="500" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/tdd.png?token=AH3SL3JRXFLTJX5ERWBAT6K626ZCS">
</p>

For each commit pushed to Github, Travis will build and test the project (i.e., using the latest/current commit as a basis).
The test cases themselves are open to improvement, iff there is no mutation of the intended test behaviour.
However, as a general note, we recommend using the test cases as they are, i.e., without introducing any modifications.

### Continuous integration 
Continuous Integration or [CI](https://codeship.com/continuous-integration-essentials)
is a development practice where developers integrate code into a shared repository frequently,
preferably several times a day.
CI does not get rid of bugs, however,
it does make them dramatically easier to find and remove!

As the main goal is to build a simple ray tracer using successive exercises,
it is **imperative** to always have a solution for the previous exercise.
For this reason,
each new exercise will be presented with a sample solution for the previous exercise.

######simply put;

`current Exercise` -- depends on -- `previous Exercise solution`

Please note, it is not mandatory to use the sample solutions, in fact, it is highly recommended and encouraged to use your own solutions!

## Working with the project
### Dependencies
Before starting with the exercises, ensure you have the bellow listed dependencies.
#### Java
Java is the programming language which is used in this course. 
To use Java for development, you have to install the **J**ava **D**evelopment **K**it. 
For this project, we recommend [JDK11](https://jdk.java.net/11/).

#### Gradle 
[Gradle](https://gradle.org/install/) is the cross platform build tool we use.

Here are alternative ways to use [Gradle](https://gradle.org/install/).

`option 1: download and install Gradle onto your system`

[Install](https://gradle.org/install/) [Gradle](https://gradle.org/install/)  

Installing [Gradle](https://gradle.org/install/) onto your system will allow you to run Gradle tasks in the form:
```
gradle <task>
``` 
`option 2: Use the Gradle wrapper provided as part of this repository`

The Gradle wrapper will allow you to run Gradle tasks in the form:
```
./gradlew.bat <task>
./graddlew <task>
``` 
**n.b.** 

Without JDK11, the wrapper will not work. 

### Project Structure
To get an overview of the whole project and what files are responsible for what, can you see in the following project tree.

```
se-sose20-exercise-$NUMBER
├── .github
│   ├── classroom
│   |   └── autograding.json # Here can you see how many points you get for which task
│   ├── workflows
│   |   └── classroom.yml
│   └── .keep
├── gradle
│   └── wrapper
├── resources # In this folder are the ressources used by the application
|   ├── images
|   |   └── *.png
|   ├── foo.xml
|   └── *.x3d
├── src # below this is the source code and the defined test cases for the code
|   ├── main
|   |   └── java
|   |       ├── raytracer # Please add your implementation inside this folder 
|   |           ├── Main.java
|   |           └── *.java
|   └── test
|       └── java # In this folder are the test cases defined, which are tested by gradle
|           └── raytracer
|               ├── MainTest.java
|               └── *Test.java
├── .classpath
├── .gitignore
├── .project
├── build.gradle
├── gradlew
├── gradlew.bat # You can use this file if you don't want to install gradle
├── settings.gradle
└── README.md
```

### Building the project
As mentioned before, depending on which Gradle approach you choose:

*If you opted to use the provided Gradle wrapper:* 
* for macOS, Linux, or the GitBash(cross platform tool) 
```
./gradlew build
```
`n.b.`

* for Windows PowerShell:
```
gradlew.bat build
```

*If you opted to install Gradle:* 
* for macOS, Linux, or the GitBash(cross platform tool) 
```
```
gradle build
```

### Working with Travis

To view the Travis CI results

`1. Click on the commit state icon (red x icon).`

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/1-travis.png?token=AH3SL3N2CUKQBQ64QKBFJZC626ZTK">
</p>

`2. Click on the Details hyperlink.`

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/2-travis.png?token=AH3SL3NJBETTI37WEN7ZA4S626ZTW">
</p>

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/3-travis.png?token=AH3SL3LCZV5S7ZLVTTWMF62626ZUE">
</p>

You should see Travis at work. 

`3. (optional) Should you wish to see more details, click on The build hyperlink.`

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/4-travis.png?token=AH3SL3IK2I2NOZPRPL7OBQ2626ZUS">
</p>

### Updating the Exercise starter code
You will need to update the Exercise from time to time for updates, fixes, clarification, comments, hints, etc.

To do this, 

`1. add the exercise repository as a remote`
```
git remote add upstream git@github.com:mmbuw-courses/se-sose20-exercise-$NUMBER.git
```
here, $NUMBER corresponds to the Exercise number, i.e., 1/2/3 ... 

`2. update the exercise`
```
git pull upstream master
```
`3. resolve local merge conflicts`

Resolving merge conflicts is inevitable and this is the perfect opportunity to get accustomed to developing an approach to merging.

**n.b.** 

If an update is released it is your responsibility to ensure you merge it into your current working repository, 
should you neglect this, you are likely to lose marks and risk your assignment not being eligible for grading altogether.

## Exercise resources
All exercise resources are provided within the `./resources/` directory.

## Exercise grades
Grading is consists of two part evaluations:
1. passing/failing state of test cases  -- these are available after each commit, see below for more details.
2. points for observing to good practices.
   - [x] submitting before the specified deadline. 
   - [x] use of branches and meaningful commit + branch names. 
   - [x] good code commenting/documentation.
   
`n.b. Each point is worth 1 mark, i.e., maximum scorable points for good practice is 3 points.`
    
To check the first part of your grade for and exercise

`1. Click on the commit state icon (green tick icon).`

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/1-grading.png?token=AH3SL3IJK6QNQLJVVVIENPK6262JW">
</p>

`2. Click on the Details hyperlink next to GitHub Classroom Workflow / Autograding`

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/2-grading.png?token=AH3SL3M4XE7QYCXEPX6QEW26262J4">
</p>

`3. Expand` ► Run education/autograding@v1

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/3-grading.png?token=AH3SL3KFJKYTQ2EDAWN5TMK6262KG">
</p>

`4. View your groups grade (test-base score)`

<p align="left">
  <img width="850" src="https://raw.githubusercontent.com/mmbuw-courses/se-sose20-exercise-2/master/resources/images/4-grading.png?token=AH3SL3N2MTS22D2AGGADHS26262K2">
</p>



## FAQ

**Question:** What is Gradle?

**Answer:** Gradle is a build system, which allows you to build your project independently of the operating system. 
So one can define the build chain and test cases on operating system ***X*** and anyone else can run this chain on 
operating system ***Y***. Cross platform development :thumbsup: 

---

**Question:** What are IDEs and are there any benefits to using them?

**Answer:** IDEs are powerful,  **I**ntegrated, **D**evelopment, **E**nviroments.
They integrate a compiler, allowing execution and debugging of code directly.
IDEs house additional tools which make workflows more efficient.
IDEs may also be overwhelming and introduce overhead that prevents beginner developers from learning and grasping important fundamentals
The more common Java IDEs are [IntelliJ IDEA](https://www.jetbrains.com/de-de/idea/) and [Eclipse](https://www.eclipse.org/downloads/). 
There is no restriction on which IDE to use for the Exercises. 

---

**Question:** Am I allowed to edit the test cases?

**Answer:** No. Test cases are designed to test to outline code implementations with specific behaviour
and are used as a basis for grading.
If you run a marathon and its still 20 km to the finish line, you can't move the finish line for convenience.
You would naturally strive to reach the finish line.

---

**Question:** Why can't I call/use my implemented class/method?

**Answer:** You probably have to add the file  *as part of the package*, `package raytracer;` 
in our specific case. [Here](https://www.w3schools.com/java/java_packages.asp), 
you can read more about packages in Java.

---
