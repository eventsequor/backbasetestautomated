@tag
Feature: User registration
  I want an automated test that allows me to determine the correct functioning of the registry view

  Background: 
    Given the name actor "New User"
    Then the browser opens
    Given a username "candidatex" and a password "qa-is-cool" I want to enter the portal of the BBlog page

  Scenario Outline: Successful registration
    When I go to the Sign in option
    Then I verify the if i can to see the label "<mainLabel>"

    Examples: 
      | mainLabel | password | status  |
      | Sign in   |        5 | success |
