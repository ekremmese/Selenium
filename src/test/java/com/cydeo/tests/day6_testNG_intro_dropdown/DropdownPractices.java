package com.cydeo.tests.day6_testNG_intro_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void dropdown_task5() throws InterruptedException {
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown


        driver.get("http://practice.cybertekschool.com/dropdown");

        //we located the dropdown and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        //Thread.sleep(1500);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        //Thread.sleep(1500);
        stateDropdown.selectByValue("VA");

        //5. Select California
        //Thread.sleep(1500);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);


        //Use all Select options. (visible text, value, index)

    }

    @Test
    public void DropDownPractie(){
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown


        driver.get("https://practice.cydeo.com/dropdown");


        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using : visible text
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1924");

        //Select month using : value attribute
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("11");

        //Select day using : index number
        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropDown.selectByIndex(0);

        //verifying
        //creating expected values
        String expectedYear = "1924";
        String expectedMonth = "December";
        String expectedDay = "1";

        //creating actual values
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropDown.getFirstSelectedOption().getText();

        //creating assertions
        Assert.assertEquals(expectedYear,actualYear);
        Assert.assertEquals(expectedDay,actualDay);
        Assert.assertEquals(expectedMonth,actualMonth);

        //creating assertions with assertTrue();

        Assert.assertTrue(expectedDay.equals(actualDay));
       // Assert.assertTrue(expectedMonth==actualMonth);
        //Assert.assertTrue(expectedYear==actualYear);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}
