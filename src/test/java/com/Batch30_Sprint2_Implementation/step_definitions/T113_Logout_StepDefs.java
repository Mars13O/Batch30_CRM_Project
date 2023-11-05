package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.pages.T113_LogoutPage;
import com.Batch30_Sprint2_Implementation.utilities.BrowserUtils;
import com.Batch30_Sprint2_Implementation.utilities.ConfigurationReader;
import com.Batch30_Sprint2_Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class T113_Logout_StepDefs {
    T113_LogoutPage logoutPage = new T113_LogoutPage();

    @Given("the user is logged in with correct credential")
    public void the_user_is_logged_in_with_correct_credential() {
        logoutPage.login(ConfigurationReader.getProperty("Hr_users"), ConfigurationReader.getProperty("password"));

    }
    @When("the user clicks the profile name in the app")
    public void the_user_clicks_the_profile_name_in_the_app() {
        logoutPage.myProfile.click();

    }
    @When("the user clicks the logout icon")
    public void the_user_clicks_the_logout_icon() {
        logoutPage.logout.click();

    }
    @Then("user navigate back to login page")
    public void user_navigate_back_to_login_page() {
        BrowserUtils.verifyTitle("Authorization");

    }

    @Then("verify that below user profile options are displayed")
    public void verify_that_below_user_profile_options_are_displayed(List<String> OptionList) {
        List<String> myProfileOptions = new ArrayList<>();

        List<WebElement> allOptions = logoutPage.myProfileOptionList;

        for (WebElement each : logoutPage.myProfileOptionList) {

            myProfileOptions.add(each.getText());

        Assert.assertEquals(OptionList,myProfileOptions);

        }
    }
}
