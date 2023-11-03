@B30G18-156
Feature: Default

	
	@B30G18-151
	Scenario: As a user, I should be able to login
		Given the user is on the login page
		    When user enters the HR user information
		    Then user should land on the home page
		
		  Given the user is on the login page
		    When user enters the Marketing user information
		    Then user should land on the home page
		
		 Given the user is on the login page
		    When user enters the Helpdesk user information
		    Then user should land on the home page	

	
	@B30G18-152
	Scenario Outline: "Incorrect login or password" error message should be displayed for invalid credentials
		Given user is on the login page
		    When the user login with invalid "<username>","<password>"
		    Then the user should not be able to log in
		
		    Examples:
		      | username        | password      |
		      | wrongUserName   | UserUser123   |
		      | salesmanager101 | wrongPassword |	

	
	@B30G18-153
	Scenario:  "Please fill out this field" error message should be displayed if the password or username is empty
		Given user is on the login page
		    When the user login without "<username>" or "<password>"
		    Then the user should see "Please fill out this field" error message	

	
	@B30G18-154
	Scenario: User can see "Remember Me" link exists and is clickable on the login page
		Given user is on the login page
		    Then user should see a link with the text "Remember Me"
		    And the "Remember Me" link should be clickable	

	
	@B30G18-155
	Scenario: User should see the password in bullet signs by default
		Given the user is on the login page
		    When they view the password input field
		    Then the password should be displayed as bullet signs