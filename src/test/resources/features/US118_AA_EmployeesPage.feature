@B30G18-135
Feature: CRM employees page modules
	Agile Story: As a user i should see 8 modules on the Employees page
	and by default i should see the company structure when i open the
	employee page.

	
	@B30G18-133
	Scenario: Verify the users view 8 modules in the Employees page.
		Given User login with the correct Credential
		When User is successfully logged in
		Then User see the Employees page link
		Then User click on the Employees page link
		Then User will successfully lend in Employees page
		And User can see the following modules on the top of the page
			| Company Structure   |
			| Find Employee       |
			| Telephone Directory |
			| Staff Changes       |
			| Efficiency Report   |
			| Honored Employees   |
			| Birthdays           |
			| New page            |

	
	@B30G18-134
	Scenario: Verify that user view the Company Structure by default
		Given User login with the correct Credential
		When User is successfully logged in
		Then User see the Employees page link
		Then User click on the Employees page link
		Then User will successfully land in Employees page
		Then User sees the Company Structure