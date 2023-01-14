package com.cydeo.tests.day5_;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementReferenceTask {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/add_remove_elements/

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button

        WebElement addElementButton = driver.findElement(By.xpath("//button[contains(@onclick, 'add')]"));
        addElementButton.click();

        Thread.sleep(2000);
        //  //button[.='Delete']
        //4. Verify “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //5. Click to “Delete” button.

        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.

        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }  catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException exception is thrown");
            System.out.println("---> This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");
        }


        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


    }


}


//1:34:08
