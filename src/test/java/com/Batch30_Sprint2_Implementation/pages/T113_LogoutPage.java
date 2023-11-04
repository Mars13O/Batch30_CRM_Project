package com.Batch30_Sprint2_Implementation.pages;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T113_LogoutPage extends LoginPage{


    public T113_LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userInBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;



        @FindBy(id = "user-block")
        public WebElement myProfile;


        @FindBy(xpath = "//span[.='Log out']")
        public WebElement logout;










}
