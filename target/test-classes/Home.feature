 Feature: Shopping on the demo store

	Scenario: Search the product
		Given the user is on Search product field
		When user give the products name
		Then search product display on the home page
		
	Scenario: Select the product from the drop down menu
		Given the user is on home page
		When user sort the product using drop down menu
		Then sorted product display on the home page

	Scenario: Click the links on the footer
		Given the user is on home page
		When click the links on the footer
		Then redirect to the relevant page
	
	Scenario: Click the arrow icon on the page
		Given the user is on home page
		When click the arrow icon on the page
		Then redirect to the next page
		
  Scenario: View product details
    Given user is on home page
    When user clicks the belt
    Then user can see the details of the belt
    

    
    