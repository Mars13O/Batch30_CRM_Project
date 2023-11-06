package com.Batch30_Sprint2_Implementation.step_definitions;


import com.Batch30_Sprint2_Implementation.pages.US118_AA_EmployeePage_Page;
import com.Batch30_Sprint2_Implementation.pages.US118_AA_Portal_Page;
import com.Batch30_Sprint2_Implementation.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class US118_AA_EmployeesPage_stepDefinition {

US118_AA_Portal_Page us118AaPortalPage = new US118_AA_Portal_Page();
    @Given("User login with the correct Credential")
    public void user_login_with_the_correct_Credential() {
        us118AaPortalPage.login(ConfigurationReader.getProperty("Marketing_users"), ConfigurationReader.getProperty("password"));

    }
    @When("User is successfully logged in")
    public void user_is_successfully_logged_in() {

        us118AaPortalPage.successLogin.isDisplayed();
    }

    @Then("User see the Employees page link")
    public void user_see_the_employees_page_link() {
        us118AaPortalPage.employeePageLink.isDisplayed();
    }
    @Then("User click on the Employees page link")
    public void user_click_on_the_employees_page_link() {
        us118AaPortalPage.employeePageLink.click();
    }
    @Then("User will successfully land in Employees page")
    public void user_will_successfully_land_in_employees_page() {
        us118AaPortalPage.employeePageLink.isSelected();
    }
    US118_AA_EmployeePage_Page us118AaEmployeePagePage = new US118_AA_EmployeePage_Page();
    @Then("User can see the following modules on the top of the page")
    public void user_can_see_the_following_modules_on_the_top_of_the_page(List<String> expectedMenuOptions) {

        List<String> actualMenuOptions = new ArrayList<>();
       actualMenuOptions = US118_AA_EmployeePage_Page.pageMenuOptions(us118AaEmployeePagePage.employeesPageMenu, "main-buttons-item-link");
        System.out.println(expectedMenuOptions);
        System.out.println(actualMenuOptions);

        Assert.assertTrue(actualMenuOptions.contains(expectedMenuOptions));

    }

    @Then("User sees the Company Structure")
    public void userSeesTheCompanyStructure() {
        us118AaEmployeePagePage.companyStructure.isDisplayed();
    }
}
