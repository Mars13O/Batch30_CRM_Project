@B30G18-147
Feature: Default


  @B30G18-146
  Scenario: Verify users see the following modules in the Company page shown as design
    Given the user is on the Company page
    Then the user should see "Official Information" module
    And the user should see "Our Life" module
    And the user should see "About Company" module
    And the user should see "Photo Gallery" module
    And the user should see "Video" module
    And the user should see "Career" module
    And the user should see "Business News (RSS)" module
    And the user should see "More" module