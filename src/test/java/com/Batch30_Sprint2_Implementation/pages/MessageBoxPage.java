package com.Batch30_Sprint2_Implementation.pages;

import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageBoxPage extends LoginPage {

    public MessageBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTabButton;

    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageInputBox;

    @FindBy (tagName = "body")
    public WebElement textArea;

    @FindBy (xpath = "//a[@id='bx-destination-tag']")
    public WebElement emptyRecipientBox;

    @FindBy (xpath = "//span[text()='All employees']")
    public WebElement defaultVisibleTextRecipientBox;

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy (xpath = "//span[@class='feed-add-info-text']")
    public WebElement missingTitleMessage;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployeesButton;
}
