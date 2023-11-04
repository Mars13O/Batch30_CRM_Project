@B30G18-160
Feature: As a user, I should be able to log out


	@B30G18-128
		Scenario: Verify the users can log out from the app after clicking the “Log out” button
		    Given the user is logged in with correct credential
		    When the user clicks the profile name in the app
		    And the user clicks the logout icon
		    Then user navigate back to login page


	@B30G18-129
		Scenario: Verify users see 5 options under the profile name
		    Given the user is logged in with correct credential
		    When the user clicks on the profile name in the app
		    Then user should see below list
		      | My Profile              |
		      | Edit Profile Settings   |
		      | Themes                  |
		      | Configure notifications |
		      | Log out                 |