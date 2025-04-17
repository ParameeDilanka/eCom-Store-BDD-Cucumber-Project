Feature: Test the login functionality

Scenario: Test the valid login
Given user is on login page
When user enters username and password
And click on login button
Then user should land on My Account pages

Scenario: Test the fogot password
Given user is on login page
When user click lost your password link
Then user redirect to the lost password page
And when user give email address
And click the reset password button
Then success message display on the page