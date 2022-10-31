@web-table-login
Feature: User should be able to login with valid credentials



  Background:
    Given Users is on the login page of web table app

  Scenario: Login scenario with 1 parameters
      When  Users enters username "Test"
      And   Users enters password "Tester"
      And   Users clicks to login button
      Then  Users should see url contains orders


  Scenario: Login scenario with 2 parameters
        When  User enters username "Test" password "Tester" and logins
        Then  Users should see url contains orders


  Scenario: Login scenario with data table

    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then Users should see url contains orders


