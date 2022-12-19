package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library {

    public static void main(String[] args) {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        //WebElement emailAddressBox = driver.findElement(By.id("inputEmail"));  // this is my solution. I did locate both of them with id, Because id is always(even it is dynamic) unique
        WebElement emailAddressBox= driver.findElement(By.className("form-control"));
        emailAddressBox.sendKeys("incorrect@email.com" + Keys.TAB);




        //4. Enter password: “incorrect password”
        //5.Click to Sign in button
        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("incorrect password" + Keys.ENTER);



        //6. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator

    }




}
