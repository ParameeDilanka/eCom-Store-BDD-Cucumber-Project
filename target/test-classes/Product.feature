 Feature: Test the produt details on the store
 
 #Scenario: Check the product category
#		Given the user is on  product detail page
#		When user click the category link
#		Then user will land on the category page
#
#		Scenario: Check the reviews in the product
#		Given the user is on  product detail page
#		When user click the reviews link
#		Then user will land on the review section
		
		Scenario: Give the reviews in the product
		Given the user is on  product detail page
		When user give the ratings
		And the user give review, name and email
		And the user click the submit button
		Then review successfully saved