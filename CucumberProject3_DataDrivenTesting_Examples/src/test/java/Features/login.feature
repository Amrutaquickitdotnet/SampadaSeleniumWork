Feature: I want to test login functionality 
Scenario Outline: test my login functionality
	Given a user is landing on phptravel home page
		When user enters "<username>" and "<password>"
		And click on login button
		Then login done successfully
		
		Examples:
		| username| password |
		| agent@phptravels.com | demoagent |
		| supplier@phptravels.com | demoagent |
	