package com.Batch30_Sprint2_Implementation.pages;


import com.Batch30_Sprint2_Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US118_AA_EmployeePage_Page {


    public US118_AA_EmployeePage_Page(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> employeesPageMenu;

    @FindBy(xpath = "(//a[@class='main-buttons-item-link'])[4]")
    public List<WebElement> moreOptions;

    public static List<String> pageMenuOptions(List<WebElement> modulesOption, String attributeValue){
        List<String> result = new ArrayList<>();
        for (WebElement each : modulesOption) {
            if (each.getAttribute("class").equals(attributeValue)){
               result.add(each.getText());

            }
        }

        return result;
    }


    @FindBy(id = "pagetitle")
    public WebElement companyStructure;


}
