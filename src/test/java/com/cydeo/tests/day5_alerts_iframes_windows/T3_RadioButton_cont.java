package com.cydeo.tests.day5_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {

    public static void main(String[] args) {
        //TC #3: Utility method task for (continuation of Task2)
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in a List of Web Element

        // List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

        //Loop through the List of WebElement and select matching result "hockey"
/*
        for (WebElement each : sportRadioButtons) {
            String eachID = each.getAttribute("id");
            System.out.println(eachID);
            if (eachID.equals("hockey")) {
                each.click();
                System.out.println("Hockey is selected: " + each.isSelected());
                break;
            }
        }

 */


        clickAndVerifyRadioButton(driver, "sport", "hockey");

        //3. Click to “Hockey” radio button


        //4. Verify “Hockey” radio button is selected after clicking.
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


        //Create a utility method to handle above logic.
        //Method name: clickAndVerifyRadioButton
        //Return type: void or boolean
        //Method args:
        //1. WebDriver
        //2. Name attribute as String (for providing which group of radio buttons)
        //3. Id attribute as String (for providing which radio button to be clicked)
        //Method should loop through the given group of radio buttons. When it finds the
        //matching option, it should click and verify option is Selected.
        //Print out verification: true
    }

    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        //2. Name attribute as String (for providing which group of radio buttons)
        List<WebElement> sportRadioButtons = driver.findElements(By.name(nameAttribute));
        for (WebElement each : sportRadioButtons) {
            String eachID = each.getAttribute("id");
            if (eachID.equals(idValue)) {
                each.click();
                System.out.println(eachID + " is selected: " + each.isSelected());
                break;
            }

        }

    }

}
