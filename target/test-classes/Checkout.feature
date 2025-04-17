Feature: Test the checkout functionality

Background:
    Given user is on product details page
    When user choose the quantity
    And user clicks the add to cart button
    And I view the cart
    And I proceed to the checkout page

Scenario: Verify checkout page loaded
    Then I should be on the checkout page
    
Scenario: Test the Returning customer
		When customer is Returning customer
		Then usser need to click the "click here to login" link
		Then need to display the login form

Scenario: Test the have a coupon field
		When user have a coupen
		Then need to click the "Click here to enter your code" link
		And then need to appy the coupen
		Then display the validity of the coupen

Scenario: Test the billing details page
    When user give relevant details
    And user click place order button
    Then successful message display on the page
