# Full-Stack-Automation-Final-Project 01: 

This project created to demonstrate my knowledge and skills in Automation Testing.

About:

The project demonstates a smart automation infrastructure. It is built in hierarchy order of modules. The modules contain number of classes with methods. There are main/common/helpers/actions/page_object modules. In this way, the tests can be created in very simple way with a minimum lines of code. Also the infrastructure allows to work with differend kinds of applications. Big advantage of the infrastructure is that it can be easy maintained!

Project Overview :

The project is an example of infrastructure for automation testing of different kinds of applications: Web based application Mobile application Web API Electron application Desktop application

Infrastructure project includes using of:

Page Object Design Pattern Project Layers(Extensions/Work Flows/Test Cases...) Support of Different Clients/Browsers Failure Mechanism Common Functionality External Files Support Reporting System (including screenshots) Visual Testing DB support CI support


List of applications were used in this project:

Parabank webpage - Web based application, Experibank Mobile  - Mobile application, Student list API - Web API, ApiDemosElectron Application, Windows calculator - Desktop application

Tools & Frameworks used in the project:

TestNG - Testing Framework Listeners - interface used to generate logs and customize the TestNG reports MySQL Free Online DB - used for login to Parabank web page Jenkins- for tests execution REST Assured - for API testing Allure Reports - as the main reporting system.

Tests Execution:

Each of the applications has a few tests for demonstration purpose. These tests can be developed in a very simple way, due to a lot of work with the infrastructure. [Sanity Tests]

Known Issues: Sometimes can be conflicts with some dependencies the applications are using. Hence, the project is for DEMO purpose only. In production it should be divided into several projects.


