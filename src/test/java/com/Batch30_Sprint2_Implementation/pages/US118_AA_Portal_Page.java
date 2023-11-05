package com.Batch30_Sprint2_Implementation.pages;


import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US118_AA_Portal_Page extends LoginPage{

    public US118_AA_Portal_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userInBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;


    @FindBy(xpath = "//div[@class='user-block']")
    public WebElement successLogin;

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeePageLink;
}
