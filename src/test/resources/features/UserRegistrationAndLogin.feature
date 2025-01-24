Feature: Registration and login together

	Scenario: Log in to portal with same creds used in registration
		Given user registered in the application
		Then they should be able to login with same credentials