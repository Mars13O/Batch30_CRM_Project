@B30G18-141
Feature: Default

	
	@B30G18-131
	Scenario: User should be able to send a message by filling the mandatory fields
		Scenario:
		Given User is logged in to the CRM HomePage
		When User clicks on Message Tab
		And User types in a "message" in message input box
		And User does not leave the recipient box blank by deleting the default option
		Then User should be able to send a message by filling the mandatory fields
		
		Scenario:
		Given User is logged in to the CRM HomePage
		And User clicks on Message Tab
		When User leaves message content box empty
		And User clicks Send button
		Then User should see an error message "The message title is not specified."
		
		Scenario:
		Given User is logged in to the CRM HomePage
		And User clicks on Message Tab
		When User leaves recipient box empty by deleting "All recipients" button
		And User clicks Send button
		Then User should see an error message "Please specify at least one person."	

	
	@B30G18-132
	Scenario: The message delivery should be to 'All employees' by default.
		Given User is logged in to the CRM HomePage
		When User clicks on Message Tab
		Then User should verify that the message delivery recipient should be All employees by default	

	
	@B30G18-140
	Scenario: User should be able to cancel sending message at any time before sending
		Scenario:
		Given User is logged in to the CRM HomePage
		When User clicks on Message Tab
		Then User should be able to cancel sending message at any time before sending