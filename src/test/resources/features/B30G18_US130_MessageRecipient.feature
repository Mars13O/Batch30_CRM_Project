@B30G18-132
Feature: The message delivery should be to 'All employees' by default.

	
	Scenario:
		Given User is logged in to the CRM HomePage
		When User clicks on Message Tab
		Then User should verify that the message delivery recipient should be All employees by default