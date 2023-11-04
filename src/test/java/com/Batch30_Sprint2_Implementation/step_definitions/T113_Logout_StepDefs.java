package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.pages.T113_LogoutPage;
import com.Batch30_Sprint2_Implementation.utilities.ConfigurationReader;
import com.Batch30_Sprint2_Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T113_Logout_StepDefs {
    T113_LogoutPage logoutPage = new T113_LogoutPage();


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("the user clicks the profile name in the app")
    public void the_user_clicks_the_profile_name_in_the_app() {
        logoutPage.myProfile.click();


    }
    @When("the user clicks the logout label")
    public void the_user_clicks_the_logout_label() {

    }
    @Then("the user should see the url {string}")
    public void the_user_should_see_the_url(String string) {

    }

}
