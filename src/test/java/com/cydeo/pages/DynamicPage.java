package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicPage {

    public DynamicPage(){

          /*
        initElements method will create connection in between the current driver session (instance) and the object of the current class.
         */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( xpath = "//strong[.='Done!']")
    public WebElement doneMessage;

    @FindBy ( xpath = "//img[@alt='square pants']")
    public WebElement image;

    @FindBy (xpath = "//title[.='Dynamic title']")
    public WebElement title;




}
