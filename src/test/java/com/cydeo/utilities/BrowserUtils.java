package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
    This method will accept int (int seconds) and execute Thread.sleep for given duration
     */
    public static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e){

        }
    }

    /*
This method accepts 3 arguments
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl : for verify if the url contains given String
-If condition matches, will break loop
• Arg3: String expectedTitle to be compared against actualTitle
     */

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();


        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().equals(expectedInUrl)) {
                break;
            }

        }

        //5. Assert: Title contains "expectedInTitle"
        String actualTitle = driver.getTitle();
        String expectedInTitle = expectedTitle;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
    /*
    This method accepts a String "expectedTitle"
 and Asserts if it is true      */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    /*
    wait for invisibility
     */

    public static void waitForInvisibilityOf(WebElement webElement){

        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));

    }


}
