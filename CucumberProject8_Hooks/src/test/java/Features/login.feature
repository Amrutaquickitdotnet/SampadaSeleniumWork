Feature: I want to test login functionality 
Scenario: test my login functionality
	Given a user is landing on phptravel home page
		When user enters credentials to login
		|	username	|	password	|
		| agent@phptravels.com | demoagent |
		| agent@phptravels.com | demoagent |
		And click on login button
		Then login done successfully
		
		
	