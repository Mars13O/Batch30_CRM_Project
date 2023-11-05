package com.Batch30_Sprint2_Implementation.pages;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US116_Ilona {
    public US116_Ilona(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='login-inp']")
    public static WebElement UserNameIcon;

    @FindBy(xpath = "//input[@type='password']")
    public  static WebElement PasswordIcon;

    @FindBy(xpath = "//input[@value='Log In']")
    public  static WebElement LogInButtonI;


    @FindBy(id = "bx-b-uploadfile-blogCommentFormLyzh")
    public  static WebElement ComentBox;
//input[@class='diskuf-fileUploader wd-test-file-light-inp ']
@FindBy(xpath = "//input[@class='feed-add-post-form-but feed-add-file']")
    public static WebElement UploadIcon;

    @FindBy(xpath = "//input[@class='diskuf-fileUploader wd-test-file-light-inp ']")
    public static WebElement UploadIconButton;


}
