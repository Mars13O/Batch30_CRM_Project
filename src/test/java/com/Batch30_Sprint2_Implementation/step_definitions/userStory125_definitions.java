package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class userStory125_definitions {
    @Given("the user is on the Company page")
    public void the_user_is_on_the_company_page() {
        Driver.getDriver("https://login1.nextbasecrm.com/about/");

    }
    @Then("the user should see {string} module")
    public void the_user_should_see_module(String string) {

    }





}



/*
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
 */



