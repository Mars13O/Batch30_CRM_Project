@B30G18-156
Feature: Default

	User story:

	Users should be able to log in with valid credentials and should land on the home page after successful login.
	(We have 3 types of users such as HR user, Marketing user, and Helpdesk user).

	Background:
		Given user is on the login page

	
	@B30G18-151
	Scenario: As a user, I should be able to login
		#Given the user is on the login page
		    When user enters the HR user information
		    Then user should land on the home page

	Scenario:
		  #Given the user is on the login page
		    When user enters the Marketing user information
		    Then user should land on the home page

	Scenario:
		 #Given the user is on the login page
		    When user enters the Helpdesk user information
		    Then user should land on the home page


	#@B30G18-152
	Scenario Outline: "Incorrect login or password" error message should be displayed for invalid credentials
		#Given the user is on the login page
		When the user login with invalid "<username>","<password>"
		Then the user should not be able to log in

		Examples:
			| username        | password      |
			| wrongUserName   | UserUser123   |
			| salesmanager101 | wrongPassword |

	
