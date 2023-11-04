package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.pages.US112LoginPage;
import com.Batch30_Sprint2_Implementation.utilities.BrowserUtils;
import com.Batch30_Sprint2_Implementation.utilities.ConfigurationReader;
import com.Batch30_Sprint2_Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_112_Login_StepDef {

    US112LoginPage us112LoginPage = new US112LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enters the HR user information")
    public void user_enters_the_hr_user_information() {

        us112LoginPage.login(ConfigurationReader.getProperty("HR_username"),ConfigurationReader.getProperty("HR_password"));


    }

    @When("user enters the Marketing user information")
    public void user_enters_the_marketing_user_information() {

        us112LoginPage.login(ConfigurationReader.getProperty("MarketingUser"),ConfigurationReader.getProperty("Marketing_password"));

    }


    @When("user enters the Helpdesk user information")
    public void user_enters_the_helpdesk_user_information() {

        us112LoginPage.login(ConfigurationReader.getProperty("HelpDeskUser"),ConfigurationReader.getProperty("HelpDesk_Userpassword"));

    }


    @Then("user should land on the home page")
    public void user_should_land_on_the_home_page() {
        BrowserUtils.verifyTitleContains("Portal");
    }



    @When("the user login with invalid {string},{string}")
    public void the_user_login_with_invalid(String username, String password) {

            us112LoginPage.login(username,password);
    }
    @Then("the user should not be able to log in")
    public void the_user_should_not_be_able_to_log_in() {

        BrowserUtils.verifyTitle("Authorization");
    }

}
