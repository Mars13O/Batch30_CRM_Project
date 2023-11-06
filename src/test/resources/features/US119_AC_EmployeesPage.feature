@B30G18-139
Feature: Default

  @outline
  Scenario Outline: User should be able login with valid credentials
    When User  enter a valid '<username>'
    And User enter valid '<password>'
    Then user should be able to login and land on the home page
    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing1@cydeo.com | UserUser |


  @B30G18-136
  Scenario:  All user types should be able to display company structure.
    Given User is on nextbasecrm page
    When User clicks Employees Menu button
    Then User sees "Company Structure" in title


  @B30G18-137
  Scenario: Hr user should be able to add a department from the company structure.
    Given Hr User is on nextbasecrm page
    When User clicks Employees Menu button
    Then Hr User clicks "ADD DEPARTMENT" button


  @B30G18-138
  Scenario: There is no “ADD DEPARTMENT” option for Helpdesk and Marketing users.
    Given User is on nextbasecrm page
    When User clicks Employees Menu button
    Then User Helpdesk sees no "ADD DEPARTMENT" option
    Then User Marketing sees no "ADD DEPARTMENT" option