@B30G18-160
Feature: Default


	@B30G18-128
	Scenario: As a user, I should be able to log out.
		Scenario: User can log out and ends up in login page
		    Given the user is logged in
		    When the user clicks the profile name in the app
		    And the user clicks the logout label
		    Then the user should see the url "Authorization"	


	@B30G18-129
	Scenario : US113 TC002 As a user, I should be able to log out.
		Scenario: User clicks on the users profile name in the app
		    Then user should see below list
		      | My Profile              |
		      | Edit Profile Settings   |
		      | Themes                  |
		      | Configure notifications |
		      | Log out                 |