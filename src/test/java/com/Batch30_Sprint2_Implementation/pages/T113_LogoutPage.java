package com.Batch30_Sprint2_Implementation.pages;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T113_LogoutPage {


    public T113_LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement username;



    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;


    public void login(String username,String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();

    }

        @FindBy(id = "#user-block")
        public WebElement myProfile;






}
