@Etsy-search
#@Regression
Feature: Etsy title verification
  User story: As a user I should go to https://www.etsy.com
  I should able to see title is as expected.

  Background:
    Given User is on Etsy home page

    Scenario: Etsy Title Verification
     # Given User is on Etsy home page
      Then  User sees title is as expected


    Scenario: Etsy Search Functionality Title Verification
     # Given User is on Etsy home page
      When  User types Wooden Spoon in the search box
      And   User clicks search button
      Then  User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification
   # Given User is on Etsy home page
    When  User types "Wooden Spoon" in the search box
    And   User clicks search button
    Then  User sees "Wooden spoon - Etsy" is in the title
