@Feature
Feature: Complete Order of T-Shirt

  @smoke
  Scenario: Buy 2nd the T-Shirt and verification on order history page
    Given User click on Sign in on index page
    When Log in to the application with user "a@a.com" with password "12345"
    And Navigate to Personal Information on My account page
    And Save the form after updating the first name
    Then Success message "Your personal information has been successfully updated." should be displayed
