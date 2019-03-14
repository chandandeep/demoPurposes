
@Feature
Feature: Complete Order of T-Shirt

  @smoke
  Scenario: Buy 2nd the T-Shirt and verification on order history page
    Given User click on Sign in on index page
    When Log in to the application with user "a@a.com" with password "12345"
    And Navigate to Personal Information on My account page
    And Save the form after updating the first name
    Then Success message "Your personal information has been successfully updated." should be displayed

@smoke
  Scenario: Buy a T-Shirt and validate on order history page
    Given User click on Sign in on index page
    When Log in to the application with user "a@a.com" with password "12345"
    And User navigates to "T-Shirts" section
    And User adds the first item into the cart
    And User proceed to checkout on pop up
    And User proceed to checkout on Summary page
    And User proceed to checkout on Address page
    And User proceed to checkout after agreeing the terms on Shipping page
    And User notice the amount as "$18.51" and select "bankwire"
    And User navigate back to orders after confirming the order on Payment page
    Then Following details should be displayed
		|Order reference|Date         |Total price|Status        |	
		|KIRUQUCYQ	|<currentDate>|"$18.51"   |On backorder  |      
