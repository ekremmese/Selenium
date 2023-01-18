package com.cydeo.tests.day5_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }


    @Test
    public void simpleDropdown() {


        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //3. Verify “Simple dropdown” default selected value is correct

        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));  //creates the object from select class

        WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption(); //locates the 1st option of dropdown and stores as a Web Element

        //Expected: “Please select an option”
        String expectedSimpleDropdownText = "Please select an option";
        String actualSimpledDropdownText = currentlySelectedOption.getText();  //gets the text of currently selected option

        Assert.assertEquals(expectedSimpleDropdownText,actualSimpledDropdownText);  // compares two values with Assertions


        //4. Verify “State selection” default selected value is correct

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        currentlySelectedOption = stateDropdown.getFirstSelectedOption();

        String expectedStateDropdownText = "Select a State";
        String actualStateDropdownText = currentlySelectedOption.getText(); //we can skip this line and combine it in line 57

        Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);


        //Expected: “Select a State”


    }
}
