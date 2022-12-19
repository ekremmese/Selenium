package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getTextAnd_getAttribute {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");


        //3- Verify header text is as expected:
        //Expected: Registration form
        String expectedHeader = "Registration form";

        //this line finds the header by using tagname locator and with the getText method we get text of it and assign to our variable
        String actualHeader = driver.findElement(By.tagName("h2")).getText();

        System.out.println(actualHeader);

        if (expectedHeader.equals(actualHeader)) {
            System.out.println("Header Verification Passed!");
        } else {
            System.out.println("Header Verification Failed!");
        }


        //4- Locate “First name” input box
        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name

        String expectedAttribute = "first name";
        String actualAttribute = driver.findElement(By.name("firstname")).getAttribute("placeholder");

        System.out.println(actualAttribute);

        if (expectedAttribute.equals(actualAttribute)) {
            System.out.println("Header Verification Passed!");
        } else {
            System.out.println("Header Verification Failed");
        }


    }
}
