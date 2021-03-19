@Regiter_smoke
Feature: User registration
  I want an automated test that allows me to determine the correct functioning of the registry view

  Background: 
    Given the name actor "New User"
    Then the browser opens
    Given a username "candidatex" and a password "qa-is-cool" I want to enter the portal of the BBlog page

  @Register_Succesful
  Scenario Outline: Successful registration
    When I go to the Sign up option
    Then I verify the if i can to see the label <mainLabel>
    When the form is filled with the user "<userName>" email "<email>" and password "<password>" and makes the registration
    Then I validate if the user "<userName>" is visible in the header options

    #To run this test correctly it is necessary to update the data with users that do not exist
    Examples: 
      | mainLabel | userName    | email                      | password    |
      | Sign in   | testsophos5 | testsophos5@testsophos.com | testsophos5 |

  @Register_Failed_user
  Scenario Outline: Registration failed by username
    When I go to the Sign up option
    Then I verify the if i can to see the label <mainLabel>
    When the form is filled with the user "<userName>" email "<email>" and password "<password>" and makes the registration
    Then I validate if a label appears with the message "<alertMessage>"

    Examples: 
      | mainLabel | userName    | email                      | password    | alertMessage            |
      | Sign in   |             | testsophos2@testsophos.com | testsophos1 | username can't be blank |
      | Sign in   | testsophos2 |                            | testsophos1 | email can't be blank    |
      | Sign in   | userHsdssfa | userHsdssfa                | userHsdssfa | email is invalid        |
