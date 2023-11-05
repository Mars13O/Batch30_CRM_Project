package com.Batch30_Sprint2_Implementation.pages;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US119_AC_UserLoginPage {


    public US119_AC_UserLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public static WebElement userName;


    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public static WebElement passWord;

    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement submit;


    public void login(String usernameStr, String passwordStr) {
        userName.sendKeys(usernameStr);
        passWord.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public static WebElement EmpBtn;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public static WebElement AddDpt;
}
