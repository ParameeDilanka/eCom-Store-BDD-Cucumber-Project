Feature: Test the login functionality of courseweb using Datatable

Scenario: Test the valid login using Datatable

Given user is on login page
When user enters valid credentials using Datatable
      | ms25912929@my.sliit.lk | 19981114*Vp |
And click on login button
Then user should land on home page