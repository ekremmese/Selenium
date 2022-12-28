package com.cydeo.tests.day3_;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_getTExt {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        
        //driver.findElement(By.className("login-inp")).sendKeys("incorrect"); //This is also possible, but it will not be reusable for the future
         
        WebElement userNameInputBox = driver.findElement(By.className("login-inp"));
        userNameInputBox.sendKeys("incorrect");


        //4- Enter incorrect password: “incorrect”
        //WebElement user_password = driver.findElement(By.name("USER_PASSWORD")); //This is also possible, but it will not be reusable for the future


        WebElement passwordInoutBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordInoutBox.sendKeys("incorrect");

        //5- Click to login button.
        WebElement clickButton = driver.findElement(By.className("login-btn"));
        clickButton.click();


        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        /*
        WebElement errortext = driver.findElement(By.className("errortext")); // We located web element
        String actualMessage = errortext.getText();  // We will get the text of located web element
         */

        String actualMessage = driver.findElement(By.className("errortext")).getText();  //Here I combined the line 46 and47 in one line
        String expectedMessage = "Incorrect login or password";

        if(expectedMessage.equals(actualMessage)){
            System.out.println("Error Message Verification is PASSED!");
        } else  {
            System.out.println("Error Message Verification is FAILED!");
        }


        //PS: Inspect and decide which locator you should be using to locate web
        //elements.


    }
}
