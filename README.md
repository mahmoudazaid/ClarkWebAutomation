# ClarkWebAutomation
<!-- PROJECT SHIELDS -->
<p align="center">        
    <a href="http://maven.apache.org" alt="Maven">
        <img alt="Maven Central" src="https://img.shields.io/maven-central/v/org.apache.maven/apache-maven"></a>  
    <a href="https://www.seleniumhq.org" alt="Selenium">
        <img alt="Selenium" src="https://img.shields.io/badge/Selenium-v3.141.59-blue"></a>  
  <a href="https://www.seleniumhq.org" alt="Selenium">
        <img alt="Selenium" src="https://img.shields.io/badge/Cucumber-4.8.0-blue"></a>
    <a href="https://testng.org" alt="Maven">
        <img alt="TestNG" src="https://img.shields.io/badge/TestNG-v7.0.0-blue"></a>      
</p>

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/mahmoudazaid/ClarkWebAutomation">
    <img src="images/logo.png" alt="Logo">
  </a>

  <h3 align="center">ClarkWebAutomation</h3>
   <p align="center">
    <br />
    <a href="#about-the-project"><strong>Read Instructions »</strong></a>
    <br />
    <br />  
    <a href="https://github.com/mahmoudazaid/ClarkWebAutomation/wiki">Read the Wiki</a>
    .
    <a href="https://github.com/mahmoudazaid/ClarkWebAutomation/issues">Report Bug</a>
    ·
    <a href="https://github.com/mahmoudazaid/ClarkWebAutomation/issues">Request Feature</a>
  </p>
  
<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
<!-- ABOUT THE PROJECT -->

## About The Project

This is an automation framework to test the https://www.phptravels.net/ website

### Built With
The Framework built with below main packages
* [Maven](http://maven.apache.org/)
* [Selenium](https://www.seleniumhq.org/)
* [TestNG](https://testng.org/doc/)
* [Cucumber](https://cucumber.io)

### Getting Started
#### Prerequisites
* Install IntlliJ IDE from [here](https://www.jetbrains.com/idea/download/#section=windows)
* Install Java from [here](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Setup Java environment variables
* Install Maven from [here](http://maven.apache.org/download.cgi)
* Setup Maven environment variables
* Install Allure from [here](https://github.com/allure-framework/allure2/releases/tag/2.13.0)
* Setup Allure environment variable  
* Install Chrome browser

### Usage
* Clone the project to your local machine
* Import the project to IntlliJ
* Go to `src/test/java/runner` then choose which test suite that you need `TestRunner` or `RegressionRunner` right click and run
* After running finished go to terminal and run this command `allure.bat serve allure-results`
  <img src="images/terminal.png" alt="Terminal">