package com.Batch30_Sprint2_Implementation.step_definitions;

import com.Batch30_Sprint2_Implementation.pages.US116_Ilona;
import com.Batch30_Sprint2_Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US116_Upload_Image_File {
    US116_Ilona us116Ilona = new US116_Ilona();
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://login1.nextbasecrm.com/");
        US116_Ilona.UserNameIcon.sendKeys("helpdesk1@cydeo.com");
        US116_Ilona.PasswordIcon.sendKeys("UserUser");
        US116_Ilona.LogInButtonI.click();



    }
    @Then("user should comment box with upload image file button")
    public void user_should_comment_box_with_upload_image_file_button() {

US116_Ilona.UploadIconButton.sendKeys("C:\\Users\\Steve\\Desktop\\Porshe.jpg");

    }
    @Then("user should be able to upload image and file")
    public void user_should_be_able_to_upload_image_and_file() {

    }

}
