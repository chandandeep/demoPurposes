@Feature
Feature: Complete Order of T-Shirt

  @smoke
  Scenario: Buy the T-Shirt and verification on order history page
    Given Click on Sign in on index page
    And Enter username as "a@a.com"
    And Enter password as "12345"
    Then User should be logged in


  @smoke
  Scenario: Buy 2nd the T-Shirt and verification on order history page
    Given Click on Sign in on index page
    And Log in to the application with following credentials
    |"a@a.com"|"12345"|
    And Enter password as "12345"
    Then User should be logged in
