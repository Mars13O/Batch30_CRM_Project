package com.Batch30_Sprint2_Implementation.pages;


import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userInBox;



    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;


    public void login(String userName, String password) {
        userInBox.sendKeys(userName);
        passwordInBox.sendKeys(password);
        loginButton.click();
        // verification that we logged

    }
}
