Feature: User Log in

	Scenario: Log in with Valid Credentials 
		Given I navigate to the application URL 
		When I navigat to the log in page
		And I enter the valid email "<email>" and password "<password>"
		And I clicked on the signin button
		Then I should be redirected to the My account page