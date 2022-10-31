@Wikipedia-search
Feature: Wikipedia Search Functionality Title Verification

  Background:
    Given User is on Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification

    When  User types Steve Jobs in the wiki search box
    And   User clicks wiki search button
    Then  User sees Steve Jobs is in the wiki title

  Scenario: Wikipedia Search Functionality Title Verification

    When  User types "Muhammad Ali" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "Muhammad Ali" is in the wiki title


  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT

    When  User types "<searchValue>" in the wiki search box
    And   User clicks wiki search button
    Then  User sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue    | expectedTitle  |
      | Steve Jobs     | Steve Jobs     |
      | Elon Musk      | Elon Musk      |
      | Chuck Norris   | Chuck Norris   |
      | Lionel Messi   | Lionel Messi   |
      | Angelina Jolie | Angelina Jolie |




