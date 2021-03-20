PROJECT TEST AUTOMATED BACKBASE
===============================

Summary project
-------------------------------
This is a project that contains the tests proposed by the Backbase company, this uses the Serenity bdd framework integrated with cucumber. The Gherkin language is used as for the documentation of test cases, the Cucumber library that is included within the Serenity framework for natural language interpretation and the ScreenPlay design pattern that internally uses the PageObject design pattern.



How to run the project
--------------
To run all test cases in the project run the command

|Name scenario or description |Tag|commant|
|:-------:|:-------:|:-------:|
|Run all test||mvn clean verify|
|Successful registration|@Register_Succesful|mvn clean verify -Dtags="@Register_Succesful"|
|Registration failed by username|@Register_Failed_user|mvn clean verify -Dtags="@Register_Failed_user"|

Test scenarios
---------------------

Reports of the tests executed
-----------------------

Non-functional system requirements
--------------
- Maven 3.6.3
- Java 1.8
- Google chrome with version 89.0.4389.90
- Windows 8 or higher operating system


Autor
------------
&copy; Eder Leandro Carbonero Baquero