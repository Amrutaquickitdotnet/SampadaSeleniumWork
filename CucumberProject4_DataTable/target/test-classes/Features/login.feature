Feature: I want to test login functionality 
Scenario: test my login functionality
	Given a user is landing on phptravel home page
		When user enters credentials to login
		| agent@phptravels.com | demoagent |
		| supplier@phptravels.com | demoagent |
		And click on login button
		Then login done successfully
		
		
	