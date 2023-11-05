@B30G18-162
Feature: Default

	
	@B30G18-159
	Scenario: Verify the users view the following options on my profile page
		Given User is logged in to the home page
		When User clicks on the profile module on the right side of page
		And User clicks the my profile option
		Then User can see options displayed on the my profile page
		        | General       |
		        | Drive         |
		        | Tasks         |
		        | Calendar      |
		        | Conversations |	

	
	@B30G18-161
	Scenario: Verify the email address under the General tab
		Given User is logged in to the home page
		When User clicks on the profile module on the right side of page
		And User clicks the my profile option
		Then User sees its email under General tab