Feature: Search Product
	Scenario: User should be able to search produce from search bar
		Given User navigated to application URL
		When navigate to home page
		And enter keyword in the search bar
		Then user should be able see all the products related to the keyword entered