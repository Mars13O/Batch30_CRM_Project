package com.Batch30_Sprint2_Implementation.pages;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US112LoginPage {

    public US112LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement username;



    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;


    @FindBy(xpath = "//div[@class='errortext' and contains(text(), 'Incorrect login or password')]")
    public WebElement errorMessage;


    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMeText;


    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeCheckbox;



    public String getPasswordFieldType(){
        return password.getAttribute("type");
    }






    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();

    }

    public void clickLoginButton(){
        submit.click();
    }


}
