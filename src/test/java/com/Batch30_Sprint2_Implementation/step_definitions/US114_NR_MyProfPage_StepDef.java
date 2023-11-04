package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.pages.US114_NR_MyProfilePage;
import com.Batch30_Sprint2_Implementation.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US114_NR_MyProfPage_StepDef {

    US114_NR_MyProfilePage us114_nr_myProfilePage = new US114_NR_MyProfilePage();
           // us114_nr_myProfilePage.login(ConfigurationReader.getProperty("HelpDesk_users"), ConfigurationReader.getProperty("password"));


    @Given("User is logged in to the home page")
    public void user_is_logged_in_to_the_home_page() {
        us114_nr_myProfilePage.login(ConfigurationReader.getProperty("HelpDesk_users"), ConfigurationReader.getProperty("password"));

    }
    @When("User clicks on the profile module on the right side of page")
    public void user_clicks_on_the_profile_module_on_the_right_side_of_page() {
        us114_nr_myProfilePage.myProfilePage.click();
    }
    @When("User clicks the my profile option")
    public void user_clicks_the_my_profile_option() {
        us114_nr_myProfilePage.myProfileOption.click();
    }
    @Then("User can see options displayed on the my profile page")
    public void user_can_see_options_displayed_on_the_my_profile_page(List<String> expectedOptionsList) {
       List<String> optionList = new ArrayList<>();
       List<WebElement> allOptions = us114_nr_myProfilePage.myProfileOptions;
        for (WebElement each : allOptions) {
            optionList.add(each.getText());
        }

        Assert.assertEquals(expectedOptionsList, optionList);
    }

    @Then("User sees its email under General tab")
    public void user_sees_its_email_under_general_tab() {
        us114_nr_myProfilePage.email.isDisplayed();
    }


}
