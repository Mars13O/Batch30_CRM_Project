package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.pages.US119_AC_UserLoginPage;
import com.Batch30_Sprint2_Implementation.utilities.BrowserUtils;
import com.Batch30_Sprint2_Implementation.utilities.ConfigurationReader;
import com.Batch30_Sprint2_Implementation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US119_AC_EmployeesStepDefs {

    US119_AC_UserLoginPage us119AcUserLoginPage = new US119_AC_UserLoginPage();

    @Then("user should be able to login and land on the home page")
    public void userShouldBeAbleToLoginAndLandOnTheHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User  enter a valid {string}")
    public void userEnterAValidUsername(String username) {
        us119AcUserLoginPage.userName.sendKeys(username);
    }

    @And("User enter valid {string}")
    public void userEnterValidPassword(String password) {
        us119AcUserLoginPage.passWord.sendKeys(password);
        us119AcUserLoginPage.submit.click();
    }

    @Given("User is on nextbasecrm page")
    public void user_is_on_nextbasecrm_page() {
        US119_AC_UserLoginPage.userName.sendKeys(ConfigurationReader.getProperty("HelpDesk_users"));
        US119_AC_UserLoginPage.passWord.sendKeys(ConfigurationReader.getProperty("password"));
        US119_AC_UserLoginPage.submit.click();
    }

    @When("User clicks Employees Menu button")
    public void user_clicks_employees_menu_button() {
        US119_AC_UserLoginPage.EmpBtn.click();
    }

    @Then("User sees {string} in title")
    public void user_sees_in_title(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @Given("Hr User is on nextbasecrm page")
    public void hr_user_is_on_nextbasecrm_page() {
        US119_AC_UserLoginPage.userName.sendKeys(ConfigurationReader.getProperty("Hr_users"));
        US119_AC_UserLoginPage.passWord.sendKeys(ConfigurationReader.getProperty("password"));
        US119_AC_UserLoginPage.submit.click();
        US119_AC_UserLoginPage.EmpBtn.click();

    }

    @Then("Hr User clicks {string} button")
    public void hr_user_clicks_button(String string) {
        US119_AC_UserLoginPage.AddDpt.isDisplayed();
        US119_AC_UserLoginPage.AddDpt.click();
    }

    @Then("User Helpdesk sees no {string} option")
    public void user_helpdesk_sees_no_option(String string) {
        Assert.assertFalse(US119_AC_UserLoginPage.AddDpt.isDisplayed());
    }

    @Then("User Marketing sees no {string} option")
    public void user_marketing_sees_no_option(String string) {
        Assert.assertFalse(US119_AC_UserLoginPage.AddDpt.isDisplayed());
    }
}
