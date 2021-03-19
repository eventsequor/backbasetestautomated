@Comments_smoke
Feature: Comments on Articles
  I want to use this template for my feature file

  Background: 
    Given the name actor "New User"
    Then the browser opens
    Given a username "candidatex" and a password "qa-is-cool" I want to enter the portal of the BBlog page

  @CreateComment
  Scenario Outline: Create a commet
    When I go to the Sign up option
    Then I verify the if i can to see the label <mainLabel>
    When the form is filled with the user "<userName>" email "<email>" and password "<password>" and makes the registration
    When you see the Global Feed tab I will enter this
    And I will look for the article with the title "<articleTitle>" and I will click on read more
    Then validate that it is inside the article
    When you post the comment with the message "<comment>"
    Then validate that the comment "<comment>" exists

    Examples: 
      | mainLabel | userName    | email                      | password    | articleTitle | comment       |
      | Sign in   | testsophos2 | testsophos2@testsophos.com | testsophos1 | example 1    | comment one   |
      | Sign in   | testsophos2 | testsophos2@testsophos.com | testsophos1 | example 2    | comment two   |
      | Sign in   | testsophos2 | testsophos2@testsophos.com | userHsdssfa | example 3    | comment three |


  @DeleteComment
  Scenario Outline: Detele a commet
    When I go to the Sign up option
    Then I verify the if i can to see the label "<mainLabel>"
    When the form is filled with the user "<userName>" email "<email>" and password "<password>" and makes the registration
    When you see the Global Feed tab I will enter this
    And I will look for the article with the title "<articleTitle>" and I will click on read more
    Then validate that it is inside the article
    When you post the comment with the message "<comment>"
    Then validate that the comment "<comment>" exists
    When you delete the created comment "<comment>"
    Then validate that the comment "<comment>" does not exist

    Examples: 
      | mainLabel | userName    | email                      | password    | articleTitle | comment              |
      | Sign in   | testsophos2 | testsophos2@testsophos.com | testsophos1 | example 1    | comment one delete   |
      | Sign in   | testsophos2 | testsophos2@testsophos.com | testsophos1 | example 2    | comment two delelte  |
      | Sign in   | testsophos2 | testsophos2@testsophos.com | userHsdssfa | example 3    | comment three delete |
