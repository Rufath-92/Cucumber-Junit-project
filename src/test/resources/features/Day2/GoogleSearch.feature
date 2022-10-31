@Google-search
Feature: Google search functionality
   User story: As a user, when I am on the google search page I should be able to search
   whatever I want and see relevant information

1.  User is on Google search page
2.  User types apple in the google search box and clicks enter
3.  User sees apple – Google Search is in the google title
Note: Follow POM


  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types apple in the google search box and clicks enter
    Then User sees apple – Google Search is in the google title


  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types "apple" in the google search box and clicks enter
    Then User sees "apple - Google Search" is in the google title


