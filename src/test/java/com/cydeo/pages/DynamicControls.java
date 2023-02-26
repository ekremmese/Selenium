package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControls {

    public DynamicControls(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy ( xpath = "//button[.='Remove']")
    public WebElement removeButton;

    //@FindBy (xpath = "//div[@id='loading']")
    @FindBy (css = "div#loading")
    public WebElement loadingBar;

    @FindBy (xpath = "//p[@id='message']")
    public WebElement goneMessage;

    @FindBy (xpath = "//button[.='Enable']")
    public WebElement enableButton;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement inputBox;



}
