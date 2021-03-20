@SmokeTest
@SmokeTest @FavoriteArticles_smoke
Feature: Favorite Articles
  I want a series of cases that allows me to validate the functioning of the favorite articles functionality

  Background: 
    Given the name actor "New User"
    Then the browser opens
    Given a username "candidatex" and a password "qa-is-cool" I want to enter the portal of the BBlog page

  @ListOfFavoriteArticles
  Scenario Outline: Validate list of favorite articles
    When you enter the application using email "<userEmail>" and password "<password>"
    Then I validate if the user "<userName>" is visible in the header options
    When I go to the favorite articles page
    Then valid the following list of items list
      | Romans 8:38-39                    |
      | testTitletestTitleUpdate          |
      | testTitle                         |

    Examples: 
      | userName    | userEmail                  | password    |
      | testsophos5 | testsophos5@testsophos.com | testsophos5 |
