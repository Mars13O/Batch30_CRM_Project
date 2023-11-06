package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.pages.MessageBoxPage;
import com.Batch30_Sprint2_Implementation.utilities.ConfigurationReader;
import com.Batch30_Sprint2_Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B30G018_SendMessage_StepDefinitions {

    MessageBoxPage messageBoxPage = new MessageBoxPage();

    @Given("User is logged in to the CRM HomePage")
    public void user_is_logged_in_to_the_crm_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        messageBoxPage.login(ConfigurationReader.getProperty("HR_username"), ConfigurationReader.getProperty("HR_password"));

    }
    @When("User clicks on Message Tab")
    public void user_clicks_on_message_tab() {
        messageBoxPage.messageTabButton.click();
    }

    @When("User types in a {string} in message input box")
    public void user_types_in_a_in_message_input_box(String anyText) {
        Driver.getDriver().switchTo().frame(messageBoxPage.messageInputBox);

        messageBoxPage.textArea.sendKeys(anyText);
    }
    @When("User does not leave the recipient box blank by deleting the default option")
    public void user_does_not_leave_the_recipient_box_blank_by_deleting_the_default_option() {
        Driver.getDriver().switchTo().parentFrame();

        messageBoxPage.defaultVisibleTextRecipientBox.isDisplayed();
    }
    @Then("User should be able to send a message by filling the mandatory fields")
    public void user_should_be_able_to_send_a_message_by_filling_the_mandatory_fields() {
        Driver.getDriver().switchTo().frame(messageBoxPage.messageInputBox);

        messageBoxPage.textArea.sendKeys("Message Sent");

        Driver.getDriver().switchTo().parentFrame();

        messageBoxPage.sendButton.click();
    }


    @Given("User clicks Send button")
    public void user_clicks_send_button() {
        messageBoxPage.sendButton.click();

    }

    @Then("User should see an error message {string}")
    public void user_should_see_an_error_message(String string) {
        messageBoxPage.missingTitleMessage.getText();
    }


    @When("User leaves recipient box empty by deleting All employees button")
    public void userLeavesRecipientBoxEmptyByDeletingAllEmployeesButton() {
        messageBoxPage.allEmployeesButton.click();
    }

    @Then("User should verify that the message delivery recipient should be All employees by default")
    public void userShouldVerifyThatTheMessageDeliveryRecipientShouldBeAllEmployeesByDefault() {
        messageBoxPage.allEmployeesButton.isDisplayed();
    }

    @Then("User should be able to cancel sending message at any time before sending")
    public void userShouldBeAbleToCancelSendingMessageAtAnyTimeBeforeSending() {
        Driver.getDriver().switchTo().frame(messageBoxPage.messageInputBox);

        messageBoxPage.textArea.sendKeys("Message Sent");

        Driver.getDriver().switchTo().parentFrame();

        messageBoxPage.cancelButton.click();

    }
}
