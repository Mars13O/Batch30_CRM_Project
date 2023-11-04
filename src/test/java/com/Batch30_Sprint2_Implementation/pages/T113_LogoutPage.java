package com.Batch30_Sprint2_Implementation.pages;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T113_LogoutPage {


    public T113_LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "#user-block")
    public WebElement myProfile;







}
