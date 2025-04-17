Feature: Test the Register functionality

Scenario: Test the Register login
Given user is on register page
When user enters email and password
And click on register button
Then user should land on home pages

Scenario: Test the privacy policy link
Given user is on register page
When user click privacy policy link
Then user should land on privacy policy page

Scenario: Test the product category
Given user is on the privacy policy page
When user clicks the product category
Then user can see the related products belongs to the category