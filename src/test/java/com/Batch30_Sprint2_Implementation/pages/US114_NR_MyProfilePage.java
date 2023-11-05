package com.Batch30_Sprint2_Implementation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US114_NR_MyProfilePage extends LoginPage{


    @FindBy(xpath = "//div[@onclick='showUserMenu()']")
    public WebElement myProfilePage;

    @FindBy(xpath = "(//a[@class='menu-popup-item menu-popup-no-icon '])[1]")
    public WebElement myProfileOption;

    @FindBy(xpath = "//div[@id='profile-menu-filter']")
    public List<WebElement> myProfileOptions;

    @FindBy(xpath = "//td[.='E-Mail:']")
    public WebElement email;
}
