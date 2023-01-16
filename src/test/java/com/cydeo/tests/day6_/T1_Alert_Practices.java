package com.cydeo.tests.day6_;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #1: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void T1_InformationAlertPractice(){

        //3. Click to “Click for JS Alert” button
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();

        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.

        WebElement resultText = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));

        String expectedText = "You successfully clicked an alert";
        String actualText =resultText.getText();

        Assert.assertTrue(expectedText.equals(actualText), "Actual result is not as expected.");

        //Failure message will only be displayed if assertion fails: ....Text.....
        Assert.assertTrue(resultText.isDisplayed(), " Result text is NOT displayed.");


    }


}
